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
public class DemoInterceptor {

    public static void main(String[] args) {
        System.out.println("Ejecución de la clase principal");
        
        GestorFiltros gestorFiltros= new GestorFiltros(new Interfaz());
        gestorFiltros.setFiltro(new Calcular());
        Cliente cliente= new Cliente();
        cliente.setGestorFiltros(gestorFiltros);
        cliente.enviarPetición(500);
    }
}
