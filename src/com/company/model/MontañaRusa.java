package com.company.model;

import java.util.Random;

public class MontañaRusa extends Atraccion {

    Random random = new Random();

    @Override public void cambiarAtr(){
        open = random.nextBoolean();
        maintenance = random.nextBoolean();
        minHeight = 1.20;
        maxHeight = 2.00;
        price = 5;
    }

    @Override public void cargarSeccion(Seccion seccionPasada) {
        super.cargarSeccion(seccionPasada);

    }


}
