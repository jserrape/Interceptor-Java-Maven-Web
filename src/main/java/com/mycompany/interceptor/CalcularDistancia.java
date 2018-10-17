/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interceptor;

/**
 *
 * @author Juan Carlos
 */
public class CalcularDistancia implements Filtro {

    private final double radio = 3;
    private double revolAnt = 0.0;

    @Override
    public double ejecutar(Object o) {
        double revoluciones = (double) o;
        double distancia = ((revoluciones - this.radio) * 2 * this.radio * 3.1416);
        this.revolAnt = revoluciones;
        return distancia;
    }

}
