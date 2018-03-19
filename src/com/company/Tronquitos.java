package com.company;

import java.util.Random;

public class Tronquitos extends Atraccion{

    Random random = new Random();

    @Override void CambiarAtr(){
        open = random.nextBoolean();
        maintenance = random.nextBoolean();
        minHeight = 1.40;
        maxHeight = 2.20;
        price = 2;
    }

    @Override void CargarSeccion(Seccion seccionPasada) {
        super.CargarSeccion(seccionPasada);

    }
}
