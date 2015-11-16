package com.edu.ifpb.dac.dacademico.entidades.dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Entity
public class Turma implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cod;
    private String identificacao;
    @ManyToOne (fetch = FetchType.EAGER)
    private Professor professor;
    @ManyToMany(mappedBy = "turmas", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private List<Aluno> alunos;
    @ManyToOne (fetch = FetchType.EAGER)
    private Curso curso;
    @ManyToOne (fetch = FetchType.EAGER)
    private Disciplina disciplina;
    @OneToMany(mappedBy = "turma", fetch = FetchType.EAGER)
    private List<Aula> aulas;
    @OneToMany(mappedBy = "turma", fetch = FetchType.EAGER)
    private List<ReposicaoAula> reposicaoAulas;

    public List<ReposicaoAula> getReposicaoAulas() {
        return reposicaoAulas;
    }

    public void setReposicaoAulas(List<ReposicaoAula> reposicaoAulas) {
        this.reposicaoAulas = reposicaoAulas;
    }
    
    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }
    
    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    
    

    @Override
    public String toString() {
        return "Turma{" + "cod=" + cod + ", identificacao=" + identificacao + ", professor=" + professor + ", alunos=" + alunos + ", curso=" + curso + ", disciplina=" + disciplina + ", aulas=" + aulas + '}';
    }
    
}
