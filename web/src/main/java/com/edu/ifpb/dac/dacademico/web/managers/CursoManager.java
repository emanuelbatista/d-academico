/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.ifpb.dac.dacademico.web.managers;

import com.edu.ifpb.dac.dacademico.core.servico.curso.CursoServiceRemote;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Curso;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Rafael
 */

@Named(value = "cursoManager")
@SessionScoped
public class CursoManager implements Serializable{
    @EJB
    private CursoServiceRemote cursoService;
    
    public List<Curso> listAll(){
        return cursoService.listarTodos();
    }
    
    
}
