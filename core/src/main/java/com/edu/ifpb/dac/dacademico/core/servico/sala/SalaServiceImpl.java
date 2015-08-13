package com.edu.ifpb.dac.dacademico.core.servico.sala;

import com.edu.ifpb.dac.dacademico.entidades.dominio.Sala;
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
    public void urlParaBanco(String host) throws MalformedURLException, IOException {
        URL url = new URL(host);
        JsonReader jsonReader = Json.createReader(url.openStream());
        JsonObject object = jsonReader.readObject();
        jsonReader.close();
        JsonArray array = object.getJsonArray("data");
        for (int i = 0; i < array.size(); i++){
            Sala sala = new Sala();
            JsonObject obj = array.getJsonObject(i);
            sala.setCod(Integer.parseInt(obj.getString("codigo")));
            sala.setAbreviacao(obj.getString("abreviacao"));
            sala.setDescricao(obj.getString("descricao"));
            try{
                repositorio.salvar(sala);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
