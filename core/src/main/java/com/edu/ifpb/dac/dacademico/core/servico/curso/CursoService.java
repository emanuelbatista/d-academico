package com.edu.ifpb.dac.dacademico.core.servico.curso;

import com.edu.ifpb.dac.dacademico.entidades.dominio.Curso;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 *
 * @author douglasgabriel
 */
public interface CursoService {

    void salvar(Curso curso);

    void remover(Curso curso);

    Curso buscar(long id);

    void atualizar(Curso curso);

    void urlParaBanco(String host) throws MalformedURLException, IOException;

}
