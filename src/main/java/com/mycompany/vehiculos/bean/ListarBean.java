/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehiculos.bean;

import com.mycompany.vehiculos.bo.VehiculoBO;
import com.mycompany.vehiculos.dto.Vehiculos;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Home
 */

@ManagedBean
public class ListarBean {

    private Vehiculos vehiculo;
    private List<Vehiculos> vehiculos;
    private final VehiculoBO vBO;
    public ListarBean() {
        vehiculo = new Vehiculos();
        vBO = new VehiculoBO();
        init();
    }
    private void init(){
        vehiculos =  vBO.getVehiculo();
    }

    public void add() {
        vehiculos.add(vehiculo);
    }

    public Vehiculos getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculos vehiculo) {
        this.vehiculo = vehiculo;
    }

    public List<Vehiculos> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculos> vehiculos) {
        this.vehiculos = vehiculos;
    }

}
