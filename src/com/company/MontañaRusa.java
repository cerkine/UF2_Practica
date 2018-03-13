package com.company;

public class MontañaRusa extends Atraccion {

    @Override void CambiarAtr(){
        open = true;
        maintenance = false;
        minHeight = 1.20;
        maxHeight = 0;
        price = 5;
    }

    @Override
    void CargarSeccion(Seccion seccionPasada) {
        super.CargarSeccion(seccionPasada);

    }


}
