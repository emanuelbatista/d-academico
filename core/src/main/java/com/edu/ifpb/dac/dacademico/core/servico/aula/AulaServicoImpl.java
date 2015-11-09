package com.edu.ifpb.dac.dacademico.core.servico.aula;

import com.edu.ifpb.dac.dacademico.core.exceptions.EntidadeInexistenteException;
import com.edu.ifpb.dac.dacademico.core.servico.curso.CursoServiceRemote;
import com.edu.ifpb.dac.dacademico.core.servico.curso.CursoServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.sala.SalaService;
import com.edu.ifpb.dac.dacademico.core.servico.sala.SalaServiceImpl;
import com.edu.ifpb.dac.dacademico.core.servico.turma.TurmaService;
import com.edu.ifpb.dac.dacademico.core.servico.turma.TurmaServiceImpl;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Aula;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Horario;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Laboratorio;
import com.edu.ifpb.dac.dacademico.entidades.dominio.SalaNormal;
import com.edu.ifpb.dac.dacademico.core.dao.Dao;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Stateless
@Remote(AulaServico.class)
public class AulaServicoImpl implements AulaServico, Serializable {

    @EJB
    private Dao<Aula, Long> aulaRepositorio;
    @EJB
    private Dao<Horario, Long> horarioRepositorio;

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
        CursoServiceRemote cursoService = new CursoServiceImpl();
        TurmaService turmaService = new TurmaServiceImpl();
        SalaService salaService = new SalaServiceImpl();
//        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        for (int i = 0; i < array.size(); i++) {
            Aula aula = new Aula();
            JsonObject obj = array.getJsonObject(i);
            Horario horario = horarioRepositorio.buscar(Horario.class, Long.parseLong(obj.getString("hor_cod")));
            if (horario == null) {
                horario = new Horario();
                horario.setCod(Long.parseLong(obj.getString("hor_cod")));
                horario.setDescricao(obj.getString("hor_desc"));
                String[] horInicio = obj.getString("hor_inicio").split(":");
                String[] horFim = obj.getString("hor_fim").split(":");
                horario.setInicio(LocalTime.of(Integer.parseInt(horInicio[0]), Integer.parseInt(horInicio[1])));
                horario.setFim(LocalTime.of(Integer.parseInt(horFim[0]), Integer.parseInt(horFim[1])));
//                try {
//                    horario.setInicio(new java.sql.Timestamp(format.parse(obj.getString("hor_inicio")).getTime()).toLocalDateTime());
//                    horario.setFim(new java.sql.Timestamp(format.parse(obj.getString("hor_fim")).getTime()).toLocalDateTime());
//                } catch (ParseException ex) {
//                    ex.printStackTrace();
//                    break;
//                }
                horarioRepositorio.salvar(horario);
            }
            aula.setHorario(horario);
            aula.setDia(DayOfWeek.values()[Integer.parseInt(obj.getString("dia_abrev")) - 1]);
            try {
                aula.setTurma(turmaService.buscar(Long.parseLong(obj.getString("tur_cod"))));
                String valor = obj.get("sala").toString();
                if (valor != null) {
                    SalaNormal salaNormal = salaService.buscarSalaNormal(Long.parseLong((obj.getString("sala"))));
                    if (salaNormal != null) {
                        aula.setSalaNormal(salaNormal);
                    }
                }
                valor = obj.get("laboratorio").toString();
                if (valor != null) {
                    Laboratorio laboratorio = salaService.buscarLaboratorio(Long.parseLong((obj.getString("laboratorio"))));
                    if (laboratorio != null) {
                        aula.setLaboratorio(laboratorio);
                    }
                }                
                horario.getAulas().add(aula);
                aulaRepositorio.salvar(aula);
            } catch (EntidadeInexistenteException ex) {
                System.out.println("A aula não encontrou a turma");
                continue;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public List<Aula> recuperarAulaNameQuery(Class clazz, Object id) {
        Map<String,Object> param=new HashMap<>();
        param.put("cod", id);
        return aulaRepositorio.buscarPorNamedQueryList(Aula.class,"aula."+clazz.getSimpleName() , param);
    }
    
    @Override
    public List<Aula> recuperarAulaNameQuery(Class clazz, Object id, int periodo) {
        Map<String,Object> param=new HashMap<>();
        param.put("cod", id);
        param.put("periodo", periodo);
        return aulaRepositorio.buscarPorNamedQueryList(Aula.class,"aula."+clazz.getSimpleName() , param);
    }
}
