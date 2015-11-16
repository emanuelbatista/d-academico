package com.edu.ifpb.dac.dacademico.web.managers;

import com.edu.ifpb.dac.dacademico.core.exceptions.EntidadeInexistenteException;
import com.edu.ifpb.dac.dacademico.core.servico.materialaula.MaterialAulaService;
import com.edu.ifpb.dac.dacademico.core.servico.turma.TurmaService;
import com.edu.ifpb.dac.dacademico.entidades.dominio.MaterialAula;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Turma;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Named
// Há controversias!
@SessionScoped
public class MaterialAulaManager implements Serializable{

    private Part file;
    @EJB
    private MaterialAulaService materialService;
    @EJB
    private TurmaService turmaService;
    private HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
    private Long[] turmas;
    
    public String upload (){
        try{
            for (Turma turma : getTurmasSelecionadas(turmas)){
                MaterialAula material = new MaterialAula();
                material.setNome(file.getSubmittedFileName());
                materialService.salvar(turma, material, IOUtils.toByteArray(file.getInputStream()));               
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "professor_home.xhtml";
    }
    
    private List<Turma> getTurmasSelecionadas (Long[] cods){
        List<Turma> turmas = new ArrayList<>();
        for (long cod : cods){
            try {
                turmas.add(turmaService.buscar(cod));
            } catch (EntidadeInexistenteException ex) {
            }
        }
        return turmas;
    }

    public Long[] getTurmas() {
        return turmas;
    }

    public void setTurmas(Long[] turmas) {
        this.turmas = turmas;
    }

    public Part getFile() {
        return file;
    }

    public void setFile(Part file) {
        this.file = file;
    }
    
}
