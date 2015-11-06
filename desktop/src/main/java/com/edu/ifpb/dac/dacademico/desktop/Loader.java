package com.edu.ifpb.dac.dacademico.desktop;

import com.edu.ifpb.dac.dacademico.core.servico.administrador.AdminServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.aula.AulaServico;
import com.edu.ifpb.dac.dacademico.core.servico.aula.AulaServicoImpl;
import com.edu.ifpb.dac.dacademico.core.servico.curso.CursoServiceRemote;
import com.edu.ifpb.dac.dacademico.core.servico.curso.CursoServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.disciplina.DisciplinaService;
import com.edu.ifpb.dac.dacademico.core.servico.disciplina.DisciplinaServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.horario.HorarioService;
import com.edu.ifpb.dac.dacademico.core.servico.horario.HorarioServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.professor.ProfessorService;
import com.edu.ifpb.dac.dacademico.core.servico.professor.ProfessorServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.sala.SalaService;
import com.edu.ifpb.dac.dacademico.core.servico.sala.SalaServiceImpl;
import com.edu.ifpb.dac.dacademico.entidades.dominio.TiposSala;
import com.edu.ifpb.dac.dacademico.core.servico.sala.SalaService;
import com.edu.ifpb.dac.dacademico.core.servico.sala.SalaServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.turma.TurmaService;
import com.edu.ifpb.dac.dacademico.core.servico.turma.TurmaServiceImpl;
import com.edu.ifpb.dac.dacademico.desktop.visao.Inicio;
import com.edu.ifpb.dac.dacademico.desktop.visao.Login;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Administrador;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Horario;
import com.edu.ifpb.dac.dacademico.entidades.dominio.SalaTipo;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class Loader {
    public static void main(String[] args) throws IOException {
        
        String unidadePersistencia = "com.edu.ifpb.dac.dacademico_entidades_jar_1.0-SNAPSHOTPU";
//        ProfessorServiceImpl service = new ProfessorServiceImpl(unidadePersistencia);
//        service.urlParaBanco("http://200.129.71.228/horarios/data/professores.json");
//        
//        SalaService salaService = new SalaServiceImpl(unidadePersistencia);
//        salaService.urlParaBanco("http://200.129.71.228/horarios/data/laboratorios.json", SalaTipo.NORMAL);
//        salaService.urlParaBanco("http://200.129.71.228/horarios/data/laboratorios.json", SalaTipo.LABORATORIO);
//        
//        CursoService cursoService = new CursoServiceImpl(unidadePersistencia);
//        cursoService.urlParaBanco("http://200.129.71.228/horarios/data/cursos.json");
//        
//        DisciplinaService disciplinaService = new DisciplinaServiceImpl(unidadePersistencia);
//        disciplinaService.urlParaBanco("http://200.129.71.228/horarios/data/disciplinas.json");
//        
//        TurmaService turmaService = new TurmaServiceImpl(unidadePersistencia);
//        turmaService.urlParaBanco("http://200.129.71.228/horarios/data/turmas.json");
        
//        AulaServico aulaService = new AulaServicoImpl(unidadePersistencia);
//        aulaService.urlParaBanco("http://200.129.71.228/horarios/data/aulas.json");
//        
        /*Administrador admin = new Administrador();
        admin.setEmail("admin@admin.com");
        admin.setLogin("admin");
        admin.setSenha("admin");
        new AdminServiceImpl(Configuracoes.UNIDADE_PERSISTENCIA_DEFAULT).salvar(admin);*/
        
        /*HorarioService service = new HorarioServiceImpl(unidadePersistencia);
        Horario horario = new Horario();
        horario.setDescricao("M1");
        horario.setDia(DayOfWeek.MONDAY);
        horario.setInicio(LocalTime.of(7, 0));
        horario.setFim(LocalTime.of(7, 50));
        service.salvar(horario);*/
        
        new Login();
    }
}
