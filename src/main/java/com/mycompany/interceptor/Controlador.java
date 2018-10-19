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

@ManagedBean(name = "holaMundo", eager = true)
@RequestScoped
public class Controlador implements Serializable {

    @ManagedProperty(value = "#{mensaje}")
    private Mensaje mensajeBean;
    private String mensaje = "Nada aun!";

    public Controlador() {
        System.out.println("Hola mundo ha comenzado!");
        System.out.println(mensaje);
    }

    public String getMensaje() {
        if (mensajeBean != null) {
            mensaje = mensajeBean.getMensaje();
        }
        return "Holaaaa";
    }

    public void setMensajeBean(Mensaje m) {
        this.mensajeBean = m;
    }
}
