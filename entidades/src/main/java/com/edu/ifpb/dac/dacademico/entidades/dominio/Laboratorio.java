package com.edu.ifpb.dac.dacademico.entidades.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Entity
public class Laboratorio extends Sala{

    @Id
    public long getCod(){
        return super.getCod();
    }
    
    public void setCod(Long cod){
        super.setCod(cod);
    }
    
}
