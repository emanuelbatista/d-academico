package com.edu.ifpb.dac.dacademico.core.servico.professor;

import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.SenhaErradaException;
import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Professor;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

/**
 *
 * @author douglasgabriel
 */
public interface ProfessorService {
    
    public Professor login (String login, String senha) 
            throws LoginInexistenteException, SenhaErradaException;
    void salvar(Professor professor) throws ValidacaoException;
    void remover (Professor professor);
    Professor recuperarPeloLogin(String login) throws LoginInexistenteException;
    List<Professor> listarTodos();
    Professor buscar (long id);
    void atualizar (Professor professor) throws ValidacaoException;
    void urlParaBanco(String host) throws MalformedURLException, IOException;
    
}
