package com.edu.ifpb.dac.dacademico.entidades.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Entity
public class Aula implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cod;
    @ManyToOne
    private Turma turma;
    @ManyToOne
    private Horario horario;
//    @ManyToMany
    @Transient
    private List<Sala> salas;

    public Aula (){
        this.salas = new ArrayList<>();
    }
    
    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public Turma getTurma() {
        return turma;
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

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSala(List<Sala> salas) {
        this.salas = salas;
    }

}
