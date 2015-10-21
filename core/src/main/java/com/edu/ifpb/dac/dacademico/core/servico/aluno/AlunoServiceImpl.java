
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ifpb.dac.dacademico.core.servico.aluno;

import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.SenhaErradaException;
import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.core.validacao.HibernateValidacao;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Aluno;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.Dao;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.GenericoDaoJPA;
import java.util.List;

/**
 *
 * @author Emanuel Batista da Silva Filho - emanuelbatista2011@gmail.com
 */
public class AlunoServiceImpl implements AlunoService{
    
     private Dao<Aluno, Long> repositorio;


    public AlunoServiceImpl(String unidadePersistencia) {
        this.repositorio = new GenericoDaoJPA<>(unidadePersistencia);
    }
     
     

    @Override
    public void salvar(Aluno aluno) throws ValidacaoException {
        validarAdmin(aluno);
        repositorio.salvar(aluno);
    }

    private void validarAdmin(Aluno aluno) throws ValidacaoException {
        String email = aluno.getEmail();
        String login = aluno.getLogin();
        List<com.edu.ifpb.dac.dacademico.core.aux.Error<Aluno>> errors = HibernateValidacao.<Aluno>validar(aluno);
        if (repositorio.buscarPorAtributo(Aluno.class, "login", login) != null) {
            com.edu.ifpb.dac.dacademico.core.aux.Error<Aluno> error = new com.edu.ifpb.dac.dacademico.core.aux.Error();
            error.setField("login");
            error.setMessage("Esse login já está cadastrado");
            error.setRootBean(aluno);
            errors.add(error);
        }
        if (repositorio.buscarPorAtributo(Aluno.class, "email", email) != null) {
            com.edu.ifpb.dac.dacademico.core.aux.Error<Aluno> error = new com.edu.ifpb.dac.dacademico.core.aux.Error<>();
            error.setField("email");
            error.setMessage("Esse email já está cadastrado");
            errors.add(error);
        }
        if (!errors.isEmpty()) {
            throw new ValidacaoException(errors);
        }
    }
    
    
    @Override
    public Aluno login (String login, String senha) 
            throws LoginInexistenteException, SenhaErradaException{
        List<Aluno> resultado = repositorio.buscarPorAtributo(Aluno.class, "login", login);
        if (resultado == null || resultado.isEmpty())
            throw new LoginInexistenteException();
        Aluno aluno = resultado.get(0);
        if (!aluno.getSenha().equals(senha))
            throw new SenhaErradaException();
        return aluno;
    }
}
