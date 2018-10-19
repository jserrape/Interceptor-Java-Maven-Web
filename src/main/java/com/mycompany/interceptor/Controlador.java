/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interceptor;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "controlador", eager = true)
@RequestScoped
public class Controlador implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final String TEXTO_APAGADO = "Apagado";
    private static final String TEXTO_ENCENDIDO = "Endendido";

    private static final String TEXTO_ACELERANDO = "Acelerando";
    private static final String TEXTO_ENCENDER = "Endender";
    private static final String TEXTO_APAGAR = "Apagar";

    private static final String TEXTO_ACELERAR = "Acelerar";

    private static final String COLOR_ROJO = "red";
    private static final String COLOR_VERDE = "green";
    private static final String COLOR_AZUL = "blue";

    private int estado = 0;

    @ManagedProperty(value = "#{titulo}")
    private String titulo;

    @ManagedProperty(value = "#{tituloColor}")
    private String tituloColor;

    @ManagedProperty(value = "#{textoOnOf}")
    private String textoOnOf;

    @ManagedProperty(value = "#{colorEncender}")
    private String colorEncender;

    @ManagedProperty(value = "#{textoAcelerar}")
    private String textoAcelerar;

    @ManagedProperty(value = "#{botonHabilitado}")
    private boolean botonHabilitado;

    public Controlador() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String m) {
        if (this.titulo == null) {
            this.titulo = TEXTO_APAGADO;
        } else {
            this.titulo = m;
        }
    }

    public String getTituloColor() {
        return this.tituloColor;
    }

    public void setTituloColor(String m) {
        if (this.tituloColor == null) {
            this.tituloColor = COLOR_ROJO;
        } else {
            this.tituloColor = m;
        }
    }

    public String getTextoOnOf() {
        return this.textoOnOf;
    }

    public void setTextoOnOf(String m) {
        if (this.textoOnOf == null) {
            this.textoOnOf = TEXTO_ENCENDER;
        } else {
            this.textoOnOf = m;
        }
    }

    public String getColorEncender() {
        return this.colorEncender;
    }

    public void setColorEncender(String m) {
        if (this.colorEncender == null) {
            this.colorEncender = COLOR_ROJO;
        } else {
            this.colorEncender = m;
        }
    }

    public String getTextoAcelerar() {
        return this.textoAcelerar;
    }

    public void setTextoAcelerar(String m) {
        if (this.textoAcelerar == null) {
            this.textoAcelerar = TEXTO_ACELERAR;
        } else {
            this.textoAcelerar = m;
        }
    }

    public boolean getBotonHabilitado() {
        return this.botonHabilitado;
    }

    public void setBotonHabilitado(boolean m) {
        this.botonHabilitado = !m;
    }

    public void actionEncender(ActionEvent e) {
        System.out.println("Action" + this.estado);
        if (this.estado == 0) {
            System.out.println("Encender");
            encender();
        } else {
            System.out.println("Apagar");
            apagar();
        }
    }

    public void actionAcelerar(ActionEvent e) {
        acelerar();
    }

    private void encender() {
        setBotonHabilitado(true);
        setTitulo(TEXTO_ENCENDIDO);
        setTituloColor(COLOR_AZUL);
        setTextoOnOf(TEXTO_APAGAR);
        setColorEncender(COLOR_AZUL);
        System.out.println("Estado:" + this.estado);
        this.estado = 1;
        System.out.println("Estado:" + this.estado);
    }

    private void apagar() {
        setBotonHabilitado(false);
        setTitulo(TEXTO_APAGADO);
        setTituloColor(COLOR_ROJO);
        setTextoOnOf(TEXTO_ENCENDER);
        setColorEncender(COLOR_ROJO);
        this.estado = 0;
    }

    private void acelerar() {
    }
}
