package com.edu.ifpb.dac.dacademico.desktop.controladores;

import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.core.servico.administrador.AdminService;
import com.edu.ifpb.dac.dacademico.core.servico.administrador.AdminServiceImpl;
import com.edu.ifpb.dac.dacademico.desktop.Configuracoes;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Administrador;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class AdminController {

    private AdminService service = new AdminServiceImpl(Configuracoes.UNIDADE_PERSISTENCIA_DEFAULT);
    
    public void cadastrar (Administrador admin) throws ValidacaoException{
            service.salvar(admin);
    }
    
    public void atualizar (Administrador admin){
        try {
            service.atualizar(admin);
        } catch (ValidacaoException ex) {
            ex.getErrors().forEach(System.out::println);
        }
    }
    
    public void remover (Administrador admin){
        service.remover(admin);
    }
    
    public List<Administrador> listarTodos (){
        return service.listarTodos();
    }
    
    public Administrador recuperarPeloLogin (String login) throws LoginInexistenteException{
        return service.recuperarPeloLogin(login);
    }
    
}
