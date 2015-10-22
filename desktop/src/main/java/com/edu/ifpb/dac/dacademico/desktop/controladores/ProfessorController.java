package com.edu.ifpb.dac.dacademico.desktop.controladores;

import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.core.servico.professor.ProfessorService;
import com.edu.ifpb.dac.dacademico.core.servico.professor.ProfessorServiceImpl;
import com.edu.ifpb.dac.dacademico.desktop.Configuracoes;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Professor;
import java.util.List;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class ProfessorController {

    private ProfessorService service = new ProfessorServiceImpl(Configuracoes.UNIDADE_PERSISTENCIA_DEFAULT);
    
    public void cadastrar (Professor professor)throws ValidacaoException{
            service.salvar(professor);
    }
    
    public void atualizar (Professor professor) throws ValidacaoException{
        service.atualizar(professor);
    }
    
    public void remover (Professor professor){
        service.remover(professor);
    }
    
    public Professor recuperarPeloLogin (String login) throws LoginInexistenteException{
        return service.recuperarPeloLogin(login);
    }
    
    public List<Professor> listarTodos(){
        return service.listarTodos();
    }
    
}
