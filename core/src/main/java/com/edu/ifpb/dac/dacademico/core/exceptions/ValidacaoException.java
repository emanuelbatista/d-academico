/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ifpb.dac.dacademico.core.exceptions;

import com.edu.ifpb.dac.dacademico.core.errors.Error;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Emanuel Batista da Silva Filho - emanuelbatista2011@gmail.com
 */
public class ValidacaoException extends Exception{
    
    private final List<Error<?>> errors;

    /**
     * Creates a new instance of <code>ValidacaoException</code> without detail
     * message.
     */
    public ValidacaoException() {
      this.errors=new LinkedList<>();
    }

    /**
     * Constructs an instance of <code>ValidacaoException</code> with the
     * specified detail message.
     *
     * @param errors
     */
    public ValidacaoException(List<? extends Error<?>> errors) {
        this.errors=new LinkedList<>(errors);
    }
    
    public List<Error<?>> getErrors(){
        return errors;
    }
    
    
}
