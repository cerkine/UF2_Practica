package com.company.model;

import java.text.ParseException;
import java.util.Date;
import java.util.Random;

public class Toroloco extends Atraccion{

    Random random = new Random();

    @Override public void cambiarAtr(){
        open = 10;
        maintenance = random.nextBoolean();
        minHeight = 1.00;
        maxHeight = 2.50;
        price = 1;
    }

    @Override public void cargarSeccion(Seccion seccionPasada) {
        super.cargarSeccion(seccionPasada);

    }

}
