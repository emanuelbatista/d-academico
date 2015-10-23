package com.edu.ifpb.dac.dacademico.desktop.controladores;

import com.edu.ifpb.dac.dacademico.core.servico.curso.CursoService;
import com.edu.ifpb.dac.dacademico.core.servico.curso.CursoServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.disciplina.DisciplinaService;
import com.edu.ifpb.dac.dacademico.core.servico.disciplina.DisciplinaServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.professor.ProfessorService;
import com.edu.ifpb.dac.dacademico.core.servico.professor.ProfessorServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.turma.TurmaService;
import com.edu.ifpb.dac.dacademico.core.servico.turma.TurmaServiceImpl;
import com.edu.ifpb.dac.dacademico.desktop.Configuracoes;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Curso;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Disciplina;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Professor;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Turma;
import java.util.List;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class TurmaController {

    private TurmaService turmaService = new TurmaServiceImpl(Configuracoes.UNIDADE_PERSISTENCIA_DEFAULT);
    private CursoService cursoService = new CursoServiceImpl(Configuracoes.UNIDADE_PERSISTENCIA_DEFAULT);
    private ProfessorService professorService = new ProfessorServiceImpl(Configuracoes.UNIDADE_PERSISTENCIA_DEFAULT);
    private DisciplinaService disciplinaService = new DisciplinaServiceImpl(Configuracoes.UNIDADE_PERSISTENCIA_DEFAULT);
    
    public void atualizar (Turma turma){
        turmaService.atualizar(turma);
    }
    
    public void cadastrar (Turma turma){
        turmaService.salvar(turma);
    }
    
    public List<Curso> listarCursos (){
        return cursoService.listarTodos();
    }
    
    public List<Professor> listarProfessores (){
        return professorService.listarTodos();
    }
    
    public Curso recuperarCursoPelaDescricao (String descricao){
        return cursoService.buscarPorDescricao(descricao);
    }
    
    public List<Disciplina> listarDisciplinasPeloCurso (Curso curso){
        return disciplinaService.recuperarPorCurso(curso);
    }
    
}
