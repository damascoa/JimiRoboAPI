/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jimi.model;

import java.util.List;

/**
 *
 * @author Renato
 */
public class Produto {

    private Boolean ok;
    private String msg;
    private List<ProdutoRet> ret;

    public Produto() {
    }

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<ProdutoRet> getRet() {
        return ret;
    }

    public void setRet(List<ProdutoRet> ret) {
        this.ret = ret;
    }

}
