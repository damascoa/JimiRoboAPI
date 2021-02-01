/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jimi.services;

import com.jimi.config.API;
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

    public Produto listar() {
        return Unirest.get("https://private-anon-bc9a2ef489-jimirobo.apiary-proxy.com/thirdpartycontroller/v2/produto" + API.token)
                .asObject(Produto.class).getBody();
    }

    public RetornoBase criarEditar(ProdutoRet produto) {
        return Unirest.post("https://private-anon-bc9a2ef489-jimirobo.apiary-proxy.com/thirdpartycontroller/v2/produto" + API.token)
                .body(produto)
                .asObject(RetornoBase.class).getBody();
    }

    public RetornoBase excluir(String codigoERP) {
        return Unirest.delete("https://private-anon-bc9a2ef489-jimirobo.apiary-proxy.com/thirdpartycontroller/v2/produto" + API.token + "codigoProdutoErp=" + codigoERP)
                .asObject(RetornoBase.class).getBody();
    }

    public RetornoBase excluirTodos() {
        return Unirest.delete("https://private-anon-bc9a2ef489-jimirobo.apiary-proxy.com/thirdpartycontroller/v2/produto" + API.token)
                .asObject(RetornoBase.class).getBody();
    }
}
