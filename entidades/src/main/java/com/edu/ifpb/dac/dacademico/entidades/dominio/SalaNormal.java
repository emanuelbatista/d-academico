package com.edu.ifpb.dac.dacademico.entidades.dominio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Entity
public class SalaNormal extends Sala implements Serializable{

    public SalaNormal() {
    }

    @Id
    @Override
    public long getCod(){
        return super.getCod();
    }
    
    @Override
    public String getAbreviacao (){
        return super.getAbreviacao();
    }
    
    @Override
    public String getDescricao(){
        return super.getDescricao();
    }
    
    public void setCod(Long cod){
        super.setCod(cod);
    }
    
}
