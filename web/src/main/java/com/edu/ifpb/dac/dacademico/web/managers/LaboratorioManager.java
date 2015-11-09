/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.ifpb.dac.dacademico.web.managers;

import com.edu.ifpb.dac.dacademico.core.servico.sala.SalaService;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Laboratorio;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Rafael
 */

@Named(value = "laboratorioManager")
@RequestScoped
public class LaboratorioManager implements Serializable{
    @EJB
    private SalaService labService;
    
    public List<Laboratorio> listAll(){
        return labService.listarTodosLaboratorios();
    }
}
