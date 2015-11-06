package com.edu.ifpb.dac.dacademico.desktop.controladores;

import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.SenhaErradaException;
import com.edu.ifpb.dac.dacademico.core.servico.administrador.AdminService;
import com.edu.ifpb.dac.dacademico.desktop.lookup.LookupPath;
import com.edu.ifpb.dac.dacademico.desktop.lookup.LookupService;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Administrador;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class LoginController{

    private AdminService service = LookupService.lookup(LookupPath.ADMIN_SERVICE, AdminService.class);
    
    public Administrador login(String login, String senha)
            throws LoginInexistenteException, SenhaErradaException {
            return service.login(login, senha);
    }

}
