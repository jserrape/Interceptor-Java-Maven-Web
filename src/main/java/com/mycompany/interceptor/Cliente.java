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
public class Cliente {
    private GestorFiltros gestor;
    
    public Cliente(){}
    
    public void setGestorFiltros(GestorFiltros g){
        this.gestor=g;
    }
    
    public void enviarPetición(double vueltas){
        this.gestor.envioPeticion(vueltas);
    }
}
