package com.edu.ifpb.dac.dacademico.core.servico.sala;

import com.edu.ifpb.dac.dacademico.entidades.dominio.Laboratorio;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Sala;
import com.edu.ifpb.dac.dacademico.entidades.dominio.SalaNormal;
import com.edu.ifpb.dac.dacademico.entidades.dominio.TiposSala;
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

    public SalaServiceImpl(String unidadePersistencia) {
        this.repositorio = new GenericoDaoJPA<>(unidadePersistencia);
    }        

    @Override
    public void salvar(Sala sala) {
        repositorio.salvar(sala);
    }

    @Override
    public void remover(Sala sala) {
        repositorio.remover(sala);
    }

    @Override
    public Sala buscar(long id) {
        return repositorio.buscar(Sala.class, id);
    }

    @Override
    public void atualizar(Sala sala) {
        repositorio.atualizar(sala);
    }

    @Override
    public void urlParaBanco(String host, TiposSala tipo) throws MalformedURLException, IOException {
        URL url = new URL(host);
        JsonReader jsonReader = Json.createReader(url.openStream());
        JsonArray array = jsonReader.readObject().getJsonArray("data");        
        jsonReader.close();        
        for (int i = 0; i < array.size();i++){
            Sala sala;
            if (tipo == tipo.LABORATORIO)
                sala = new Laboratorio();
            else
                sala = new SalaNormal();
            JsonObject obj = array.getJsonObject(i);
            sala.setCod(Long.parseLong(obj.getString("codigo")));
            sala.setDescricao(obj.getString("descricao"));
            sala.setAbreviacao(obj.getString("abreviacao"));            
            repositorio.salvar(sala);
        }
    }
    
}
