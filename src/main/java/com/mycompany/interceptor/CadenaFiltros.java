/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interceptor;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan Carlos
 */
public class CadenaFiltros {

    private final ArrayList<Filtro> filtros;
    private Interfaz objetivo;

    public CadenaFiltros(Interfaz obj) {
        this.filtros = new ArrayList<>();
        this.objetivo = obj;
    }

    public void addFiltro(Filtro e) {
        filtros.add(e);
    }

    public void ejecutar(double peticion) {
        for (Filtro filtro : filtros) {
            System.out.println("Nueva velocidad(m/s) " + filtro.ejecutar(peticion));
        }
        try {
            objetivo.ejecutar(peticion);
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(CadenaFiltros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setObjetivo(Interfaz obj) {
        this.objetivo = obj;
    }

}
