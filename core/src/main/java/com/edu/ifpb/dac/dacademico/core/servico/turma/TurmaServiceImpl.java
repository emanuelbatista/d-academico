package com.edu.ifpb.dac.dacademico.core.servico.turma;

import com.edu.ifpb.dac.dacademico.entidades.dominio.Curso;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Disciplina;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Professor;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Turma;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.Dao;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.GenericoDaoJPA;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class TurmaServiceImpl implements TurmaService{

    private Dao<Turma, Long> turmaRepositorio;
    private Dao<Disciplina, Long> disciplinaRepositorio;
    private Dao<Professor, Long> professorRepositorio;
    private Dao<Curso, Long> cursoRepositorio;

    public TurmaServiceImpl(String unidadePersistencia) {
        this.turmaRepositorio = new GenericoDaoJPA<>(unidadePersistencia);
        this.disciplinaRepositorio = new GenericoDaoJPA<>(unidadePersistencia);
        this.cursoRepositorio = new GenericoDaoJPA<>(unidadePersistencia);
        this.professorRepositorio = new GenericoDaoJPA<>(unidadePersistencia);
    }
    
    @Override
    public void salvar(Turma turma) {
        turmaRepositorio.salvar(turma);
    }

    @Override
    public void remover(Turma turma) {
        turmaRepositorio.remover(turma);
    }

    @Override
    public Turma buscar(long id) {
        return turmaRepositorio.buscar(Turma.class, id);
    }

    @Override
    public void atualizar(Turma turma) {
        turmaRepositorio.atualizar(turma);
    }

    @Override
    public void urlParaBanco(String host) throws MalformedURLException, IOException {
        URL url = new URL(host);
        JsonReader jsonReader = Json.createReader(url.openStream());
        JsonObject object = jsonReader.readObject();
        jsonReader.close();
        JsonArray array = object.getJsonArray("data");
        for (int i = 0; i < array.size(); i++) {
            Turma turma = new Turma();
            JsonObject obj = array.getJsonObject(i);
            turma.setCod(Integer.parseInt(obj.getString("codigo")));  
            turma.setIdentificacao(obj.getString("identificacao"));      
            turma.setDisciplina(
                    disciplinaRepositorio.buscarPorAtributo(
                            Disciplina.class
                            , "descricao"
                            , obj.getString("disciplina")).get(0)
            );
            turma.setCurso(cursoRepositorio.buscar(Curso.class, Long.parseLong(obj.getString("curso"))));
            turma.setProfessor(professorRepositorio.buscar(Professor.class, Long.parseLong(obj.getString("professor"))));
            try {
                turmaRepositorio.salvar(turma);
            } catch (Exception e) {
                System.out.println(obj.getString("email"));
                e.printStackTrace();
            }
        }
    }
    
}
