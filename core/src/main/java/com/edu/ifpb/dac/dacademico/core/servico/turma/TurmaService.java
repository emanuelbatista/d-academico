package com.edu.ifpb.dac.dacademico.core.servico.turma;

import com.edu.ifpb.dac.dacademico.core.exceptions.EntidadeInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Turma;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

/**
 *
 * @author douglasgabriel
 */
public interface TurmaService {
    
    void salvar(Turma turma) throws ValidacaoException;
    void remover (Turma turma);
    Turma buscar (long id) throws EntidadeInexistenteException;
    void atualizar (Turma turma) throws ValidacaoException;
    void urlParaBanco(String host) throws MalformedURLException, IOException;
    List<Turma> listarTodos();
    Turma buscarPelaIdentificacao(String id) throws EntidadeInexistenteException;
    
}
