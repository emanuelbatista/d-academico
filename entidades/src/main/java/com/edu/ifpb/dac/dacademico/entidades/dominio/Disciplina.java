package com.edu.ifpb.dac.dacademico.entidades.dominio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Entity
public class Disciplina implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long cod;
    @Min(1)
    private int aulasPorSemana, periodo, cargaHoraria;
    @NotBlank
    private String descricao, abreviacao;
    @ManyToOne (fetch = FetchType.EAGER)
    private Curso curso;

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public int getAulasPorSemana() {
        return aulasPorSemana;
    }

    public void setAulasPorSemana(int aulasPorSemana) {
        this.aulasPorSemana = aulasPorSemana;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return descricao;
    }
    
}
