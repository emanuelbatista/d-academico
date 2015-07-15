package com.edu.ifpb.dac.dacademico.entidades.dominio;

import java.io.Serializable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Entity
@Table(name="sala")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Sala implements Serializable {

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
