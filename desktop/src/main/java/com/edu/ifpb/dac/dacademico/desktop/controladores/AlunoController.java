package com.edu.ifpb.dac.dacademico.desktop.controladores;

import com.edu.ifpb.dac.dacademico.core.servico.aluno.AlunoService;
import com.edu.ifpb.dac.dacademico.core.servico.aluno.AlunoServiceImpl;
import com.edu.ifpb.dac.dacademico.desktop.Configuracoes;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Aluno;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class AlunoController {

    private AlunoService service = new AlunoServiceImpl(Configuracoes.UNIDADE_PERSISTENCIA_DEFAULT);
    
    public void cadastrar (Aluno aluno){
        service.salvar(aluno);
    }
    
}
