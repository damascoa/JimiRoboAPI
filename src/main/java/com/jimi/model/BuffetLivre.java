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
public class BuffetLivre {

    private Integer codigoProdutoErp;
    private String descricao;
    private String preco;

    public BuffetLivre() {
    }

    public Integer getCodigoProdutoErp() {
        return codigoProdutoErp;
    }

    public void setCodigoProdutoErp(Integer codigoProdutoErp) {
        this.codigoProdutoErp = codigoProdutoErp;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

}
