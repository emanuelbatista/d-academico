package com.edu.ifpb.dac.dacademico.entidades.dominio;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 * 
 * A estratégia de uma tabela por classe concreta foi adotada pois, na API Rest
 * que o IFPB disponibiliza as salas normais e laboratórios possuem ID repetidos,
 * assim, para manter a interoperabilidade dos dados, optamos por manter os IDs
 * da API.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Sala implements Serializable {

    private long cod;
    private SalaTipo salaTipo;
    private String abreviacao, descricao;

    @Id
    @Column(name = "cod")
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

    public SalaTipo getSalaTipo() {
        return salaTipo;
    }

    public void setSalaTipo(SalaTipo salaTipo) {
        this.salaTipo = salaTipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (this.cod ^ (this.cod >>> 32));
        hash = 59 * hash + Objects.hashCode(this.salaTipo);
        hash = 59 * hash + Objects.hashCode(this.abreviacao);
        hash = 59 * hash + Objects.hashCode(this.descricao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sala other = (Sala) obj;
        if (this.cod != other.cod) {
            return false;
        }
        if (this.salaTipo != other.salaTipo) {
            return false;
        }
        if (!Objects.equals(this.abreviacao, other.abreviacao)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return true;
    }
    
    
    
    

 
    
}
