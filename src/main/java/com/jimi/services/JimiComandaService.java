/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jimi.services;

import com.jimi.config.API;
import com.jimi.config.Auth;
import com.jimi.model.Comanda;
import com.jimi.model.RetornoBase;
import kong.unirest.Unirest;

/**
 *
 * @author Renato
 */
public class JimiComandaService {

    private Auth auth;

    public JimiComandaService(Auth auth) {
        this.auth = auth;
    }

    public Comanda listar() {
        return Unirest.get(auth.getUrlBase() + "/robo/v2/comandabloqueada" + auth.getToken())
                .asObject(Comanda.class).getBody();
    }

    public RetornoBase bloquear(String comanda) {
        String json = "{ \"+comanda\":\" " + comanda + " \"}";
        return Unirest.post(auth.getUrlBase() + "/robo/v2/comandabloqueada" + auth.getToken())
                .body(json)
                .asObject(RetornoBase.class).getBody();
    }

    public RetornoBase liberar(String comanda) {
        return Unirest.delete(auth.getUrlBase() + "/robo/v2/comandabloqueada" + auth.getToken() + "&comanda=" + comanda)
                .asObject(RetornoBase.class).getBody();
    }
}
