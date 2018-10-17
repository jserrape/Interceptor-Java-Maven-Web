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
public class Calcular {

    private final double intervalo = 5;

    public double ejecutar(Object o) {
        return ((double) o) * 3600 / intervalo;
    }
}
