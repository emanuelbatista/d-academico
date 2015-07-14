package com.edu.ifpb.dac.dacademico.entidades.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class GenericoDaoJPA<T, K> implements Dao<T, K>{

    EntityManager entityManager;
    
    public GenericoDaoJPA(String unidadePersistencia){
        entityManager = Persistence
                .createEntityManagerFactory(unidadePersistencia)
                .createEntityManager();
    }
    
    @Override
    public void salvar(T entidade) {
        EntityTransaction transacao = entityManager.getTransaction();
        try{
            transacao.begin();
            entityManager.persist(entidade);
            transacao.commit();
        }catch (Exception ex){
            ex.printStackTrace();
            transacao.rollback();
        }
    }

    @Override
    public void remover(T entidade) {
        EntityTransaction transacao = entityManager.getTransaction();
        try{
            transacao.begin();
            entityManager.remove(entidade);
            transacao.commit();
        }catch (Exception ex){
            ex.printStackTrace();
            transacao.rollback();
        }
    }

    @Override
    public T buscar(Class<T> classe, Object chave) {
        return entityManager.find(classe, chave);
    }   

    @Override
    public void atualizar(T entidade) {
        EntityTransaction transacao = entityManager.getTransaction();
        try{
            transacao.begin();
            entityManager.merge(entidade);
            transacao.commit();
        }catch(Exception e){
            e.printStackTrace();
            transacao.rollback();
        }
    }

}
