package com.edu.ifpb.dac.dacademico.core.servico.materialaula;

import com.dropbox.core.DbxClient;
import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.DbxWriteMode;
import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.core.servico.turma.TurmaServiceLocal;
import com.edu.ifpb.dac.dacademico.entidades.dominio.MaterialAula;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Turma;
import java.io.IOException;
import java.io.InputStream;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Stateless
public class MaterialAulaServiceImpl {

    private static final String ACCESS_TOKEN = 
            "ZBXrmDZtSlsAAAAAAAAASjRNFTLDcFTZeqjx-SCzpgJLeSWEtDI_0Lh6TPdMppHA";
    
    private DbxRequestConfig config = new DbxRequestConfig("D-Acadêmico", null);
    private DbxClient client = new DbxClient(config, ACCESS_TOKEN);
    @EJB
    private TurmaServiceLocal turmaService;
    
    /**
     * O arquivo será salvo na conta da aplicação, na pasta nomeda a partir do Id
     * da turma, com o nome do material. Após o upload do arquivo, é gerado uma
     * url compartilhável e adicionada à entidade material.
     */
    public void salvar (Turma turma, MaterialAula material, InputStream is) 
            throws DbxException, IOException, ValidacaoException{
        client.uploadFile(
                turma.getCod()+"/"+material.getNome()
                , DbxWriteMode.add()
                , is.available()
                , is
        );
        material.setLink(client.createShareableUrl(
                turma.getCod()+"/"+material.getNome())
        );
        turma.addMaterialAula(material);
        turmaService.atualizar(turma);
    }
    
}
