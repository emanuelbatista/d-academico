/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ifpb.dac.dacademico.core.servico.aluno;

import com.edu.ifpb.dac.dacademico.core.exceptions.EntidadeInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.SenhaErradaException;
import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Aluno;
import java.util.List;

/**
 *
<<<<<<< HEAD
 * @author Emanuel Batista da Silva Filho - emanuelbatista2011@gmail.com
 */
public interface AlunoService {
    
    void salvar (Aluno aluno) throws ValidacaoException;
    
    Aluno recuperarPeloLogin (String login) throws LoginInexistenteException;
    
    Aluno recuperarPelaMatricula (String matricula) throws EntidadeInexistenteException;
    
    void remover (Aluno aluno);
    
    void atualizar (Aluno aluno) throws ValidacaoException;
    
    List<Aluno> listarTodos();
    
    public Aluno login (String login, String senha) 
            throws LoginInexistenteException, SenhaErradaException;
}
