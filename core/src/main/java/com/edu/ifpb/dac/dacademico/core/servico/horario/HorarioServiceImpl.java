package com.edu.ifpb.dac.dacademico.core.servico.horario;

import com.edu.ifpb.dac.dacademico.core.exceptions.EntidadeInexistenteException;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Horario;
import com.edu.ifpb.dac.dacademico.core.dao.Dao;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Stateless
@Remote(HorarioService.class)
public class HorarioServiceImpl implements HorarioService{

    @EJB
    private Dao<Horario, Long> repositorio;
    
    @Override
    public void salvar(Horario horario) {
        repositorio.salvar(horario);
    }

    @Override
    public Horario recuperar(Long cod) {
        return repositorio.buscar(Horario.class, cod);
    }

    @Override
    public Horario recuperarPelaDescricao(String descricao) throws EntidadeInexistenteException{
        try{
            return repositorio.buscarPorAtributo(Horario.class, "descricao", descricao).get(0);
        }catch (Exception e){
            throw new EntidadeInexistenteException();
        }
    }

    @Override
    public List<Horario> recuperarHorario(Object id, Class clazz) {
        Map<String,Object> param=new HashMap<>();
        param.put("cod", id);
        return repositorio.buscarPorNamedQueryList(Horario.class,"horario."+clazz.getSimpleName(), param);
    }

    
}
