package com.edu.ifpb.dac.dacademico.core.servico.professor;

import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.SenhaErradaException;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Professor;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.Dao;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.GenericoDaoJPA;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.inject.Named;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Named
public class ProfessorServiceImpl implements ProfessorService {

    private Dao<Professor, Long> repositorio;

    public ProfessorServiceImpl(String unidadePersistencia) {
        repositorio = new GenericoDaoJPA<>(unidadePersistencia);
    }
    
    @Override
    public Professor login (String login, String senha) 
            throws LoginInexistenteException, SenhaErradaException{
        Professor professor = repositorio.buscarPorAtributo(Professor.class, "email", login).get(0);
        if (professor == null)
            throw new LoginInexistenteException();
        if (!professor.getSenha().equals(senha))
            throw new SenhaErradaException();
        return professor;
    }

    @Override
    public void salvar(Professor professor) {
        repositorio.salvar(professor);
    }

    @Override
    public void remover(Professor professor) {
        repositorio.remover(professor);
    }

    @Override
    public Professor buscar(long id) {
        return repositorio.buscar(Professor.class, id);
    }

    @Override
    public void atualizar(Professor professor) {
        repositorio.atualizar(professor);
    }

    @Override
    public void urlParaBanco(String host) throws MalformedURLException, IOException {
        URL url = new URL(host);
        JsonReader jsonReader = Json.createReader(url.openStream());
        JsonObject object = jsonReader.readObject();
        jsonReader.close();
        JsonArray array = object.getJsonArray("data");
        for (int i = 0; i < array.size(); i++) {
            Professor professor = new Professor();
            JsonObject obj = array.getJsonObject(i);
            professor.setCod(Integer.parseInt(obj.getString("codigo")));
            professor.setEmail(obj.getString("email"));
            professor.setLogin(obj.getString("email"));
            professor.setNomeCompleto(obj.getString("nome"));
            professor.setRegime(obj.getString("regime"));
            professor.setSenha(obj.getString("codigo"));
            professor.setUnidade(obj.getString("unidade"));
            try {
                repositorio.salvar(professor);
            } catch (Exception e) {
                System.out.println(obj.getString("email"));
                e.printStackTrace();
            }
        }
    }

}
