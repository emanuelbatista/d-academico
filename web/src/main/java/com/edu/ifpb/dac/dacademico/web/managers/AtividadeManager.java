/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ifpb.dac.dacademico.web.managers;

import com.edu.ifpb.dac.dacademico.core.servico.atividade.AtividadeService;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Atividade;
import com.edu.ifpb.dac.dacademico.web.aux.TrelloRest;
import java.io.Serializable;
import java.net.URL;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.trello4j.Trello;
import org.trello4j.TrelloImpl;

/**
 *
 * @author Emanuel Batista da Silva Filho - https://github.com/emanuelbatista
 */
@ConversationScoped
@Named
public class AtividadeManager implements Serializable {

    @EJB
    private AtividadeService atividadeService;
    private Trello trello;
    private TrelloRest trelloRest;
    private Atividade atividade;
    @Inject
    private Conversation conversation;

    public AtividadeManager() {
        this.atividade = new Atividade();
        this.trelloRest = new TrelloRest();
        this.trello = new TrelloImpl(TrelloRest.chave);
    }

    public void addAtividade() {
        if (!contemList()) {
            addList(atividade.getTurma().getIdentificacao());
        }
        for (org.trello4j.model.List list : trello.getListByBoard(TrelloRest.idBoard)) {
            if (list.getName().equals(atividade.getTurma().getIdentificacao())) {
                addCard(atividade.getTitulo(), atividade.getDescricao(), list.getName());
                break;
            }
        }
        atividadeService.salvar(atividade);

    }

    private boolean contemList() {
        List<org.trello4j.model.List> list = trello.getListByBoard(TrelloRest.idBoard);
        boolean contem = false;
        for (org.trello4j.model.List list1 : list) {
            if (list1.getName().equals(atividade.getTurma().getIdentificacao())) {
                contem = true;
                break;
            }
        }
        return contem;
    }

    private void addList(String nameList) {
        Map<String, String> param = new HashMap<>();
        param.put("name", nameList);
        trelloRest.addUrl("POST", "/boards/" + TrelloRest.idBoard + "/lists", param);
    }

    private void addCard(String titulo, String descricao,String idList) {
        Map<String, String> param = new HashMap<>();
        param.put("name", titulo);
        param.put("desc", descricao);
        param.put("due", null);
        param.put("idList", idList);
        trelloRest.addUrl("POST", "/cards", param);
    }

    public AtividadeService getAtividadeService() {
        return atividadeService;
    }

    public void setAtividadeService(AtividadeService atividadeService) {
        this.atividadeService = atividadeService;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }

}
