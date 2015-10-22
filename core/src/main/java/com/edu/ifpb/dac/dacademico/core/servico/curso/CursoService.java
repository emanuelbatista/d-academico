package com.edu.ifpb.dac.dacademico.core.servico.curso;

import com.edu.ifpb.dac.dacademico.core.exceptions.EntidadeInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Curso;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

/**
 *
 * @author douglasgabriel
 */
public interface CursoService {

    void salvar(Curso curso) throws ValidacaoException;

    void remover(Curso curso);

    Curso buscar(long id) throws EntidadeInexistenteException;
    
    List<Curso> listarTodos(); 

    void atualizar(Curso curso) throws ValidacaoException;
    
    Curso buscarPorDescricao(String descricao);

    void urlParaBanco(String host) throws MalformedURLException, IOException;

}
