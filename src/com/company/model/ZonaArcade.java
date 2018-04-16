package com.company.model;

import java.text.ParseException;
import java.util.Date;
import java.util.Random;

public class ZonaArcade extends Atraccion {
    Random random = new Random();

    @Override public void cambiarAtr(){
        open = 21;
        maintenance = random.nextBoolean();
        minHeight = 1.10;
        maxHeight = 2.30;
        price = 2;
    }

    @Override public void cargarSeccion(Seccion seccionPasada) {
        super.cargarSeccion(seccionPasada);

    }
}
