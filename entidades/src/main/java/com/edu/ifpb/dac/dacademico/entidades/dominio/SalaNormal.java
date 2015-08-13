package com.edu.ifpb.dac.dacademico.entidades.dominio;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Entity
public class SalaNormal extends Sala{

    @Override
    public SalaTipo getSalaTipo() {
        return SalaTipo.NORMAL; 
    }
    

    
    
}
