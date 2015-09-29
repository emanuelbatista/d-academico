package com.edu.ifpb.dac.dacademico.core.servico.professor;

import com.edu.ifpb.dac.dacademico.entidades.dominio.Professor;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 *
 * @author douglasgabriel
 */
public interface ProfessorService {
    
    void salvar(Professor professor);
    void remover (Professor professor);
    Professor buscar (long id);
    void atualizar (Professor professor);
    void urlParaBanco(String host) throws MalformedURLException, IOException;
    
}
