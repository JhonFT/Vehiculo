/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehiculos.dao;

import com.mycompany.veehiculo.helper.ConnectionDB;
import com.mycompany.vehiculos.dto.Vehiculos;
import com.mycompany.vehiculos.interfaces.ImplementGenericInterfaces;
import java.util.List;

/**
 *
 * @author Home
 */
public class VehiculoDAO implements ImplementGenericInterfaces<Vehiculos> {

    private static final String ADDSQL = "INSER INTO USUARIO(USU_,USU_)";
    private static final String ALLSQL = "INSER INTO USUARIO(USU_,USU_)";
    private static final String FINDSQL = "INSER INTO USUARIO(USU_,USU_)";
    ConnectionDB conn;

    public VehiculoDAO() {
        conn = new ConnectionDB();
    }

    @Override
    public List<Vehiculos> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
