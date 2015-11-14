/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.ifpb.dac.dacademico.web.managers;

import com.edu.ifpb.dac.dacademico.core.servico.comentario.ComentarioService;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Comentario;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Rafael
 */
@Named(value = "comentarioManager")
@SessionScoped
public class ComentarioManager implements Serializable{
    
    @EJB
    private ComentarioService comentarioService;
    private String conteudo;
    
    public String Save(){
        Comentario c = new Comentario();
        c.setConteudo(conteudo);
        return null;
    }
    
    public List<Comentario> listAll(Long cod){
        return comentarioService.listarTodos(cod);
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    
    
}
