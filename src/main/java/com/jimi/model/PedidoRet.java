/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jimi.model;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    private String formataData(Date data, String pattern) {
        DateFormat df = new SimpleDateFormat(pattern);
        return df.format(data);
    }

    public PedidoRet(Integer codProdutoErp, BigDecimal quantidade, BigDecimal valorTotal, String comanda, Date data) {
        this.codProdutoErp = codProdutoErp;
        this.quantidade = quantidade.toString();
        this.valorTotal = valorTotal.toString();
        this.comanda = comanda;
        this.data = formataData(data, "dd-MM-yyyy");
        this.hora = formataData(data, "HH:mm:ss");;
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
