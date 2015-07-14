package com.edu.ifpb.dac.dacademico.entidades.dominio;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Entity
@SequenceGenerator (name = "default_gen", sequenceName = "seq_aluno")
public class Aluno extends Pessoa{

    @Column(unique = true)
    private String rg, cpf, matricula;
    @ManyToMany
    private List<Turma> turmas;
    @ManyToOne
    private Curso curso;

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
    
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}
