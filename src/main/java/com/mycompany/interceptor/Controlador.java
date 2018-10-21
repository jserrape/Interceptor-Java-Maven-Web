/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interceptor;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "controlador", eager = true)
@SessionScoped
public class Controlador implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final String TEXTO_APAGADO = "Apagado";
    private static final String TEXTO_ENCENDIDO = "Endendido";

    private static final String TEXTO_ACELERANDO = "Acelerando";
    private static final String TEXTO_ENCENDER = "Endender";
    private static final String TEXTO_APAGAR = "Apagar";

    private static final String TEXTO_ACELERAR = "Acelerar";

    private static final String COLOR_ROJO = "red";
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
        return this.titulo;
    }

    public void setTitulo(String m) {
        if (this.titulo == null) {
            this.titulo = this.TEXTO_APAGADO;
        } else {
            this.titulo = m;
        }
    }

    public String getTituloColor() {
        return this.tituloColor;
    }

    public void setTituloColor(String m) {
        if (this.tituloColor == null) {
            this.tituloColor = this.COLOR_ROJO;
        } else {
            this.tituloColor = m;
        }
    }

    public String getTextoOnOf() {
        return this.textoOnOf;
    }

    public void setTextoOnOf(String m) {
        if (this.textoOnOf == null) {
            this.textoOnOf = this.TEXTO_ENCENDER;
        } else {
            this.textoOnOf = m;
        }
    }

    public String getColorEncender() {
        return this.colorEncender;
    }

    public void setColorEncender(String m) {
        if (this.colorEncender == null) {
            this.colorEncender = this.COLOR_ROJO;
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
        if (this.estado == 0) {
            encender();
        } else {
            apagar();
        }
    }

    public void actionAcelerar(ActionEvent e) {
        acelerar();
    }

    private void encender() {
        setBotonHabilitado(true);
        setTitulo(this.TEXTO_ENCENDIDO);
        setTituloColor(this.COLOR_AZUL);
        setTextoOnOf(this.TEXTO_APAGAR);
        setColorEncender(this.COLOR_AZUL);
        this.estado = 1;
    }

    private void apagar() {
        setBotonHabilitado(false);
        setTitulo(this.TEXTO_APAGADO);
        setTituloColor(this.COLOR_ROJO);
        setTextoOnOf(this.TEXTO_ENCENDER);
        setColorEncender(this.COLOR_ROJO);
        this.estado = 0;
    }

    private void acelerar() {
        if(this.estado==1){
            setTitulo(this.TEXTO_ACELERANDO);
            this.estado=2;
        }
    }
}
