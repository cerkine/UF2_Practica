package com.company;

public class Atraccion {
    Atraccion [] lista = new Atraccion[5];
    boolean open;
    boolean maintenance;
    double price;
    double maxHeight;
    double minHeight;
    Seccion seccion;
    String lugar;

    void Change(){
        lista[0]= new Tiovivo();
        lista[0].CambiarAtr();
        lista[0].CargarSeccion(seccion.sitios[0]);
        lista[1] = new MontañaRusa();
        lista[1].CambiarAtr();
        lista[1].CargarSeccion(seccion.sitios[1]);
    }

    void CambiarAtr () {

    }

    void CargarSeccion(Seccion seccionPasada){
    seccion=seccionPasada;
    }
}
