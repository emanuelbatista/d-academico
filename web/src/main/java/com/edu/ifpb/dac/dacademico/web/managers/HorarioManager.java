/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ifpb.dac.dacademico.web.managers;

import com.edu.ifpb.dac.dacademico.core.servico.aula.AulaServico;
import com.edu.ifpb.dac.dacademico.core.servico.horario.HorarioService;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Aula;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Horario;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Horarios;
import java.time.DayOfWeek;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Emanuel Batista da Silva Filho - emanuelbatista2011@gmail.com
 */
@Named
@RequestScoped
public class HorarioManager {

    @EJB
    private AulaServico aulaServico;
    private List<Aula> aulas;

    public HorarioManager() {
    }

    public void listarHorario(Long id, String nameClass) {
        Class clazz = null;
        try {
            clazz = Class.forName(nameClass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HorarioManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.aulas = aulaServico.recuperarAulaNameQuery(clazz, id);
        System.out.println(aulas);
    }

    public String getAula(int dia, int hora) {

        for (Aula aula : aulas) {
            boolean contemDia = false, contemHora;

            if (dia == aula.getDia().getValue()) {
                contemDia = true;
            }
            System.out.println("contém dia "+contemDia);
            contemHora = contemAula(aula, hora);
            System.out.println("contém hora "+contemHora);
            if (contemDia && contemHora) {
                return aula.getTurma().getDisciplina().getAbreviacao();
            }
        }
        System.out.println(aulas.size());
        System.out.println("Imprimiu nada não moral");
        return "";
    }

    private boolean contemAula(Aula aula, int hora) {
        boolean contemHora = false;
        switch (aula.getHorario().getDescricao()) {
            case "M1": {
                contemHora = hora == 1;
                break;
            }
            case "M2": {
                contemHora = hora == 2;
                break;
            }
            case "M3": {
                contemHora = hora == 3;
                break;
            }
            case "M4": {
                contemHora = hora == 4;
                break;
            }
            case "M5": {
                contemHora = hora == 5;
                break;
            }
            case "T1": {
                contemHora = hora == 6;
                break;
            }
            case "T2": {
                contemHora = hora == 7;
                break;
            }
            case "T3": {
                contemHora = hora == 8;
                break;
            }
            case "T4": {
                contemHora = hora == 9;
                break;
            }
            case "T5": {
                contemHora = hora == 10;
                break;
            }
            case "N1": {
                contemHora = hora == 11;
                break;
            }
            case "N2": {
                contemHora = hora == 12;
                break;
            }
            case "N3": {
                contemHora = hora == 13;
                break;
            }
            case "N4": {
                contemHora = hora == 14;
                break;
            }
        }
        return contemHora;
    }

    public Object[] listaParaIterar(int i) {
        return new Object[i];
    }

    public String horarioAbr(int i) {
        switch (i) {
            case 1:
                return "M1";
            case 2:
                return "M2";
            case 3:
                return "M3";
            case 4:
                return "M4";
            case 5:
                return "M5";
            case 6:
                return "T1";
            case 7:
                return "T2";
            case 8:
                return "T3";
            case 9:
                return "T4";
            case 10:
                return "T5";
            case 11:
                return "N1";
            case 12:
                return "N2";
            case 13:
                return "N3";
            case 14:
                return "N4";
        }
        return "";
    }

}
