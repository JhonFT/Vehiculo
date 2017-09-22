/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehiculos.bean;

import com.mycompany.vehiculos.bo.UsuarioBO;
import com.mycompany.vehiculos.dto.Usuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Home
 */
@ManagedBean
@SessionScoped
public class LoginBean {

    private Usuario user;
    private FacesContext context;
    private UsuarioBO uBO;

    public LoginBean() {
        this.context = FacesContext.getCurrentInstance();
        this.user = new Usuario();
        this.uBO = new UsuarioBO();
    }

    public String authentication() {
        Usuario u = uBO.validUser(user);
        if( u != null) {
            this.context.getExternalContext().getSessionMap().put("user", u );
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
