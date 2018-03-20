package com.company.model;

import java.util.Random;

public class AutosChoque extends Atraccion{
    Random random = new Random();

    @Override public void CambiarAtr(){
        open = random.nextBoolean();
        maintenance = random.nextBoolean();
        minHeight = 0;
        maxHeight = 1.60;
        price = 1;
    }

    @Override public void CargarSeccion(Seccion seccionPasada) {
        super.CargarSeccion(seccionPasada);

    }
}
