package com.edu.ifpb.dac.dacademico.desktop.controladores;

import com.edu.ifpb.dac.dacademico.core.exceptions.EntidadeInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.core.servico.aluno.AlunoService;
import com.edu.ifpb.dac.dacademico.core.servico.aluno.AlunoServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.aula.AulaServico;
import com.edu.ifpb.dac.dacademico.core.servico.aula.AulaServicoImpl;
import com.edu.ifpb.dac.dacademico.core.servico.curso.CursoServiceRemote;
import com.edu.ifpb.dac.dacademico.core.servico.curso.CursoServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.disciplina.DisciplinaService;
import com.edu.ifpb.dac.dacademico.core.servico.disciplina.DisciplinaServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.horario.HorarioService;
import com.edu.ifpb.dac.dacademico.core.servico.horario.HorarioServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.professor.ProfessorService;
import com.edu.ifpb.dac.dacademico.core.servico.professor.ProfessorServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.reposicaoAula.ReposicaoAulaServico;
import com.edu.ifpb.dac.dacademico.core.servico.reposicaoAula.ReposicaoAulaServicoImpl;
import com.edu.ifpb.dac.dacademico.core.servico.sala.SalaService;
import com.edu.ifpb.dac.dacademico.core.servico.sala.SalaServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.turma.TurmaService;
import com.edu.ifpb.dac.dacademico.core.servico.turma.TurmaServiceImpl;
import com.edu.ifpb.dac.dacademico.desktop.Configuracoes;
import com.edu.ifpb.dac.dacademico.desktop.lookup.LookupPath;
import com.edu.ifpb.dac.dacademico.desktop.lookup.LookupService;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Aluno;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Aula;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Curso;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Disciplina;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Horario;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Laboratorio;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Professor;
import com.edu.ifpb.dac.dacademico.entidades.dominio.ReposicaoAula;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Sala;
import com.edu.ifpb.dac.dacademico.entidades.dominio.SalaNormal;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Turma;
import java.util.List;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class TurmaController {

    private TurmaService turmaService = LookupService.lookup(LookupPath.TURMA_SERVICE, TurmaService.class);
    private CursoServiceRemote cursoService = LookupService.lookup(LookupPath.CURSO_SERVICE, CursoServiceRemote.class);
    private ProfessorService professorService = LookupService.lookup(LookupPath.PROFESSOR_SERVICE, ProfessorService.class);
    private DisciplinaService disciplinaService = LookupService.lookup(LookupPath.DISCIPLINA_SERVICE, DisciplinaService.class);
    private AlunoService alunoService = LookupService.lookup(LookupPath.ALUNO_SERVICE, AlunoService.class);
    private AulaServico aulaService = LookupService.lookup(LookupPath.AULA_SERVICE, AulaServico.class);
    private HorarioService horarioService = LookupService.lookup(LookupPath.HORARIO_SERVICE, HorarioService.class);
    private SalaService salaService = LookupService.lookup(LookupPath.SALA_SERVICE, SalaService.class);
    private ReposicaoAulaServico reposicaoAulaService = LookupService.lookup(LookupPath.REPOSICAO_SERVICE, ReposicaoAulaServico.class);
    
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
    
    public Aula recuperarAula(Long cod){
        return aulaService.buscar(cod);
    }
    
    public ReposicaoAula recuperarReposicaoAula(Long cod){
        return reposicaoAulaService.buscar(cod);
    }
    
    public Horario recuperarHorario (Long cod){
        return horarioService.recuperar(cod);
    }
    
    public Horario recuperarHorarioPelaDescricao (String descricao) throws EntidadeInexistenteException{
        return horarioService.recuperarPelaDescricao(descricao);
    }
    
    public Sala recuperarSalaPelaAbreviacao (String abr) throws EntidadeInexistenteException{
        return salaService.buscarPelaAbreviacao(abr);
    }
    
    public SalaNormal recuperarSalaNormalPelaAbreviacao (String abr) throws EntidadeInexistenteException{
        return salaService.buscarSalaNormalPelaAbreviacao(abr);
    }
    
    public Laboratorio recuperarLaboratorioPelaAbreviacao (String abr) throws EntidadeInexistenteException{
        return salaService.buscarLaboratorioPelaAbreviacao(abr);
    }
    
    public void removerAula (Aula aula){
        aulaService.remover(aula);
    }
    
    public void removerReposicaoAula (ReposicaoAula reposicaoAula){        
        reposicaoAulaService.remover(reposicaoAulaService.buscar(reposicaoAula.getCod()));
    }
}
