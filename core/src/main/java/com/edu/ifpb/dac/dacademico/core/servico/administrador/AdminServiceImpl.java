package com.edu.ifpb.dac.dacademico.core.servico.administrador;

import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.SenhaErradaException;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Administrador;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.Dao;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.GenericoDaoJPA;
import java.util.List;

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
        if (repositorio.buscarPorAtributo(Administrador.class, "login", admin.getLogin()) != null)
            repositorio.salvar(admin);
    }
    
    @Override
    public Administrador login (String login, String senha) 
            throws LoginInexistenteException, SenhaErradaException{
        List<Administrador> resultado = repositorio.buscarPorAtributo(Administrador.class, "login", login);
        if (resultado == null || resultado.isEmpty())
            throw new LoginInexistenteException();
        Administrador admin = resultado.get(0);
        if (!admin.getSenha().equals(senha))
            throw new SenhaErradaException();
        return admin;
    }

}
