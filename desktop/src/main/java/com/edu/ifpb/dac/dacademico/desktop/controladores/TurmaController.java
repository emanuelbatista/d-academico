package com.edu.ifpb.dac.dacademico.desktop.controladores;

import com.edu.ifpb.dac.dacademico.core.exceptions.EntidadeInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.core.servico.aluno.AlunoService;
import com.edu.ifpb.dac.dacademico.core.servico.aluno.AlunoServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.curso.CursoService;
import com.edu.ifpb.dac.dacademico.core.servico.curso.CursoServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.disciplina.DisciplinaService;
import com.edu.ifpb.dac.dacademico.core.servico.disciplina.DisciplinaServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.professor.ProfessorService;
import com.edu.ifpb.dac.dacademico.core.servico.professor.ProfessorServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.turma.TurmaService;
import com.edu.ifpb.dac.dacademico.core.servico.turma.TurmaServiceImpl;
import com.edu.ifpb.dac.dacademico.desktop.Configuracoes;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Aluno;
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
    private AlunoService alunoService = new AlunoServiceImpl(Configuracoes.UNIDADE_PERSISTENCIA_DEFAULT);
    
    public List<Turma> listarTodos (){
        return turmaService.listarTodos();
    }
    
    public void atualizar (Turma turma) throws ValidacaoException{
        turmaService.atualizar(turma);
    }
    
    public Turma recuperar (long cod) throws EntidadeInexistenteException{
        return turmaService.buscar(cod);
    }
    
    public void remover (Turma turma){
        turmaService.remover(turma);
    }
    
    public Turma recuperarPelaIdentificacao (String identificacao) throws EntidadeInexistenteException{
        return turmaService.buscarPelaIdentificacao(identificacao);
    }
    
    public void cadastrar (Turma turma) throws ValidacaoException{
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
        return disciplinaService.buscarPeloCurso(curso);
    }
    
    public Aluno recuperarAlunoPelaMatricula (String matricula) throws EntidadeInexistenteException{
        return alunoService.recuperarPelaMatricula(matricula);
    }
    
}
