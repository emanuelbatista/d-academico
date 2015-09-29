package com.edu.ifpb.dac.dacademico.core.servico.sala;

import com.edu.ifpb.dac.dacademico.entidades.dominio.Sala;
import com.edu.ifpb.dac.dacademico.entidades.dominio.TiposSala;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 *
 * @author douglasgabriel
 */
public interface SalaService {

    void salvar(Sala sala);
    void remover (Sala sala);
    Sala buscar (long id);
    void atualizar (Sala sala);
    public void urlParaBanco(String host, TiposSala tipo) 
            throws MalformedURLException, IOException;
    
}
