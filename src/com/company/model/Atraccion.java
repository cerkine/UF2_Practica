package com.company.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Atraccion {
    public int open;
    public boolean maintenance;
    public double price;
    public double maxHeight;
    public double minHeight;
    public Seccion seccion;
    public int code_place;


    public void cambiarAtr() {

    }

    public void cargarSeccion(Seccion seccionPasada){
        seccion=seccionPasada;
    }


}
