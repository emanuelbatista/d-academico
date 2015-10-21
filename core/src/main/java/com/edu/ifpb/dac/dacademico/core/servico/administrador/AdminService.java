package com.edu.ifpb.dac.dacademico.core.servico.administrador;

import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.SenhaErradaException;
import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Administrador;
import java.util.List;

/**
 *
 * @author douglasgabriel
 */
public interface AdminService {
    
    void salvar (Administrador admin) throws ValidacaoException;
    
    void atualizar (Administrador admin);
    
    void remover (Administrador admin);
    
    public Administrador login (String login, String senha) 
            throws LoginInexistenteException, SenhaErradaException;
    
    public List<Administrador> listarTodos ();
    
    public Administrador recuperarPeloLogin(String login) throws LoginInexistenteException;
}
