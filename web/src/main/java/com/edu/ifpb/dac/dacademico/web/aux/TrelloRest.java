/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ifpb.dac.dacademico.web.aux;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emanuel Batista da Silva Filho - https://github.com/emanuelbatista
 */
public class TrelloRest {

    public static final String idBoard="56489937e84b54c1a6fb320d";
    public static final String chave="b5778637bcc6a8c1b56f96ed5d296832";
    private final String urlDefaul = "https://api.trello.com/1:url:";

    public String addUrl(String metodo, String caminho, Map<String, String> param) {
        try {
            URL url = new URL(this.prepareUrl(caminho));
            HttpURLConnection uRLConnection = (HttpURLConnection) url.openConnection();
            uRLConnection.setRequestMethod("POST");
            uRLConnection.setRequestProperty("key", chave);
            if (param != null) {
                for (Map.Entry<String, String> entrySet : param.entrySet()) {
                    String key = entrySet.getKey();
                    String value = entrySet.getValue();
                    uRLConnection.setRequestProperty(key, value);
                }
            }
            InputStream inputStream=uRLConnection.getInputStream();
            if(inputStream!=null){
                return convertInputStream(inputStream);
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(TrelloRest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TrelloRest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private String prepareUrl(String url) {
        return urlDefaul.replace(":url:", url);
    }

    private String convertInputStream(InputStream in) {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = null;
        String line;
        try {

            br = new BufferedReader(new InputStreamReader(in));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return sb.toString();
    }

}
