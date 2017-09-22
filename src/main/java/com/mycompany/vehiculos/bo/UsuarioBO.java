/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehiculos.bo;

import com.mycompany.vehiculos.dao.UsuarioDAO;
import com.mycompany.vehiculos.dto.Usuario;

/**
 *
 * @author Home
 */
public class UsuarioBO {
    UsuarioDAO dao;

    public UsuarioBO() {
        dao = new  UsuarioDAO();
    }
    
    public boolean add(Usuario user){
        return dao.add(user);
    }
    
    public  Usuario validUser(Usuario u){
        return dao.findUsuer(u);
    }
}
