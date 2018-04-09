package com.company.model;

import java.util.Random;

public class Toroloco extends Atraccion{

    Random random = new Random();

    @Override public void CambiarAtr(){
        open = random.nextBoolean();
        maintenance = random.nextBoolean();
        minHeight = 1.00;
        maxHeight = 2.50;
        price = 1;
    }

    @Override public void CargarSeccion(Seccion seccionPasada) {
        super.CargarSeccion(seccionPasada);

    }

}