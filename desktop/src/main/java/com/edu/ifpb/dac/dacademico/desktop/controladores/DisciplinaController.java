package com.edu.ifpb.dac.dacademico.desktop.controladores;

import com.edu.ifpb.dac.dacademico.core.exceptions.EntidadeInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.core.servico.curso.CursoServiceRemote;
import com.edu.ifpb.dac.dacademico.core.servico.disciplina.DisciplinaService;
import com.edu.ifpb.dac.dacademico.desktop.lookup.LookupPath;
import com.edu.ifpb.dac.dacademico.desktop.lookup.LookupService;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Curso;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Disciplina;
import java.util.List;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class DisciplinaController {

    private DisciplinaService disciplinaService = LookupService.lookup(LookupPath.DISCIPLINA_SERVICE, DisciplinaService.class);
    private CursoServiceRemote cursoService = LookupService.lookup(LookupPath.CURSO_SERVICE, CursoServiceRemote.class);

    public void cadastrar(Disciplina disciplina) throws ValidacaoException {
        disciplinaService.salvar(disciplina);
    }

    public void atualizar(Disciplina disciplina) throws ValidacaoException {
        disciplinaService.atualizar(disciplina);
    }

    public void remover(Disciplina disciplina) {
        disciplinaService.remover(disciplina);
    }

    public Disciplina recuperar(Long cod) throws EntidadeInexistenteException {
        Disciplina disciplina=disciplinaService.buscar(cod);
        if(disciplina!=null){
            return disciplina;
        }
        throw new EntidadeInexistenteException();
    }

    public List<Disciplina> listarTodos() {
        return disciplinaService.listarTodos();
    }

    public List<Curso> listarCursos() {
        return cursoService.listarTodos();
    }

    public Curso recuperarCursoPelaDescricao(String descricao) {
        return cursoService.buscarPorDescricao(descricao);
    }
}
