package com.company;

import java.util.Random;

public class Tiovivo extends Atraccion {

    int asientos = 20;
    Random random = new Random();

    @Override void CambiarAtr(){
        open = random.nextBoolean();
        maintenance = random.nextBoolean();
        minHeight = 0;
        maxHeight = 1.60;
        price = 3;
        code_place=1;
    }

    @Override void CargarSeccion(Seccion seccionPasada) {
        super.CargarSeccion(seccionPasada);

    }
}
