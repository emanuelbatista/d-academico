package com.edu.ifpb.dac.dacademico.desktop.controladores;

import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.SenhaErradaException;
import com.edu.ifpb.dac.dacademico.core.servico.administrador.AdminServiceImpl;
import com.edu.ifpb.dac.dacademico.desktop.Configuracoes;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Administrador;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class LoginController{

    public Administrador login(String login, String senha)
            throws LoginInexistenteException, SenhaErradaException {
            return new AdminServiceImpl(Configuracoes.UNIDADE_PERSISTENCIA_DEFAULT).login(login, senha);
    }

}
