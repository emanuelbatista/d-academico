/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.ifpb.dac.dacademico.web.managers;

import com.edu.ifpb.dac.dacademico.core.servico.duvida.DuvidaService;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Duvida;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Rafael
 */
@Named(value = "duvidaManager")
@SessionScoped
public class DuvidaManager implements Serializable{
    @EJB
    private DuvidaService duvidaService;
    private String titulo;
    private String descrição;
    
    public void Save(){
        Duvida d = new Duvida();
        d.setTitulo(titulo);
        d.setDescricao(descrição);
        duvidaService.salvar(d);
    }
    
    public List<Duvida> listAll(){
        return duvidaService.listarTodos();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    
    
}
