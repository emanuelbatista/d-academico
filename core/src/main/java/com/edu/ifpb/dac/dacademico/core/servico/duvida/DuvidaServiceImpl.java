/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.ifpb.dac.dacademico.core.servico.duvida;

import com.edu.ifpb.dac.dacademico.entidades.dominio.Duvida;
import com.edu.ifpb.dac.dacademico.core.dao.Dao;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Rafael
 */
@Stateless
@Remote(DuvidaService.class)
public class DuvidaServiceImpl implements DuvidaService{
    
    @EJB
    private Dao<Duvida, Long> repositorio;

    @Override
    public void salvar(Duvida duvida) {
        repositorio.salvar(duvida);
    }

    @Override
    public List<Duvida> listarTodos() {
        return repositorio.listarTodos(Duvida.class);
    }
    
}
