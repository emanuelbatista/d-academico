/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.ifpb.dac.dacademico.core.servico.comentario;

import com.edu.ifpb.dac.dacademico.entidades.dominio.Comentario;
import java.util.List;

/**
 *
 * @author Rafael
 */
public interface ComentarioService {
    void salvar(Comentario comentario);
    List<Comentario> listarTodos(Long cod);
}
