package com.company.model;

public class Atraccion {
    public boolean open;
    public boolean maintenance;
    public double price;
    public double maxHeight;
    public double minHeight;
    public Seccion seccion;
    public int code_place;


    public void CambiarAtr () {

    }

    public void CargarSeccion(Seccion seccionPasada){
        seccion=seccionPasada;
    }


}
