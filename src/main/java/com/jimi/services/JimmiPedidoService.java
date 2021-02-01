/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jimi.services;

import com.jimi.config.API;
import com.jimi.model.Pedido;
import com.jimi.model.PedidoRet;
import com.jimi.model.RetornoBase;
import kong.unirest.Unirest;

/**
 *
 * @author Renato
 */
public class JimmiPedidoService {

    public RetornoBase simular(PedidoRet obj) {
        return Unirest.post("http://private-anon-bc9a2ef489-jimirobo.apiary-proxy.com/robo/v3/simulapedido" + API.token)
                .body(obj)
                .asObject(RetornoBase.class).getBody();
    }

    public Pedido buscar() {
        return Unirest.get("http://3.212.28.157:1690/robo/v3/buscapedidos" + API.token)
                .asObject(Pedido.class).getBody();
    }

    public RetornoBase fechar(String comanda) {
        return Unirest.get("http://3.212.28.157:1690/robo/v3/fechapedidos" + API.token + "&comanda=" + comanda)
                .asObject(RetornoBase.class).getBody();
    }
}
