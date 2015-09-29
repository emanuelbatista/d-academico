package com.edu.ifpb.dac.dacademico.core.servico.disciplina;

import com.edu.ifpb.dac.dacademico.entidades.dominio.Disciplina;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 *
 * @author douglasgabriel
 */
public interface DisciplinaService {

    void salvar(Disciplina disciplina);
    void remover (Disciplina disciplina);
    Disciplina buscar (long id);
    void atualizar (Disciplina disciplina);
    void urlParaBanco(String host) throws MalformedURLException, IOException;
    
}
