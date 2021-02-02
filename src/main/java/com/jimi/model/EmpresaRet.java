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
    private Boolean trucarValor;
    private Integer qtdeEnter;

    public EmpresaRet() {
    }

    public EmpresaRet(String ipServidor) {
        this.ipServidor = ipServidor;
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

    public Boolean getTrucarValor() {
        return trucarValor;
    }

    public void setTrucarValor(Boolean trucarValor) {
        this.trucarValor = trucarValor;
    }

    public Integer getQtdeEnter() {
        return qtdeEnter;
    }

    public void setQtdeEnter(Integer qtdeEnter) {
        this.qtdeEnter = qtdeEnter;
    }

    @Override
    public String toString() {
        return "EmpresaRet{" + "nomeFantasia=" + nomeFantasia + ", ipServidor=" + ipServidor + ", imprimeCodigoEtiqueta=" + imprimeCodigoEtiqueta + ", trucarValor=" + trucarValor + ", qtdeEnter=" + qtdeEnter + '}';
    }

}
