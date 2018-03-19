package com.company;

public class Seccion {
    int place;
    double height;
    double width;
    double area;
    String name;
    Seccion[] sitios = new Seccion[3];

    void ChangeSeccion() {
        sitios[0] = new Oceania();
        sitios[1] = new Africa();
        sitios[2] = new Europa();
        for (int i = 0; i < sitios.length; i++) {
            sitios[i].DatosSeccion();
        }
    }
    void DatosSeccion(){

    }
}
