package com.edu.ifpb.dac.dacademico.core.servico.sala;

import com.edu.ifpb.dac.dacademico.entidades.dominio.Sala;
import com.edu.ifpb.dac.dacademico.entidades.dominio.SalaTipo;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 *
 * @author douglasgabriel
 */
public interface SalaService {

    void salvar(Sala sala);
    public void salvarLaboratorio(Sala sala);
    public void salvarSalaNormal (Sala sala);
    void remover (Sala sala);
    Sala buscar (long id);
    void atualizar (Sala sala);
    void urlParaBanco(String host, SalaTipo tipo) throws MalformedURLException, IOException;
    
}
