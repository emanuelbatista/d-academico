package com.edu.ifpb.dac.dacademico.desktop;

import com.edu.ifpb.dac.dacademico.core.servico.professor.ProfessorServiceImpl;
import java.io.IOException;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class Loader {
    public static void main(String[] args) throws IOException {
        ProfessorServiceImpl service = new ProfessorServiceImpl("com.edu.ifpb.dac.dacademico_entidades_jar_1.0-SNAPSHOTPU");
        service.urlParaBanco("http://200.129.71.228/horarios/data/professores.json");
    }
}
