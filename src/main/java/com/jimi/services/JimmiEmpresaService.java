/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jimi.services;

import com.jimi.config.API;
import com.jimi.model.Empresa;
import com.jimi.model.EmpresaRet;
import com.jimi.model.RetornoBase;
import kong.unirest.Unirest;

/**
 *
 * @author Renato
 */
public class JimmiEmpresaService {

    public Empresa consultar() {
//        return Unirest.get("https://private-anon-bc9a2ef489-jimirobo.apiary-proxy.com/thirdpartycontroller/v2/configuracaoempresa" + API.token)
        return Unirest.get("http://3.212.28.157:1690/thirdpartycontroller/v2/configuracaoempresa" + API.token)
                .asObject(Empresa.class).getBody();
    }

    public RetornoBase editar(EmpresaRet obj) {
        return Unirest.put("https://private-anon-bc9a2ef489-jimirobo.apiary-proxy.com/thirdpartycontroller/v2/configuracaoempresa" + API.token)
                .body(obj)
                .asObject(RetornoBase.class).getBody();
    }
}
