package com.edu.ifpb.dac.dacademico.core.servico.aula;

import com.edu.ifpb.dac.dacademico.entidades.dominio.Aula;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 *
 * @author douglasgabriel
 */
public interface AulaServico {
    
    void salvar(Aula aula);
    void remover (Aula aula);
    Aula buscar (long id);
    void atualizar (Aula turma);
    void urlParaBanco(String host) throws MalformedURLException, IOException;
    
}
