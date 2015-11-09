package com.edu.ifpb.dac.dacademico.core.dao;

import java.util.List;
import java.util.Map;

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
    public List<T> buscarPorAtributos (Class<T> classe, Map<String, Object> propriedades);
    public List<T> buscarPorAtributo (Class<T> classe, String nomeAtributo, Object valorAtributo);
    void atualizar (T entidade);
    List<T> listarTodos (Class<T> classe);
    public List<T> buscarPorNamedQueryList(Class<T> clazz,String nameQuery,Map<String,Object> param);
}
