/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ifpb.dac.dacademico.core.servico.atividade;

import com.edu.ifpb.dac.dacademico.entidades.dominio.Atividade;
import java.util.List;

/**
 *
 * @author Emanuel Batista da Silva Filho - https://github.com/emanuelbatista
 */
public interface AtividadeService {
    
    
    public Atividade buscar(Long id);

    public void salvar(Atividade atividade);

    public void atualizar(Atividade atividade);

    public List<Atividade> listar();
    
    public void remover(Atividade atividade);

}
