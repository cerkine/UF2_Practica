package com.company;

import java.util.Random;

public class MontañaRusa extends Atraccion {

    Random random = new Random();

    @Override void CambiarAtr(){
        open = random.nextBoolean();
        maintenance = random.nextBoolean();
        minHeight = 1.20;
        maxHeight = 0;
        price = 5;
    }

    @Override void CargarSeccion(Seccion seccionPasada) {
        super.CargarSeccion(seccionPasada);

    }


}
