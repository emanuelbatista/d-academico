package com.edu.ifpb.dac.dacademico.entidades.dominio;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Entity
@Access(AccessType.PROPERTY)
public class Laboratorio extends Sala{

    @Id
    @Override
    public long getCod() {
        return super.getCod(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
