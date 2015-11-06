package com.edu.ifpb.dac.dacademico.core.servico.reposicaoAula;

import com.edu.ifpb.dac.dacademico.entidades.dominio.ReposicaoAula;
import com.edu.ifpb.dac.dacademico.core.dao.Dao;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Rafael
 */
@Stateless
@Remote(ReposicaoAulaServico.class)
public class ReposicaoAulaServicoImpl implements ReposicaoAulaServico{

    @EJB
    private Dao<ReposicaoAula, Long> reposicaoAulaRepositorio;
    
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
