/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ifpb.dac.dacademico.core.servico.atividade;

import com.edu.ifpb.dac.dacademico.core.dao.Dao;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Atividade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 *
 * @author Emanuel Batista da Silva Filho - https://github.com/emanuelbatista
 */
@Stateless
@Local(AtividadeService.class)
public class AtividadeServiceImpl implements AtividadeService{

    @EJB
    private Dao<Atividade, Long> dao;

    @Override
    public void salvar(Atividade atividade) {
        dao.salvar(atividade);
    }

    @Override
    public void atualizar(Atividade atividade) {
        dao.atualizar(atividade);
    }

    @Override
    public List<Atividade> listar() {
        return dao.listarTodos(Atividade.class);
    }

    @Override
    public void remover(Atividade atividade) {
        dao.remover(atividade);
    }

    @Override
    public Atividade buscar(Long id) {
        return dao.buscar(Atividade.class,id);
    }

}
