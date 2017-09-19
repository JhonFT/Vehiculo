/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehiculos.dao;

import com.mycompany.veehiculo.helper.ConnectionDB;
import com.mycompany.vehiculos.dto.Usuario;
import com.mycompany.vehiculos.interfaces.ImplementGenericInterfaces;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Home
 */
public class UsuarioDAO implements ImplementGenericInterfaces<Usuario> {

    ConnectionDB conn;
    private static final String ADDSQL = "INSER INTO USUARIO(USU_NICKNAME,USU_CLAVE) VALUES (?,?)";
    private static final String ALLSQL = "SELECT * FROM USUARIO";

    public UsuarioDAO() {
        conn = new ConnectionDB();
    }

    @Override
    public boolean add(Usuario user) {
        try {
            PreparedStatement ps = conn.getConnetion().prepareStatement(ADDSQL);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getUsername());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean remove(Long ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario find() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
