package com.edu.ifpb.dac.dacademico.core.servico.aluno;

import com.edu.ifpb.dac.dacademico.core.servico.administrador.*;
import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.SenhaErradaException;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Administrador;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Aluno;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.Dao;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.GenericoDaoJPA;
import java.util.List;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class AlunoServiceImpl implements AlunoService{

    private Dao<Aluno, Long> repositorio;

    public AlunoServiceImpl(String unidadePersistencia) {
        this.repositorio = new GenericoDaoJPA<>(unidadePersistencia);
    }
    
    @Override
    public void salvar(Aluno aluno) {
        if (repositorio.buscarPorAtributo(Aluno.class, "login", aluno.getLogin()) != null)
            repositorio.salvar(aluno);
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
