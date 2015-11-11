package com.edu.ifpb.dac.dacademico.entidades.dominio;

import java.io.Serializable;
import java.time.DayOfWeek;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "aula.Laboratorio", query = "SELECT a FROM Aula a WHERE a.laboratorio.cod=:cod"),
    @NamedQuery(name = "aula.SalaNormal", query = "SELECT a FROM Aula a WHERE a.salaNormal.cod=:cod"),
    @NamedQuery(name = "aula.Professor", query = "SELECT a FROM Aula a WHERE a.turma.professor.cod=:cod"),
    @NamedQuery(name = "aula.Curso", query = "SELECT a FROM Aula a WHERE a.turma.disciplina.periodo=:periodo AND a.turma.disciplina.curso.cod=:cod"),
    @NamedQuery(name = "aula.Aluno",
            query = "SELECT a FROM Aula a WHERE a.turma IN (SELECT t FROM Turma t JOIN t.alunos al WHERE al.cod=:cod)")
})
public class Aula implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cod;
    @ManyToOne
    private Turma turma;
    @ManyToOne
    private Horario horario;
    @ManyToOne
    private Laboratorio laboratorio;
    @ManyToOne
    private SalaNormal salaNormal;
    @Enumerated(EnumType.STRING)
    private DayOfWeek dia;

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public Turma getTurma() {
        return turma;
    }

    public DayOfWeek getDia() {
        return dia;
    }

    public void setDia(DayOfWeek dia) {
        this.dia = dia;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public SalaNormal getSalaNormal() {
        return salaNormal;
    }

    public void setSalaNormal(SalaNormal salaNormal) {
        this.salaNormal = salaNormal;
    }

    @Override
    public String toString() {
        return turma.getDisciplina().getAbreviacao();
    }

}
