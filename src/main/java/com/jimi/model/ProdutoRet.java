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
public class ProdutoRet {

    private String codigoProdutoErp;
    private String descricao;
    private String preco;
    private BuffetLivre buffetLivre = null;
    private Boolean transformaEmLivre = false;
    private Integer tipoProduto;
    private String codigoBarras;
    private Boolean ativo;

    public ProdutoRet() {
    }

    public String getCodigoProdutoErp() {
        return codigoProdutoErp;
    }

    public void setCodigoProdutoErp(String codigoProdutoErp) {
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

    public BuffetLivre getBuffetLivre() {
        return buffetLivre;
    }

    public void setBuffetLivre(BuffetLivre buffetLivre) {
        this.buffetLivre = buffetLivre;
    }

    public Boolean getTransformaEmLivre() {
        return transformaEmLivre;
    }

    public void setTransformaEmLivre(Boolean transformaEmLivre) {
        this.transformaEmLivre = transformaEmLivre;
    }

    public Integer getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(Integer tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

}
