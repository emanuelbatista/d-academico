package com.edu.ifpb.dac.dacademico.entidades.persistencia;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class GenericoDaoJPA<T, K> implements Dao<T, K>{

    private EntityManager entityManager;
    private String unidadePersistencia;
    
    public GenericoDaoJPA(String unidadePersistencia){
        this.unidadePersistencia = unidadePersistencia;
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
    public List<T> buscarPorAtributo (Class<T> classe, String nomeAtributo, Object valorAtributo){
        Map<String, Object> mapa = new HashMap<>();
        mapa.put(nomeAtributo, valorAtributo);
        return buscarPorAtributos(classe, mapa);
    }
    
    @Override
    public List<T> buscarPorAtributos (Class<T> classe, Map<String, Object> propriedades){
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT a FROM "+ classe.getSimpleName() +" a WHERE ");
        boolean primeiraIteracao = true;
        for (String chave : propriedades.keySet()){
            if (!primeiraIteracao)
                sb.append("and ");
            sb.append("a." + chave + " = \"" + propriedades.get(chave)+"\"");
            primeiraIteracao = false;
        }
        List<T> resultado = entityManager.createQuery(sb.toString()).getResultList();
        return resultado;
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
    
    public String getUnidadePersistencia(){        
        return unidadePersistencia;
    }
    

}
