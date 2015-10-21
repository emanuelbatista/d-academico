package com.edu.ifpb.dac.dacademico.desktop.controladores;

import com.edu.ifpb.dac.dacademico.core.servico.administrador.AdminService;
import com.edu.ifpb.dac.dacademico.core.servico.administrador.AdminServiceImpl;
import com.edu.ifpb.dac.dacademico.desktop.Configuracoes;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Administrador;
import java.util.List;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class AdminController {

    private AdminService service = new AdminServiceImpl(Configuracoes.UNIDADE_PERSISTENCIA_DEFAULT);
    
    public void cadastrar (Administrador admin){
        service.salvar(admin);
    }
    
    public List<Administrador> listarTodos (){
        return service.listarTodos();
    }
    
}
