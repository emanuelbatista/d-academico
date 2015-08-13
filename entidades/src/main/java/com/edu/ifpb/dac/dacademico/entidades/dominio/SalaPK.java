/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ifpb.dac.dacademico.entidades.dominio;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Emanuel Batista da Silva Filho - emanuelbatista2011@gmail.com
 */
public class SalaPK implements Serializable{
    private long cod;
    private SalaTipo salaTipo;

    public SalaPK() {
    }
    

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
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
        hash = 97 * hash + (int) (this.cod ^ (this.cod >>> 32));
        hash = 97 * hash + Objects.hashCode(this.salaTipo);
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
        final SalaPK other = (SalaPK) obj;
        if (this.cod != other.cod) {
            return false;
        }
        if (this.salaTipo != other.salaTipo) {
            return false;
        }
        return true;
    }
    
    
    
}
