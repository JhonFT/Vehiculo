/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehiculos.interfaces;

import java.util.List;

/**
 *
 * @author Home
 */
public interface ImplementGenericInterfaces<T> {

    public List<T> getAll();

    public T find();

    public boolean add(T t);

    public boolean remove(Long Id);
}
