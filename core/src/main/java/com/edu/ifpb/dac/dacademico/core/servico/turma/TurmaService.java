package com.edu.ifpb.dac.dacademico.core.servico.turma;

import com.edu.ifpb.dac.dacademico.entidades.dominio.Turma;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 *
 * @author douglasgabriel
 */
public interface TurmaService {
    
    void salvar(Turma turma);
    void remover (Turma turma);
    Turma buscar (long id);
    void atualizar (Turma turma);
    void urlParaBanco(String host) throws MalformedURLException, IOException;
    
}
