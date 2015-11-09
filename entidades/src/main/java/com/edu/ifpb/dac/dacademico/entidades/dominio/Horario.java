package com.edu.ifpb.dac.dacademico.entidades.dominio;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Entity
@NamedQueries(
        {@NamedQuery(name = "horario.SalaNormal",query = "SELECT h FROM Horario h JOIN h.aulas a WHERE a.salaNormal.cod=:cod"),
        @NamedQuery(name = "horario.Laboratorio",query = "SELECT h FROM Horario h JOIN h.aulas a WHERE a.laboratorio.cod=:cod")}
)
public class Horario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cod;
    private String descricao;
    private LocalTime inicio, fim;
    @OneToMany (mappedBy = "horario")
    private List<Aula> aulas;    

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalTime inicio) {
        this.inicio = inicio;
    }

    public LocalTime getFim() {
        return fim;
    }

    public void setFim(LocalTime fim) {
        this.fim = fim;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }
    
}
