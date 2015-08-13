package com.edu.ifpb.dac.dacademico.entidades.dominio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

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
@Inheritance(strategy = InheritanceType.JOINED)
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
