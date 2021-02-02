/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jimi.config;

/**
 *
 * @author Renato
 */
public class Auth {

    private String urlBase;
    private String token;

    public Auth(String urlBase, String token) {
        this.urlBase = urlBase;
        this.token = token;
    }

    public String getUrlBase() {
        return urlBase;
    }

    public void setUrlBase(String urlBase) {
        this.urlBase = urlBase;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
