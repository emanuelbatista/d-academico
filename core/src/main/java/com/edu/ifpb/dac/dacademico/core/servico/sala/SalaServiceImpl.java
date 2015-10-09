package com.edu.ifpb.dac.dacademico.core.servico.sala;

import com.edu.ifpb.dac.dacademico.entidades.dominio.Laboratorio;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Sala;
import com.edu.ifpb.dac.dacademico.entidades.dominio.SalaNormal;
import com.edu.ifpb.dac.dacademico.entidades.dominio.TiposSala;
import com.edu.ifpb.dac.dacademico.entidades.dominio.SalaTipo;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.Dao;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.GenericoDaoJPA;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class SalaServiceImpl implements SalaService{
    
    private Dao<Sala, Long> repositorio;
    private Dao<Laboratorio, Long> repositorioLaboratorio;
    private Dao<SalaNormal, Long> repositorioSalaNormal;

    public SalaServiceImpl(String unidadePersistencia) {
        this.repositorio = new GenericoDaoJPA<>(unidadePersistencia);
        this.repositorioLaboratorio = new GenericoDaoJPA<>(unidadePersistencia);
        this.repositorioSalaNormal = new GenericoDaoJPA<>(unidadePersistencia);
    }        

    @Override
    public void salvar(Sala sala) {
        repositorio.salvar(sala);
    }
    
    public void salvarLaboratorio(Sala sala){
        Laboratorio lab = (Laboratorio) sala;
        repositorioLaboratorio.salvar(lab);
    }
    
    public void salvarSalaNormal (Sala sala){
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
    
    public SalaNormal buscarSalaNormal (long id){
        return repositorioSalaNormal.buscar(SalaNormal.class, id);
    }
    
    public Laboratorio buscarLaboratorio (long id){
        return repositorioLaboratorio.buscar(Laboratorio.class, id);
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
        for (int i = 0; i < array.size(); i++){
            Sala sala = null;
            switch(tipo){
                case LABORATORIO: sala = new Laboratorio();break;
                case NORMAL:sala = new SalaNormal();break;
            }
            JsonObject obj = array.getJsonObject(i);
            sala.setCod(Integer.parseInt(obj.getString("codigo")));
            sala.setAbreviacao(obj.getString("abreviacao"));
            sala.setDescricao(obj.getString("descricao"));
            try{
                switch(tipo){
                    case LABORATORIO: salvarLaboratorio(sala);break;
                    case NORMAL: salvarSalaNormal(sala);break;
                }                
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
