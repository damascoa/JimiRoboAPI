/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jimi.model;

import java.util.List;

/**
 *
 * @author Renato
 */
public class Pedido {

    private String msg;
    private Boolean ok;
    private List<PedidoRet> pedidos;

    public Pedido() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public List<PedidoRet> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<PedidoRet> pedidos) {
        this.pedidos = pedidos;
    }

}
