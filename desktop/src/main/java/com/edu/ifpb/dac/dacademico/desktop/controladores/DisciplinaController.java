package com.edu.ifpb.dac.dacademico.desktop.controladores;

import com.edu.ifpb.dac.dacademico.core.servico.curso.CursoService;
import com.edu.ifpb.dac.dacademico.core.servico.curso.CursoServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.disciplina.DisciplinaService;
import com.edu.ifpb.dac.dacademico.core.servico.disciplina.DisciplinaServiceImpl;
import com.edu.ifpb.dac.dacademico.desktop.Configuracoes;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Curso;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Disciplina;
import java.util.List;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class DisciplinaController {

    private DisciplinaService disciplinaService = new DisciplinaServiceImpl(Configuracoes.UNIDADE_PERSISTENCIA_DEFAULT);
    private CursoService cursoService = new CursoServiceImpl(Configuracoes.UNIDADE_PERSISTENCIA_DEFAULT);
    
    public void cadastrar (Disciplina disciplina){
        disciplinaService.salvar(disciplina);
    }
    
    public void atualizar (Disciplina disciplina){
        disciplinaService.atualizar(disciplina);
    }
    
    public List<Curso> listarCursos (){
        cursoService.listarTodos();
    }
    
    public Curso recuperarCursoPelaDescricao (String descricao){
        cursoService.recuperarPelaDescricao(descricao);
    }
}
