package com.edu.ifpb.dac.dacademico.core.servico.sala;

import com.edu.ifpb.dac.dacademico.entidades.dominio.Sala;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public interface SalaService {

    void salvar(Sala professor);
    void remover (Sala professor);
    Sala buscar (long id);
    void atualizar (Sala professor);
    void urlParaBanco(String host) throws MalformedURLException, IOException;
    
}
