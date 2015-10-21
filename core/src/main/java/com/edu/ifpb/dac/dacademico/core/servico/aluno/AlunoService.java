package com.edu.ifpb.dac.dacademico.core.servico.aluno;

import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.SenhaErradaException;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Aluno;

/**
 *
 * @author douglasgabriel
 */
public interface AlunoService {
    
    void salvar (Aluno aluno);
    
    public Aluno login (String login, String senha) 
            throws LoginInexistenteException, SenhaErradaException;
}
