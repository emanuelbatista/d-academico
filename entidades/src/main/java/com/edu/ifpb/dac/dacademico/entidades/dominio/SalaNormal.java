package com.edu.ifpb.dac.dacademico.entidades.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Entity
public class SalaNormal extends Sala{
    

    @Id
    public long getCod(){
        return super.getCod();
    }
    
    public String getAbreviacao (){
        return super.getAbreviacao();
    }
    
    public String getDescricao(){
        return super.getDescricao();
    }
    
}
