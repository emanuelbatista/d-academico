/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ifpb.dac.dacademico.web.aux;

import com.edu.ifpb.dac.dacademico.core.exceptions.EntidadeInexistenteException;
import com.edu.ifpb.dac.dacademico.core.servico.atividade.AtividadeService;
import com.edu.ifpb.dac.dacademico.core.servico.turma.TurmaService;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Atividade;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Turma;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Emanuel Batista da Silva Filho - https://github.com/emanuelbatista
 */
@FacesConverter(value = "turmaConverter")
public class TurmaConverter implements Converter {

    @EJB
    private TurmaService service;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        try {
            return service.buscar(Long.valueOf(value));
        } catch (EntidadeInexistenteException ex) {
            Logger.getLogger(TurmaConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return String.valueOf(value);
    }

}
