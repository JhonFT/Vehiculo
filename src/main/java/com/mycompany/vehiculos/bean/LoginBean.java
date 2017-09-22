/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehiculos.bean;

import com.mycompany.vehiculos.dto.Usuario;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Home
 */
@ManagedBean
public class LoginBean {

    private Usuario user;

    public LoginBean() {
        user = new Usuario();
    }

    public String authentication() {
        if (user.getUsername().toLowerCase().trim().equals("incca")
                && user.getPass().toLowerCase().trim().equals("1234")) {
            return "listar";
        }
        return null;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
