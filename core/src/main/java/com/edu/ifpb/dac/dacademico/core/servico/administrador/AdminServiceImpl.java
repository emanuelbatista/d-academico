package com.edu.ifpb.dac.dacademico.core.servico.administrador;

import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.SenhaErradaException;
import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.core.validacao.HibernateValidacao;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Administrador;
import com.edu.ifpb.dac.dacademico.core.dao.Dao;
import com.edu.ifpb.dac.dacademico.core.errors.Error;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Stateless
@Remote(AdminService.class)
public class AdminServiceImpl implements AdminService, Serializable{

    @EJB
    private Dao<Administrador, Long> repositorio;

    @Override
    public void salvar(Administrador admin) throws ValidacaoException {
        validarAdmin(admin);
        repositorio.salvar(admin);

    }

    private void validarAdmin(Administrador admin) throws ValidacaoException {
        String email = admin.getEmail();
        String login = admin.getLogin();
        List<Error<Administrador>> errors = HibernateValidacao.<Administrador>validar(admin);
        List<Administrador> adminList=repositorio.buscarPorAtributo(Administrador.class, "login", login);
        Administrador adminBanco=repositorio.buscar(Administrador.class, admin.getCod());
        if (!adminList.isEmpty() && admin.getCod()==0 || !adminList.isEmpty() && !adminBanco.getLogin().equals(login)  ) {
            Error<Administrador> error = new Error();
            error.setField("login");
            error.setMessage("Esse login já está cadastrado");
            error.setRootBean(admin);
            errors.add(error);
        }
        adminList=repositorio.buscarPorAtributo(Administrador.class, "email", email);
        if (!adminList.isEmpty() && admin.getCod()==0 || !adminList.isEmpty() && !adminBanco.getEmail().equals(email)) {
            Error<Administrador> error = new Error<>();
            error.setField("email");
            error.setMessage("Esse email já está cadastrado");
            error.setRootBean(admin);
            errors.add(error);
        }
        if (!errors.isEmpty()) {
            throw new ValidacaoException(errors);
        }
    }

    @Override
    public Administrador login(String login, String senha)
            throws LoginInexistenteException, SenhaErradaException {
        List<Administrador> resultado = repositorio.buscarPorAtributo(Administrador.class, "login", login);
        if (resultado == null || resultado.isEmpty()) {
            throw new LoginInexistenteException();
        }
        Administrador admin = resultado.get(0);
        if (!admin.getSenha().equals(senha)) {
            throw new SenhaErradaException();
        }
        return admin;
    }
    
    public List<Administrador> listarTodos (){
        return repositorio.listarTodos(Administrador.class);
    }

    @Override
    public Administrador recuperarPeloLogin(String login) throws LoginInexistenteException{
        try{
            return repositorio.buscarPorAtributo(Administrador.class, "login", login).get(0);
        }catch (Exception e){
            throw new LoginInexistenteException();
        }
    }

    @Override
    public void atualizar(Administrador admin) throws ValidacaoException{
        validarAdmin(admin);
        repositorio.atualizar(admin);
    }

    @Override
    public void remover(Administrador admin) {
        repositorio.remover(admin);
    }

}
