package com.edu.ifpb.dac.dacademico.desktop;

import com.edu.ifpb.dac.dacademico.core.servico.professor.ProfessorServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.sala.SalaService;
import com.edu.ifpb.dac.dacademico.core.servico.sala.SalaServiceImpl;
import com.edu.ifpb.dac.dacademico.entidades.dominio.SalaTipo;
import java.io.IOException;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class Loader {
    public static void main(String[] args) throws IOException {
        /*ProfessorServiceImpl service = new ProfessorServiceImpl("com.edu.ifpb.dac.dacademico_entidades_jar_1.0-SNAPSHOTPU");
        service.urlParaBanco("http://200.129.71.228/horarios/data/professores.json");*/
        
        SalaService salaService = new SalaServiceImpl("com.edu.ifpb.dac.dacademico_entidades_jar_1.0-SNAPSHOTPU");
        salaService.urlParaBanco("http://200.129.71.228/horarios/data/laboratorios.json", SalaTipo.NORMAL);
        salaService.urlParaBanco("http://200.129.71.228/horarios/data/laboratorios.json", SalaTipo.LABORATORIO);
        
    }
}
