package com.edu.ifpb.dac.dacademico.core.servico.materialaula;

import com.dropbox.core.DbxClient;
import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.DbxWriteMode;
import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.core.servico.turma.TurmaServiceLocal;
import com.edu.ifpb.dac.dacademico.entidades.dominio.MaterialAula;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Turma;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Stateless
@Remote(MaterialAulaService.class)
public class MaterialAulaServiceImpl implements MaterialAulaService{

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
    @Override
    public void salvar (Turma turma, MaterialAula material, byte[] part) 
            throws DbxException, IOException, ValidacaoException{
        InputStream is = new ByteArrayInputStream(part);
        String diretorioParaSalvar = "/"+turma.getCod()+"/"+material.getNome();
        client.uploadFile(
                diretorioParaSalvar
                , DbxWriteMode.add()
                , is.available()
                , is
        );
        material.setLink(client.createShareableUrl(
                diretorioParaSalvar)
        );
        turma.addMaterialAula(material);
        turmaService.atualizar(turma);
    }
    
}
