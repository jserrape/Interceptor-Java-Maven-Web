/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interceptor;

import java.io.Serializable;

/**
 *
 * @author juanca
 */
public class Controlador implements Serializable{
    
    private static final long serialVersionUID= 1L;
    
    private static final int APAGADO =0;
    private static final int ENCENDIDO =1;
    private static final int ACELERANDO =2;
    
    private static final String TEXTO_APAGADO ="Apagado";
    private static final String TEXTO_ENCENDIDO ="Endendido";
    private static final String TEXTO_ACELERANDO ="Acelerando";
    private static final String TEXTO_ENCENDER ="Endender";
    private static final String TEXTO_APAGAR ="Apagar";
    
    private static final String COLOR_ROJO ="red";
    private static final String COLOR_VERDE ="green";
    private static final String COLOR_AZUL ="blue";
}
