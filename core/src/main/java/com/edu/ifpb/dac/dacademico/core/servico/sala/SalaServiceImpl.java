package com.edu.ifpb.dac.dacademico.core.servico.sala;

import com.edu.ifpb.dac.dacademico.core.exceptions.EntidadeInexistenteException;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Laboratorio;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Sala;
import com.edu.ifpb.dac.dacademico.entidades.dominio.SalaNormal;
import com.edu.ifpb.dac.dacademico.entidades.dominio.SalaTipo;
import com.edu.ifpb.dac.dacademico.core.dao.Dao;
import com.edu.ifpb.dac.dacademico.core.dao.GenericoDaoJPA;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
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
@Remote(SalaService.class)
public class SalaServiceImpl implements SalaService {

    @EJB
    private Dao<Sala, Long> repositorio;
    @EJB
    private Dao<Laboratorio, Long> repositorioLaboratorio;
    @EJB
    private Dao<SalaNormal, Long> repositorioSalaNormal;

    @Override
    public void salvar(Sala sala) {
        repositorio.salvar(sala);
    }

    public void salvarLaboratorio(Sala sala) {
        Laboratorio lab = (Laboratorio) sala;
        repositorioLaboratorio.salvar(lab);
    }

    public void salvarSalaNormal(Sala sala) {
        SalaNormal salaNormal = (SalaNormal) sala;
        repositorioSalaNormal.salvar(salaNormal);
    }

    @Override
    public void remover(Sala sala) {
        repositorio.remover(sala);
    }

    @Override
    public Sala buscar(long id) {
        return repositorio.buscar(Sala.class, id);
    }

    public SalaNormal buscarSalaNormal(long id) {
        return repositorioSalaNormal.buscar(SalaNormal.class, id);
    }
    
    public SalaNormal buscarSalaNormalPelaAbreviacao (String abreviacao) throws EntidadeInexistenteException{
        try{
            return repositorioSalaNormal.buscarPorAtributo(SalaNormal.class, "abreviacao", abreviacao).get(0);
        }catch (ArrayIndexOutOfBoundsException e){
            throw new EntidadeInexistenteException();
        }
    }

    public Laboratorio buscarLaboratorio(long id) {
        return repositorioLaboratorio.buscar(Laboratorio.class, id);
    }
    
    public Laboratorio buscarLaboratorioPelaAbreviacao (String abreviacao) throws EntidadeInexistenteException{
        try{
            return repositorioLaboratorio.buscarPorAtributo(Laboratorio.class, "abreviacao", abreviacao).get(0);
        }catch (ArrayIndexOutOfBoundsException e){
            throw new EntidadeInexistenteException();
        }
    }

    @Override
    public void atualizar(Sala sala) {
        repositorio.atualizar(sala);
    }

    public void urlParaBanco(String host, SalaTipo tipo) throws MalformedURLException, IOException {
        URL url = new URL(host);
        JsonReader jsonReader = Json.createReader(url.openStream());
        JsonObject object = jsonReader.readObject();
        jsonReader.close();
        JsonArray array = object.getJsonArray("data");
        for (int i = 0; i < array.size(); i++) {
            Sala sala = null;
            switch (tipo) {
                case LABORATORIO:
                    sala = new Laboratorio();
                    break;
                case NORMAL:
                    sala = new SalaNormal();
                    break;
            }
            JsonObject obj = array.getJsonObject(i);
            sala.setCod(Integer.parseInt(obj.getString("codigo")));
            sala.setAbreviacao(obj.getString("abreviacao"));
            sala.setDescricao(obj.getString("descricao"));
            try {
                switch (tipo) {
                    case LABORATORIO:
                        salvarLaboratorio(sala);
                        break;
                    case NORMAL:
                        salvarSalaNormal(sala);
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Sala buscarPelaAbreviacao(String abr) throws EntidadeInexistenteException {
        try {
            Sala sala;
            return sala = repositorioSalaNormal.buscarPorAtributo(SalaNormal.class, "abreviacao", abr).get(0);
        } catch (Exception e) {
            try {
                return repositorioLaboratorio.buscarPorAtributo(Laboratorio.class, "abreviacao", abr).get(0);
            } catch (Exception ex) {
                throw new EntidadeInexistenteException();
            }
        }
    }
}
