/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.ifpb.dac.dacademico.web.managers;

import com.edu.ifpb.dac.dacademico.core.servico.sala.SalaService;
import com.edu.ifpb.dac.dacademico.entidades.dominio.SalaNormal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Rafael
 */

@Named(value = "salaManager")
@SessionScoped
public class SalaManager implements Serializable{
    @EJB
    private SalaService salaService;
    
    public List<SalaNormal> listAll(){
        return salaService.listarTodosSalasNormais();
    }
}
