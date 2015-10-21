package com.edu.ifpb.dac.dacademico.desktop.controladores;

import com.edu.ifpb.dac.dacademico.core.servico.professor.ProfessorService;
import com.edu.ifpb.dac.dacademico.core.servico.professor.ProfessorServiceImpl;
import com.edu.ifpb.dac.dacademico.desktop.Configuracoes;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Professor;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class ProfessorController {

    private ProfessorService service = new ProfessorServiceImpl(Configuracoes.UNIDADE_PERSISTENCIA_DEFAULT);
    
    public void cadastrar (Professor professor){
        service.salvar(professor);
    }
    
}
