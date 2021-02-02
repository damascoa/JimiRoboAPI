/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jimi.services;

import com.google.gson.Gson;
import com.jimi.config.API;
import com.jimi.config.Auth;
import com.jimi.model.Pedido;
import com.jimi.model.PedidoRet;
import com.jimi.model.RetornoBase;
import kong.unirest.Unirest;

/**
 *
 * @author Renato
 */
public class JimmiPedidoService {

    private Auth auth;

    public JimmiPedidoService(Auth auth) {
        this.auth = auth;
    }

    public RetornoBase simular(PedidoRet obj) {
        return Unirest.post(auth.getUrlBase() + "/robo/v3/simulapedido" + auth.getToken())
                .body(obj)
                .asObject(RetornoBase.class).getBody();
    }

    public Pedido buscar() {
        String saida = Unirest.get(auth.getUrlBase() + "/robo/v3/buscapedidos" + auth.getToken())
                .asString().getBody();
        System.out.println(saida);
        return new Gson().fromJson(saida, Pedido.class);

    }

    public RetornoBase fechar(String comanda) {
        return Unirest.get(auth.getUrlBase() + "/robo/v3/fechapedidos" + auth.getToken() + "&comanda=" + comanda)
                .asObject(RetornoBase.class).getBody();
    }
}
