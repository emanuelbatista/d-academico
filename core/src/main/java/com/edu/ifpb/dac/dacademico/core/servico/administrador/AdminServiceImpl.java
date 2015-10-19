package com.edu.ifpb.dac.dacademico.core.servico.administrador;

import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.SenhaErradaException;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Administrador;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.Dao;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.GenericoDaoJPA;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class AdminServiceImpl implements AdminService{

    private Dao<Administrador, Long> repositorio;

    public AdminServiceImpl(String unidadePersistencia) {
        this.repositorio = new GenericoDaoJPA<>(unidadePersistencia);
    }
    
    @Override
    public void salvar(Administrador admin) {
        repositorio.salvar(admin);
    }
    
    @Override
    public Administrador login (String login, String senha) 
            throws LoginInexistenteException, SenhaErradaException{
        Administrador admin = repositorio.buscarPorAtributo(Administrador.class, "login", login).get(0);
        if (admin == null)
            throw new LoginInexistenteException();
        if (!admin.getSenha().equals(senha))
            throw new SenhaErradaException();
        return admin;
    }

}
