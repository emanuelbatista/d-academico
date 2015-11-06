package com.edu.ifpb.dac.dacademico.desktop.controladores;

import com.edu.ifpb.dac.dacademico.core.exceptions.EntidadeInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.core.servico.curso.CursoServiceRemote;
import com.edu.ifpb.dac.dacademico.desktop.lookup.LookupPath;
import com.edu.ifpb.dac.dacademico.desktop.lookup.LookupService;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Curso;
import java.util.List;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class CursoController {

    private CursoServiceRemote service = LookupService.lookup(LookupPath.CURSO_SERVICE, CursoServiceRemote.class);
    
    public void cadastro (Curso curso) throws ValidacaoException{
        service.salvar(curso);
    }
    
    public void atualizar (Curso curso) throws ValidacaoException{
        service.atualizar(curso);
    }
    
    public void remover (Curso curso){
        service.remover(curso);
    }
    
    public List<Curso> listarTodos (){
        return service.listarTodos();
    }
    
    public Curso recuperar (long cod) throws EntidadeInexistenteException{
        return service.buscar(cod);
    }
    
}
