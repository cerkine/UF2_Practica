package com.company.model;

import java.util.Random;

public class ZonaArcade extends Atraccion {
    Random random = new Random();

    @Override public void CambiarAtr(){
        open = random.nextBoolean();
        maintenance = random.nextBoolean();
        minHeight = 1.10;
        maxHeight = 2.30;
        price = 2;
    }

    @Override public void CargarSeccion(Seccion seccionPasada) {
        super.CargarSeccion(seccionPasada);

    }
}