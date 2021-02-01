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
public class EmpresaRet {

    private String nomeFantasia;
    private String ipServidor;
    private Boolean imprimeCodigoEtiqueta;
    private Boolean truncarValor;
    private Integer qtdeEnter;

    public EmpresaRet() {
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getIpServidor() {
        return ipServidor;
    }

    public void setIpServidor(String ipServidor) {
        this.ipServidor = ipServidor;
    }

    public Boolean getImprimeCodigoEtiqueta() {
        return imprimeCodigoEtiqueta;
    }

    public void setImprimeCodigoEtiqueta(Boolean imprimeCodigoEtiqueta) {
        this.imprimeCodigoEtiqueta = imprimeCodigoEtiqueta;
    }

    public Boolean getTruncarValor() {
        return truncarValor;
    }

    public void setTruncarValor(Boolean truncarValor) {
        this.truncarValor = truncarValor;
    }

    public Integer getQtdeEnter() {
        return qtdeEnter;
    }

    public void setQtdeEnter(Integer qtdeEnter) {
        this.qtdeEnter = qtdeEnter;
    }

}
