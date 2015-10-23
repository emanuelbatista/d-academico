package com.edu.ifpb.dac.dacademico.core.servico.disciplina;

import com.edu.ifpb.dac.dacademico.core.exceptions.EntidadeInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Curso;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Disciplina;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

/**
 *
 * @author douglasgabriel
 */
public interface DisciplinaService {

    void salvar(Disciplina disciplina) throws ValidacaoException;
    void remover (Disciplina disciplina);
    Disciplina buscar (long id) throws EntidadeInexistenteException;
    void atualizar (Disciplina disciplina) throws ValidacaoException;
    void urlParaBanco(String host) throws MalformedURLException, IOException;
    List<Disciplina> listarTodos();
    List<Disciplina> buscarPeloCurso(Curso curso);
    
}
