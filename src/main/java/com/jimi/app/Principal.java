/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jimi.app;

import com.jimi.model.Produto;
import com.jimi.model.ProdutoRet;
import com.jimi.model.RetornoBase;
import com.jimi.services.JimiProdutoService;

/**
 *
 * @author Renato
 */
public class Principal {

    public static void main(String[] args) {
//        JimmiEmpresaService service = new JimmiEmpresaService();
//        Empresa se = service.consultar();
//        System.out.println(se);

        JimiProdutoService service = new JimiProdutoService();

        RetornoBase rb = service.criarEditar(new ProdutoRet("0001", "Self Service", "29.90", 0, null, Boolean.TRUE));
        System.out.println(rb);
        Produto prod = service.listar();
        System.out.println(prod);

    }
}
