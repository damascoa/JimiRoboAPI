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
public class Empresa {

    private String ok;
    private String msg;
    private EmpresaRet ret;

    public Empresa() {
    }

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public EmpresaRet getRet() {
        return ret;
    }

    public void setRet(EmpresaRet ret) {
        this.ret = ret;
    }

}
