package com.edu.ifpb.dac.dacademico.entidades.dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Entity
public class Aluno extends Pessoa implements Serializable{

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
