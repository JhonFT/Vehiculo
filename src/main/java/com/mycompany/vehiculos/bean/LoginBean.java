/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehiculos.bean;

import javax.faces.bean.ManagedBean;


/**
 *
 * @author Home
 */

@ManagedBean
public class LoginBean {
    
    private String user;
    private String pass;
    
    public String authentication(){
        if(user.toLowerCase().trim().equals("incca") 
                && pass.toLowerCase().trim().equals("1234") ){
            return "listar";
        }
        return null;
    }
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
       
}
