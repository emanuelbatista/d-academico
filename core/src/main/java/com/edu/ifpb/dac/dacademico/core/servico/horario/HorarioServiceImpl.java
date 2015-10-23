package com.edu.ifpb.dac.dacademico.core.servico.horario;

import com.edu.ifpb.dac.dacademico.core.exceptions.EntidadeInexistenteException;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Horario;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.Dao;
import com.edu.ifpb.dac.dacademico.entidades.persistencia.GenericoDaoJPA;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class HorarioServiceImpl implements HorarioService{

    private Dao<Horario, Long> repositorio;
    
    public HorarioServiceImpl(String unidadePersistencia){
        repositorio = new GenericoDaoJPA<>(unidadePersistencia);
    }

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
    
}
