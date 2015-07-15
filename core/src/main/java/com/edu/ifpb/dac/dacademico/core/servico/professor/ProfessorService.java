package com.edu.ifpb.dac.dacademico.core.servico.professor;

import com.edu.ifpb.dac.dacademico.entidades.dominio.Professor;

/**
 *
 * @author douglasgabriel
 */
public interface ProfessorService {
    
    void salvar(Professor professor);
    void remover (Professor professor);
    Professor buscar (long id);
    void atualizar (Professor professor);
    
}
