package com.edu.ifpb.dac.dacademico.core.servico.disciplina;

import com.edu.ifpb.dac.dacademico.core.exceptions.EntidadeInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.core.servico.curso.CursoService;
import com.edu.ifpb.dac.dacademico.core.servico.curso.CursoServiceImpl;
import com.edu.ifpb.dac.dacademico.core.validacao.HibernateValidacao;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Curso;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Disciplina;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.Dao;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.GenericoDaoJPA;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class DisciplinaServiceImpl implements DisciplinaService {

    private Dao<Disciplina, Long> disciplinaRepositorio;
    private CursoService cursoService;

    public DisciplinaServiceImpl(String unidadePersistencia) {
        this.disciplinaRepositorio = new GenericoDaoJPA<>(unidadePersistencia);
        this.cursoService = new CursoServiceImpl(unidadePersistencia);
    }

    @Override
    public void salvar(Disciplina disciplina) throws ValidacaoException {
        validarDisciplina(disciplina);
        disciplinaRepositorio.salvar(disciplina);
    }

    @Override
    public void remover(Disciplina disciplina) {
        disciplinaRepositorio.remover(disciplina);
    }

    @Override
    public Disciplina buscar(long id) {
        return disciplinaRepositorio.buscar(Disciplina.class, id);
    }

    @Override
    public void atualizar(Disciplina disciplina) throws ValidacaoException {
        validarDisciplina(disciplina);
        disciplinaRepositorio.atualizar(disciplina);
    }

    private void validarDisciplina(Disciplina disciplina) throws ValidacaoException {
        List<com.edu.ifpb.dac.dacademico.core.aux.Error<Disciplina>> erros = HibernateValidacao.<Disciplina>validar(disciplina);
        if (!erros.isEmpty()) {
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
            Disciplina disciplina = new Disciplina();
            JsonObject obj = array.getJsonObject(i);
            disciplina.setCod(Integer.parseInt(obj.getString("codigo")));
            try {
                disciplina.setCurso(cursoService.buscar(Long.parseLong(obj.getString("curso"))));
            } catch (EntidadeInexistenteException ex) {
                Logger.getLogger(DisciplinaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            disciplina.setDescricao(obj.getString("descricao"));
            disciplina.setAbreviacao(obj.getString("abreviacao"));
            disciplina.setPeriodo(Integer.parseInt(obj.getString("periodo")));
            disciplina.setCargaHoraria(Integer.parseInt(obj.getString("carga_horaria")));
            disciplina.setAulasPorSemana(Integer.parseInt(obj.getString("aulas_semana")));
            try {
                disciplinaRepositorio.salvar(disciplina);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<Disciplina> listarTodos() {
        return disciplinaRepositorio.listarTodos(Disciplina.class);
    }

}
