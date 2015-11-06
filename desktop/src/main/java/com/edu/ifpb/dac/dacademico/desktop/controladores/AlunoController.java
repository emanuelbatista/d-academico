package com.edu.ifpb.dac.dacademico.desktop.controladores;

import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.core.servico.aluno.AlunoService;
import com.edu.ifpb.dac.dacademico.core.servico.aluno.AlunoServiceImpl;
import com.edu.ifpb.dac.dacademico.desktop.Configuracoes;
import com.edu.ifpb.dac.dacademico.desktop.lookup.LookupPath;
import com.edu.ifpb.dac.dacademico.desktop.lookup.LookupService;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Aluno;
import java.util.List;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class AlunoController {    
    
    private AlunoService service = LookupService.lookup(LookupPath.ALUNO_SERVICE, AlunoService.class);
    
    public void cadastrar (Aluno aluno) throws ValidacaoException{        
        service.salvar(aluno);        
    }
    
    public void atualizar (Aluno aluno) throws ValidacaoException{
        service.atualizar(aluno);
    }
    
    public void remover (Aluno aluno){
        service.remover(aluno);
    }
    
    public List<Aluno> listarTodos(){
        return service.listarTodos();
    }
    
    public Aluno recuperarPeloLogin (String login) throws LoginInexistenteException{
        return service.recuperarPeloLogin(login);
    }
    
}
