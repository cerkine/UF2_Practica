package com.company.model;

import java.util.Random;

public class AutosChoque extends Atraccion{
    Random random = new Random();

    @Override public void cambiarAtr(){
        open = 10;
        maintenance = random.nextBoolean();
        minHeight = 0;
        maxHeight = 1.60;
        price = 1;
    }

    @Override public void cargarSeccion(Seccion seccionPasada) {
        super.cargarSeccion(seccionPasada);

    }
}
