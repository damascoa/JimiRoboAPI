/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jimi.services;

import com.google.gson.Gson;
import com.jimi.config.API;
import com.jimi.config.Auth;
import com.jimi.model.Empresa;
import com.jimi.model.EmpresaRet;
import com.jimi.model.RetornoBase;
import kong.unirest.Unirest;

/**
 *
 * @author Renato
 */
public class JimmiEmpresaService {

    private Auth auth;

    public JimmiEmpresaService(Auth auth) {
        this.auth = auth;
    }

    public Empresa consultar() {
        return Unirest.get(auth.getUrlBase() + "/thirdpartycontroller/v2/configuracaoempresa" + auth.getToken())
                .asObject(Empresa.class).getBody();
    }

    public RetornoBase editar(EmpresaRet obj) {
        return Unirest.put(auth.getUrlBase() + "/thirdpartycontroller/v2/configuracaoempresa" + auth.getToken())
                .body(obj)
                .asObject(RetornoBase.class).getBody();
    }
}
