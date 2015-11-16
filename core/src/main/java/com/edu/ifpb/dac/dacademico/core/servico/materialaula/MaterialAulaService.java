package com.edu.ifpb.dac.dacademico.core.servico.materialaula;

import com.dropbox.core.DbxException;
import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.entidades.dominio.MaterialAula;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Turma;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.http.Part;

/**
 *
 * @author douglasgabriel
 */
public interface MaterialAulaService {
 
    public void salvar (Turma turma, MaterialAula material, byte[] part) 
            throws DbxException, IOException, ValidacaoException;
    
}
