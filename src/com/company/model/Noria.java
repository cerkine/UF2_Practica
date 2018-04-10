package com.company.model;

import java.util.Random;

public class Noria extends Atraccion{
    Random random = new Random();

    @Override public void cambiarAtr(){
        open = random.nextBoolean();
        maintenance = random.nextBoolean();
        minHeight = 1.10;
        maxHeight = 2.30;
        price = 2;
    }

    @Override public void cargarSeccion(Seccion seccionPasada) {
        super.cargarSeccion(seccionPasada);

    }

}
