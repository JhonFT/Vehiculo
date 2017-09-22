/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehiculos.dao;

import com.mycompany.veehiculo.helper.ConnectionDB;
import com.mycompany.vehiculos.dto.Vehiculos;
import com.mycompany.vehiculos.interfaces.ImplementGenericInterfaces;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Home
 */
public class VehiculoDAO implements ImplementGenericInterfaces<Vehiculos> {

    private static final String ADDSQL = "INSER INTO USUARIO(USU_,USU_)";
    private static final String ALLSQL = "SELECT * FROM USUARIO";
    private static final String FINDSQL = "INSER INTO USUARIO(USU_,USU_)";
    ConnectionDB conn;

    public VehiculoDAO() {
        conn = new ConnectionDB();
    }

    @Override
    public List<Vehiculos> getAll() {
        List<Vehiculos> vehiculos = new ArrayList<>();
        try {
            Statement s =  conn.getConnetion().createStatement();
            ResultSet r = s.executeQuery(ALLSQL);
            while (r.next()) {                
                Vehiculos v = new Vehiculos();
                v.setCodigo(r.getLong("car_code"));
                v.setModel(r.getString("car_modelo"));
                v.setPlaca(r.getString("car_placa"));
                vehiculos.add(v);
            }
            return  vehiculos;
        } catch (SQLException ex) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return vehiculos;
        }
    }

    @Override
    public Vehiculos find() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Vehiculos t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Long Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
