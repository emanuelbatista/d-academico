package com.edu.ifpb.dac.dacademico.web.managers;

import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.SenhaErradaException;
import com.edu.ifpb.dac.dacademico.core.servico.aluno.AlunoService;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Aluno;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Named
@SessionScoped
public class AlunoManager implements Serializable{

    @RequestScoped
    private String login, password;
    private Aluno aluno;
    private String errMessage;
    @EJB
    private AlunoService service;
    
    public String login (){
        try{
            aluno = service.login(login, password);
        }catch (LoginInexistenteException e){
            errMessage = "Login inexistente";
            return "index.xhtml";
        }catch (SenhaErradaException e){
            errMessage = "Senha equivocada";
            return "index.xhtml";
        }
        return "aluno_home.xhtml";
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getErrMessage() {
        return errMessage;
    }

}
