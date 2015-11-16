/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.ifpb.dac.dacademico.web.managers;

import com.edu.ifpb.dac.dacademico.core.servico.comentario.ComentarioService;
import com.edu.ifpb.dac.dacademico.core.servico.duvida.DuvidaService;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Aluno;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Comentario;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Duvida;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Professor;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Rafael
 */
@Named(value = "comentarioManager")
@SessionScoped
public class ComentarioManager implements Serializable{
    
    @EJB
    private ComentarioService comentarioService;
    @EJB
    private DuvidaService duvidaService;
    private String conteudo;
    private Duvida duvida;
     
    public String save(Professor professor, Aluno aluno){
        Comentario c = new Comentario();
        c.setConteudo(conteudo);
        c.setDuvida(duvida);        
        c.setData(LocalDate.now());
        c.setAutor(professor == null ? aluno.getNomeCompleto() : professor.getNomeCompleto());
        duvida.getComentarios().add(c);
        comentarioService.salvar(c, duvida);        
        return null;
    }
    
    public String carregarPaginaDuvida (Duvida duvida){
        this.duvida = duvida;
        return "duvida.xhtml";
    }
    
    public List<Comentario> listAll(){
        return comentarioService.listarTodos(duvida.getCod());
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Duvida getDuvida() {
        return duvida;
    }

    public void setDuvida(Duvida duvida) {
        this.duvida = duvida;
    }
    
}
