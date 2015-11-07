package com.edu.ifpb.dac.dacademico.entidades.dominio;

import java.io.Serializable;
import java.time.LocalTime;

/**
 *
 * @author douglasgabriel
 */
public enum Horarios implements Serializable{

    M1(LocalTime.of(7, 0), LocalTime.of(7, 50)), M2(LocalTime.of(7, 50), LocalTime.of(8, 40))
    , M3(LocalTime.of(8, 40), LocalTime.of(9, 30)), M4(LocalTime.of(9, 45), LocalTime.of(10, 35))
    , M5(LocalTime.of(10, 35), LocalTime.of(11, 25));
    
    LocalTime inicio, fim;
    
    private Horarios(LocalTime inicio, LocalTime fim){
        this.inicio = inicio;
        this.fim = fim;
    }
    
}
