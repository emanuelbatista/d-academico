package com.edu.ifpb.dac.dacademico.core.servico.curso;

import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.core.validacao.HibernateValidacao;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Curso;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.Dao;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.GenericoDaoJPA;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
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
    public void salvar(Curso curso) throws ValidacaoException{
        validarCurso(curso);
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
    public void atualizar(Curso curso) throws ValidacaoException{
        validarCurso(curso);
        repositorio.atualizar(curso);
    }
    
    private void validarCurso(Curso curso) throws ValidacaoException{
        List<com.edu.ifpb.dac.dacademico.core.aux.Error<Curso>> erros=HibernateValidacao.<Curso>validar(curso);
        if(!erros.isEmpty()){
            throw new ValidacaoException(erros);
        }
        
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
