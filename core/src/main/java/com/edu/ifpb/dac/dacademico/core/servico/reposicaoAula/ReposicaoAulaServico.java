/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.ifpb.dac.dacademico.core.servico.reposicaoAula;

import com.edu.ifpb.dac.dacademico.entidades.dominio.ReposicaoAula;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 *
 * @author Rafael
 */
public interface ReposicaoAulaServico {
    void salvar(ReposicaoAula reposicao);
    void remover (ReposicaoAula reposicao);
    ReposicaoAula buscar (long id);
    void atualizar (ReposicaoAula turma);
}
