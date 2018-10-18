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
public class GestorFiltros {

    private CadenaFiltros cadena;
    private Interfaz objetivo;
    
    public GestorFiltros(Interfaz obj){
        this.objetivo=obj;
        this.cadena=new CadenaFiltros(this.objetivo);
    }
    
    public void setFiltro(Calcular cal){
    }
    
    public void envioPeticion(double vueltas){
        cadena.ejecutar(vueltas);
    }
}
