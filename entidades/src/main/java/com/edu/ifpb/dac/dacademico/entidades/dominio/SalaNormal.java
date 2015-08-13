package com.edu.ifpb.dac.dacademico.entidades.dominio;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Entity
@Access(AccessType.PROPERTY)
@DiscriminatorValue("Normal")
public class SalaNormal extends Sala{

    @Id
    @Override
    public long getCod() {
        return super.getCod();
    }

    
    
}
