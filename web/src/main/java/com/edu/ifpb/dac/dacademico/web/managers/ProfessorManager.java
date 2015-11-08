/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.ifpb.dac.dacademico.web.managers;

import com.edu.ifpb.dac.dacademico.core.servico.professor.ProfessorService;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Professor;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Rafael
 */
@Named(value = "professorManager")
@SessionScoped
public class ProfessorManager implements Serializable{
    @EJB
    private ProfessorService professorService;
    
    public List<Professor> listAll(){
        return professorService.listarTodos();
    }
}
