/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.ifpb.dac.dacademico.core.servico.reposicaoAula;

import com.edu.ifpb.dac.dacademico.entidades.dominio.Aula;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Horario;
import com.edu.ifpb.dac.dacademico.entidades.dominio.ReposicaoAula;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.Dao;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.GenericoDaoJPA;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 *
 * @author Rafael
 */
public class ReposicaoAulaServicoImpl implements ReposicaoAulaServico{

    private Dao<ReposicaoAula, Long> reposicaoAulaRepositorio;
    
    public ReposicaoAulaServicoImpl(String unidadePersistencia) {
        this.reposicaoAulaRepositorio = new GenericoDaoJPA<>(unidadePersistencia);
    }
    
    @Override
    public void salvar(ReposicaoAula reposicao) {
        reposicaoAulaRepositorio.salvar(reposicao);
    }

    @Override
    public void remover(ReposicaoAula reposicao) {
        reposicaoAulaRepositorio.remover(reposicao);
    }

    @Override
    public ReposicaoAula buscar(long id) {
        return reposicaoAulaRepositorio.buscar(ReposicaoAula.class, id);
    }

    @Override
    public void atualizar(ReposicaoAula turma) {
        reposicaoAulaRepositorio.atualizar(turma);
    }
    
}
