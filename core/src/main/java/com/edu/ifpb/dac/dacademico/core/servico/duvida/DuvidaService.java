/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.ifpb.dac.dacademico.core.servico.duvida;

import com.edu.ifpb.dac.dacademico.entidades.dominio.Duvida;
import java.util.List;

/**
 *
 * @author Rafael
 */
public interface DuvidaService {
    void salvar(Duvida duvida);
    List<Duvida> listarTodos();
}
