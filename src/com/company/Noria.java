package com.company;

import java.util.Random;

public class Noria extends Atraccion{
    Random random = new Random();

    @Override void CambiarAtr(){
        open = random.nextBoolean();
        maintenance = random.nextBoolean();
        minHeight = 1.10;
        maxHeight = 2.30;
        price = 2;
    }

    @Override void CargarSeccion(Seccion seccionPasada) {
        super.CargarSeccion(seccionPasada);

    }

}
