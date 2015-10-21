package com.edu.ifpb.dac.dacademico.core.servico.aula;

import com.edu.ifpb.dac.dacademico.core.servico.curso.CursoService;
import com.edu.ifpb.dac.dacademico.core.servico.curso.CursoServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.disciplina.DisciplinaService;
import com.edu.ifpb.dac.dacademico.core.servico.disciplina.DisciplinaServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.professor.ProfessorService;
import com.edu.ifpb.dac.dacademico.core.servico.professor.ProfessorServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.sala.SalaService;
import com.edu.ifpb.dac.dacademico.core.servico.sala.SalaServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.turma.TurmaService;
import com.edu.ifpb.dac.dacademico.core.servico.turma.TurmaServiceImpl;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Aula;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Horario;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.Dao;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.GenericoDaoJPA;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class AulaServicoImpl implements AulaServico{
    
    private Dao<Aula, Long> aulaRepositorio;
    private Dao<Horario, Long> horarioRepositorio;    

    public AulaServicoImpl(String unidadePersistencia) {
        this.aulaRepositorio = new GenericoDaoJPA<>(unidadePersistencia);
        this.horarioRepositorio = new GenericoDaoJPA<>(unidadePersistencia);
    }
    
    @Override
    public void salvar(Aula aula) {
        aulaRepositorio.salvar(aula);
    }

    @Override
    public void remover(Aula aula) {
        aulaRepositorio.remover(aula);
    }

    @Override
    public Aula buscar(long id) {
        return aulaRepositorio.buscar(Aula.class, id);
    }

    @Override
    public void atualizar(Aula aula) {
        aulaRepositorio.atualizar(aula);
    }

    @Override
    public void urlParaBanco(String host) throws MalformedURLException, IOException {
        URL url = new URL(host);
        JsonReader jsonReader = Json.createReader(url.openStream());
        JsonObject object = jsonReader.readObject();
        jsonReader.close();
        JsonArray array = object.getJsonArray("data");
        CursoService cursoService = new CursoServiceImpl(aulaRepositorio.getUnidadePersistencia());
        DisciplinaService disciplinaService = new DisciplinaServiceImpl(aulaRepositorio.getUnidadePersistencia());
        TurmaService turmaService = new TurmaServiceImpl(aulaRepositorio.getUnidadePersistencia());
        ProfessorService professorService = new ProfessorServiceImpl(aulaRepositorio.getUnidadePersistencia());        
        SalaService salaService = new SalaServiceImpl(aulaRepositorio.getUnidadePersistencia());        
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        for (int i = 0; i < array.size(); i++) {
            Aula aula = new Aula();
            JsonObject obj = array.getJsonObject(i);
            Horario horario = horarioRepositorio.buscar(Horario.class, Long.parseLong(obj.getString("hor_cod")));
            if (horario == null){
                horario = new Horario();
                horario.setCod(Long.parseLong(obj.getString("hor_cod")));
                horario.setDescricao(obj.getString("hor_desc"));
                horario.setDia(DayOfWeek.values()[Integer.parseInt(obj.getString("dia_abrev"))]);
                try {
                    horario.setInicio(new java.sql.Timestamp(format.parse(obj.getString("hor_inicio")).getTime()).toLocalDateTime());
                    horario.setFim(new java.sql.Timestamp(format.parse(obj.getString("hor_fim")).getTime()).toLocalDateTime());
                } catch (ParseException ex) {
                    ex.printStackTrace();
                    break;
                }
                horarioRepositorio.salvar(horario);
            }
            aula.setHorario(horario);
            aula.setDisciplina(disciplinaService.buscar(Long.parseLong(obj.getString("disc_cod"))));
            aula.setTurma(turmaService.buscar(Long.parseLong(obj.getString("tur_cod"))));
            aula.setProfessor(professorService.buscar(Long.parseLong(obj.getString("prof_cod"))));
            aula.setSala(salaService.buscarSalaNormal(Long.parseLong(obj.getString("sala"))));
            aula.setLaboratorio(salaService.buscarLaboratorio(Long.parseLong(obj.getString("laboratorio"))));
            try {
                aulaRepositorio.salvar(aula);
            } catch (Exception e) {
                System.out.println(obj.getString("email"));
                e.printStackTrace();
            }
        }
    }

}
