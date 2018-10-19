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

@ManagedBean(name = "controlador", eager = true)
@RequestScoped
public class Controlador implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final String APAGADO = "0";
    private static final String ENCENDIDO = "1";
    private static final String ACELERANDO = "2";

    private static final String TEXTO_APAGADO = "Apagado";
    private static final String TEXTO_ENCENDIDO = "Endendido";

    private static final String TEXTO_ACELERANDO = "Acelerando";
    private static final String TEXTO_ENCENDER = "Endender";
    private static final String TEXTO_APAGAR = "Apagar";

    private static final String TEXTO_ACELERAR = "Acelerar";

    private static final String COLOR_ROJO = "red";
    private static final String COLOR_VERDE = "green";
    private static final String COLOR_AZUL = "blue";

    private static final boolean BOTON_ACTIVADO = true;
    private static final boolean BOTON_APAGADO = false;

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
}
