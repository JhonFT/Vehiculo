/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehiculos.bo;

import com.mycompany.vehiculos.dao.VehiculoDAO;
import com.mycompany.vehiculos.dto.Vehiculos;
import java.util.List;

/**
 *
 * @author Home
 */
public class VehiculoBO {

    VehiculoDAO dao;

    public VehiculoBO() {
        dao = new VehiculoDAO();
    }

    public List<Vehiculos> getVehiculo() {
        return dao.getAll();
    }

    public List<Vehiculos> add(Vehiculos v) {
        dao.add(v);
        return getVehiculo();

    }

}
