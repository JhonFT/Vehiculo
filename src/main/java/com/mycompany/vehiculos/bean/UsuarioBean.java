/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehiculos.bean;

import com.mycompany.vehiculos.bo.UsuarioBO;
import com.mycompany.vehiculos.dto.Usuario;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Home
 */
@ManagedBean
public class UsuarioBean {

    private Usuario usuario;
    private UsuarioBO bo;

    public UsuarioBean() {
        bo = new UsuarioBO();
    }
    
    

    public void add() {
        if(bo.add(usuario)){
            System.out.println("Insert");
        }else{
            System.out.println("Error");
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
