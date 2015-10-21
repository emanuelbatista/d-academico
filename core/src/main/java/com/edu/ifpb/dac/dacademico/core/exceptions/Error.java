/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ifpb.dac.dacademico.core.exceptions;

/**
 *
 * @author Emanuel Batista da Silva Filho - emanuelbatista2011@gmail.com
 * @param <T>
 */
public class Error<T>{
    
    private T rootBean;
    private String message;
    private String field;

    public T getRootBean() {
        return rootBean;
    }

    public void setRootBean(T rootBean) {
        this.rootBean = rootBean;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
    
    
}
