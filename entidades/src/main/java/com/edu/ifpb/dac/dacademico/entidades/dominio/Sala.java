package com.edu.ifpb.dac.dacademico.entidades.dominio;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@MappedSuperclass
public abstract class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cod;
    private String abreviacao, descricao;

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
