package com.edu.ifpb.dac.dacademico.desktop.controladores;

import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.SenhaErradaException;
import com.edu.ifpb.dac.dacademico.core.servico.professor.ProfessorService;
import com.edu.ifpb.dac.dacademico.core.servico.professor.ProfessorServiceImpl;
import com.edu.ifpb.dac.dacademico.desktop.Configuracoes;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Professor;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class LoginController {

    //TODO: usar injeção de dependencia ao solucionar o problema com a dependencia do JavaEE
    private ProfessorService professorService = new ProfessorServiceImpl(Configuracoes.UNIDADE_PERSISTENCIA_DEFAULT);
    
    public Professor login(String login, String senha) 
            throws LoginInexistenteException, SenhaErradaException{
        return professorService.login(login, senha);
    }
    
}
