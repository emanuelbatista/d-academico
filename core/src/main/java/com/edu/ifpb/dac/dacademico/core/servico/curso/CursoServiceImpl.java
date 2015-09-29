package com.edu.ifpb.dac.dacademico.core.servico.curso;

import com.edu.ifpb.dac.dacademico.entidades.dominio.Curso;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.Dao;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.GenericoDaoJPA;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class CursoServiceImpl implements CursoService{

    private Dao<Curso, Long> repositorio;

    public CursoServiceImpl(String unidadePersistencia) {
        this.repositorio = new GenericoDaoJPA<>(unidadePersistencia);
    }

    @Override
    public void salvar(Curso curso) {
        repositorio.salvar(curso);
    }

    @Override
    public void remover(Curso curso) {
        repositorio.remover(curso);
    }

    @Override
    public Curso buscar(long id) {
        return repositorio.buscar(Curso.class, id);
    }

    @Override
    public void atualizar(Curso curso) {
        repositorio.atualizar(curso);
    }

    @Override
    public void urlParaBanco(String host) throws MalformedURLException, IOException {
        URL url = new URL(host);
        JsonReader jsonReader = Json.createReader(url.openStream());
        JsonObject object = jsonReader.readObject();
        jsonReader.close();
        JsonArray array = object.getJsonArray("data");
        for (int i = 0; i < array.size(); i++) {
            Curso curso = new Curso();
            JsonObject obj = array.getJsonObject(i);
            curso.setCod(Integer.parseInt(obj.getString("codigo")));
            curso.setUnidade(obj.getString("unidade"));
            curso.setDescricao(obj.getString("descricao"));
            curso.setAbreviacao(obj.getString("abreviacao"));
            curso.setPeriodo(Integer.parseInt(obj.getString("periodos")));
            try {
                repositorio.salvar(curso);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
