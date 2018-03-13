package com.company;

public class Tiovivo extends Atraccion {

    int asientos = 20;

    @Override void CambiarAtr(){
        open = true;
        maintenance = false;
        minHeight = 0;
        maxHeight = 1.60;
        price = 3;

    }
    @Override void CargarSeccion(Seccion seccionPasada){
        seccion=seccionPasada.seccions[0];
    }

}
