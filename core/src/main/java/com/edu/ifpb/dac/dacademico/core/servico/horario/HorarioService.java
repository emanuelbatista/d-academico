package com.edu.ifpb.dac.dacademico.core.servico.horario;

import com.edu.ifpb.dac.dacademico.core.exceptions.EntidadeInexistenteException;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Horario;
import java.util.List;

/**
 *
 * @author douglasgabriel
 */
public interface HorarioService {

    void salvar (Horario horario);
    Horario recuperar (Long cod);
    Horario recuperarPelaDescricao(String descricao) throws EntidadeInexistenteException;
    List<Horario> recuperarHorario(Object id,Class clazz);
}
