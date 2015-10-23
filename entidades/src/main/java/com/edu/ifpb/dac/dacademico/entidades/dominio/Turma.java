package com.edu.ifpb.dac.dacademico.entidades.dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
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
    @ManyToOne
    private Professor professor;
    @ManyToMany(mappedBy = "turmas")
    private List<Aluno> alunos;
    @ManyToOne
    private Curso curso;
    @ManyToOne
    private Disciplina disciplina;
    @OneToMany(mappedBy = "turma")
    private List<Aula> aulas;

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

}
