package com.edu.ifpb.dac.dacademico.entidades.dominio;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Entity
public class Professor extends Pessoa{
    
    @NotBlank(message = "O campo de unidade está vazio")
    private String unidade;
    private String vinculo;
    @NotBlank(message = "O campo regime está vazio")
    private String regime;
    @OneToMany(mappedBy = "professor")
    private List<Turma> turmas;

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
    
    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

}
