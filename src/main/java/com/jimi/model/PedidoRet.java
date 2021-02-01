/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jimi.model;

/**
 *
 * @author Renato
 */
public class PedidoRet {

    private Integer codProdutoErp;
    private String quantidade;
    private String valorTotal;
    private String comanda;
    private String data;
    private String hora;

    public PedidoRet() {
    }

    public Integer getCodProdutoErp() {
        return codProdutoErp;
    }

    public void setCodProdutoErp(Integer codProdutoErp) {
        this.codProdutoErp = codProdutoErp;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getComanda() {
        return comanda;
    }

    public void setComanda(String comanda) {
        this.comanda = comanda;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

}
