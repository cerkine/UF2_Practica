package com.company;

import java.util.Random;

public class ZonaArcade extends Atraccion {
    Random random = new Random();

    @Override void CambiarAtr(){
        open = random.nextBoolean();
        maintenance = random.nextBoolean();
    }

    @Override void CargarSeccion(Seccion seccionPasada) {
        super.CargarSeccion(seccionPasada);

    }

}
