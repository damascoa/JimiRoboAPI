/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jimi.services;

import com.jimi.config.API;
import com.jimi.model.Comanda;
import com.jimi.model.RetornoBase;
import kong.unirest.Unirest;

/**
 *
 * @author Renato
 */
public class JimiComandaService {

    

    public Comanda listar() {
        return Unirest.get("https://private-anon-bc9a2ef489-jimirobo.apiary-proxy.com/robo/v2/comandabloqueada" + API.token)
                .asObject(Comanda.class).getBody();
    }

    public RetornoBase bloquear(String comanda) {
        String json  = "{ \"+comanda\":\" "+comanda+" \"}";
        return Unirest.post("https://private-anon-bc9a2ef489-jimirobo.apiary-proxy.com/robo/v2/comandabloqueada" + API.token)
                .body(json)
                .asObject(RetornoBase.class).getBody();
    }

    public RetornoBase liberar(String comanda) {
        return Unirest.delete("https://private-anon-bc9a2ef489-jimirobo.apiary-proxy.com/robo/v2/comandabloqueada" + API.token+"&comanda="+comanda)
                .asObject(RetornoBase.class).getBody();
    }
}
