/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ifpb.dac.dacademico.core.validacao;

import java.util.List;
import com.edu.ifpb.dac.dacademico.core.aux.Error;
import java.util.ArrayList;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 *
 * @author Emanuel Batista da Silva Filho - emanuelbatista2011@gmail.com
 */
public class HibernateValidacao{
    
    public static <T> List<Error<T>> validar(T t){
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(t);
        List<Error<T>> messageErrors = new ArrayList<>();
        constraintViolations.forEach(x -> {
            Error<T> erro=new Error<>();
            erro.setField(x.getPropertyPath().toString());
            erro.setMessage(x.getMessage());
            erro.setRootBean(x.getRootBean());
            messageErrors.add(erro);
        });
        return messageErrors;
    }
}
