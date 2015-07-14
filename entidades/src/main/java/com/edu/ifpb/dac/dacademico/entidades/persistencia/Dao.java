package com.edu.ifpb.dac.dacademico.entidades.persistencia;

import java.util.List;

/**
 *
 * @author douglasgabriel
 * @param T tipo entidade
 * @param K tipo chave primária
 */
public interface Dao<T,K> {
    
    void salvar (T entidade);
    void remover (T entidade);
    public T buscar(Class<T> classe, Object chave) ;
    void atualizar (T entidade);
}
