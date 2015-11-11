package com.edu.ifpb.dac.dacademico.web.managers;

import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.SenhaErradaException;
import com.edu.ifpb.dac.dacademico.core.servico.aluno.AlunoService;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Aluno;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Named
@SessionScoped
public class AlunoSessionManager implements Serializable{

    //@RequestScoped
    private String password;
    //@RequestScoped
    private String nomeUsuario;
    private Aluno aluno;
    private String errMessage;
    @EJB
    private AlunoService service;
    
    public String login (){
        try{
            aluno = service.login(nomeUsuario, password);
        }catch (LoginInexistenteException e){
            errMessage = "Login inexistente";
            return "index.xhtml";
        }catch (SenhaErradaException e){
            errMessage = "Senha equivocada";
            return "index.xhtml";
        }
        return "aluno_home.xhtml";
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
