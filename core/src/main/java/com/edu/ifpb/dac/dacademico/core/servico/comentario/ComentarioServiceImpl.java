/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.ifpb.dac.dacademico.core.servico.comentario;

import com.edu.ifpb.dac.dacademico.core.dao.Dao;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Comentario;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Rafael
 */
@Stateless
@Remote(ComentarioService.class)
public class ComentarioServiceImpl implements ComentarioService{
    
    @EJB
    private Dao<Comentario, Long> repositorio;
    
    @Override
    public void salvar(Comentario comentario) {
        repositorio.salvar(comentario);
    }

    @Override
    public List<Comentario> listarTodos(Long cod) {
        return repositorio.buscarPorAtributo(Comentario.class, "cod", cod);
    }
    
}
