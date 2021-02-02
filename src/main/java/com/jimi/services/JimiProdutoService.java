/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jimi.services;

import com.jimi.config.API;
import com.jimi.config.Auth;
import com.jimi.model.Empresa;
import com.jimi.model.Produto;
import com.jimi.model.ProdutoRet;
import com.jimi.model.RetornoBase;
import kong.unirest.Unirest;

/**
 *
 * @author Renato
 */
public class JimiProdutoService {

    private Auth auth;

    public JimiProdutoService(Auth auth) {
        this.auth = auth;
    }

    public Produto listar() {
        return Unirest.get(auth.getUrlBase() + "/thirdpartycontroller/v2/produto" + auth.getToken())
                .asObject(Produto.class).getBody();
    }

    public RetornoBase criarEditar(ProdutoRet produto) {
        return Unirest.post(auth.getUrlBase() + "/thirdpartycontroller/v2/produto" + auth.getToken())
                .body(produto)
                .asObject(RetornoBase.class).getBody();
    }

    public RetornoBase excluir(String codigoERP) {
        return Unirest.delete(auth.getUrlBase() + "/thirdpartycontroller/v2/produto" + auth.getToken() + "codigoProdutoErp=" + codigoERP)
                .asObject(RetornoBase.class).getBody();
    }

    public RetornoBase excluirTodos() {
        return Unirest.delete(auth.getUrlBase() + "/thirdpartycontroller/v2/produto" + auth.getToken())
                .asObject(RetornoBase.class).getBody();
    }
}
