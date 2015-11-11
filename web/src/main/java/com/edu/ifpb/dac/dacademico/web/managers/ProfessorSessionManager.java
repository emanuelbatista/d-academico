package com.edu.ifpb.dac.dacademico.web.managers;

import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.SenhaErradaException;
import com.edu.ifpb.dac.dacademico.core.servico.professor.ProfessorService;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Professor;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Named
@SessionScoped
public class ProfessorSessionManager implements Serializable{

    //@RequestScoped
    private String password;
    //@RequestScoped
    private String nomeUsuario;
    private Professor professor;
    private String errMessage;
    @EJB
    private ProfessorService service;
    
    public String login (){
        try{
            professor = service.login(nomeUsuario, password);
        }catch (LoginInexistenteException e){
            errMessage = "Login inexistente";
            return "index.xhtml";
        }catch (SenhaErradaException e){
            errMessage = "Senha equivocada";
            return "index.xhtml";
        }
        return "professor_home.xhtml";
    }
    
    public String logout(){
        FacesContext fc = FacesContext.getCurrentInstance();
        ExternalContext ec = fc.getExternalContext();
        HttpServletRequest request = (HttpServletRequest) ec.getRequest();
        request.getSession().invalidate();
        return "index.xhtml";
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setAluno(Professor professor) {
        this.professor = professor;
    }

    public String getErrMessage() {
        return errMessage;
    }

}
