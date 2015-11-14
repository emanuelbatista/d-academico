/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.ifpb.dac.dacademico.entidades.dominio;

import com.edu.ifpb.dac.dacademico.entidades.converter.ConverterDate;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.time.LocalDate;

/**
 *
 * @author Rafael
 */
@Entity
public class Comentario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cod;
    private String conteudo;
    private String autor;
    @Temporal(TemporalType.DATE)
    @Basic
    @Convert(converter = ConverterDate.class)
    private LocalDate data;

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    
}
