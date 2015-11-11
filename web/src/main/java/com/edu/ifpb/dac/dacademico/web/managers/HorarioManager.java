/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ifpb.dac.dacademico.web.managers;

import com.edu.ifpb.dac.dacademico.core.servico.aula.AulaServico;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Aula;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public void listarHorario(Long id, String nameClass, int periodo) {
        Class clazz = null;
        System.out.println("no novo método");
        try {
            clazz = Class.forName(nameClass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HorarioManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.aulas = aulaServico.recuperarAulaNameQuery(clazz, id, periodo);
        System.out.println(aulas);
    }

    public String getAula(int dia, int hora) {

        for (Aula aula : aulas) {
            boolean contemDia = false, contemHora;

            if (aula.getDia() != null && dia == aula.getDia().getValue()) {
                contemDia = true;
            }
            contemHora = contemAula(aula, hora);
            if (contemDia && contemHora) {
                return aula.getTurma().getDisciplina().getAbreviacao();
            }
        }
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
                return "M1 (7:00 às 7:50)";
            case 2:
                return "M2 (7:50 às 8:40)";
            case 3:
                return "M3 (8:40 às 9:30)";
            case 4:
                return "M4 (9:45 às 10:35)";
            case 5:
                return "M5 (10:35 às 11:25)";
            case 6:
                return "T1 (13:00 às 13:50)";
            case 7:
                return "T2 (13:50 às 14:40)";
            case 8:
                return "T3 (14:40 às 15:30)";
            case 9:
                return "T4 (15:45 às 16:35)";
            case 10:
                return "T5 (16:35 às 17:25)";
            case 11:
                return "N1 (18:50 às 19:40)";
            case 12:
                return "N2 (19:40 às 20:30)";
            case 13:
                return "N3 (20:40 às 21:30)";
            case 14:
                return "N4 (21:30 às 22:20)";
        }
        return "";
    }

}
