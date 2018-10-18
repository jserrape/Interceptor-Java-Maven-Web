/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interceptor;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author Juan Carlos
 */
public class Interfaz {

    private final String URL;

    public Interfaz() {
        this.URL = "http://localhost:8080/interceptor/faces/home.xhtml";
    }

    public void ejecutar(double peticion) throws URISyntaxException, IOException {
        if (Desktop.isDesktopSupported()) {
            // Windows
            Desktop.getDesktop().browse(new URI(URL));
        } else {
            // Ubuntu
            Runtime runtime = Runtime.getRuntime();
            runtime.exec("/usr/bin/firefox -new-window " + URL);
        }
    }
}
