package com.edu.ifpb.dac.dacademico.core.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Stateless
@Remote(Dao.class)
public class GenericoDaoJPA<T, K> implements Dao<T, K> {

    @PersistenceContext
    private EntityManager entityManager;

    public GenericoDaoJPA() {
    }

    @Override
    public void salvar(T entidade) {
        entityManager.persist(entidade);
    }

    @Override
    public void remover(T entidade) {
        entityManager.remove(entityManager.merge(entidade));
    }

    @Override
    public T buscar(Class<T> classe, Object chave) {
        return entityManager.find(classe, chave);
    }

    @Override
    public List<T> buscarPorAtributo(Class<T> classe, String nomeAtributo, Object valorAtributo) {
        Map<String, Object> mapa = new HashMap<>();
        mapa.put(nomeAtributo, valorAtributo);
        return buscarPorAtributos(classe, mapa);
    }

    @Override
    public List<T> buscarPorAtributos(Class<T> classe, Map<String, Object> propriedades) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT a FROM " + classe.getSimpleName() + " a WHERE ");
        boolean primeiraIteracao = true;
        for (String chave : propriedades.keySet()) {
            if (!primeiraIteracao) {
                sb.append("and");
            }
            if (propriedades.get(chave) instanceof String)
                sb.append(" a." + chave + " = \"" + propriedades.get(chave) + "\"");
            else
                sb.append(" a." + chave + " = " + propriedades.get(chave));
            primeiraIteracao = false;
        }
        List<T> resultado = entityManager.createQuery(sb.toString()).getResultList();
        return resultado;
    }

    @Override
    public void atualizar(T entidade) {
        entityManager.merge(entidade);
    }

    @Override
    public List<T> listarTodos(Class<T> classe) {
        return entityManager.createQuery("Select t from " + classe.getSimpleName() + " t").getResultList();
    }

    @Override
    public List<T> buscarPorNamedQueryList(Class<T> clazz, String nameQuery,Map<String,Object> param) {
        TypedQuery<T> typedQuery = entityManager.createNamedQuery(nameQuery, clazz);
       if(param!=null){
           param.entrySet().stream().forEach((entrySet) -> {
               typedQuery.setParameter(entrySet.getKey(), entrySet.getValue());
            });
       }
        return typedQuery.getResultList();
    }

}
