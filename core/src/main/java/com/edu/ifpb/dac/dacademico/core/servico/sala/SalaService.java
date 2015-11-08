package com.edu.ifpb.dac.dacademico.core.servico.sala;

import com.edu.ifpb.dac.dacademico.core.exceptions.EntidadeInexistenteException;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Laboratorio;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Sala;
import com.edu.ifpb.dac.dacademico.entidades.dominio.SalaNormal;
import com.edu.ifpb.dac.dacademico.entidades.dominio.SalaTipo;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

/**
 *
 * @author douglasgabriel
 */
public interface SalaService {

    void salvar(Sala sala);
    public void salvarLaboratorio(Sala sala);
    public void salvarSalaNormal (Sala sala);
    void remover (Sala sala);
    Sala buscar (long id);
    void atualizar (Sala sala);
    void urlParaBanco(String host, SalaTipo tipo) throws MalformedURLException, IOException;
    public List<SalaNormal> listarTodosSalasNormais();
    public SalaNormal buscarSalaNormal (long id);
    public SalaNormal buscarSalaNormalPelaAbreviacao (String abreviacao) throws EntidadeInexistenteException;
    public Laboratorio buscarLaboratorio (long id);
    public Laboratorio buscarLaboratorioPelaAbreviacao (String abreviacao) throws EntidadeInexistenteException;
    public Sala buscarPelaAbreviacao (String abr) throws EntidadeInexistenteException;

    public List<Laboratorio> listarTodosLaboratorios();
}
