package com.company.manager;

import com.company.model.Seccion;

public class Gestion {

    public static void cargarParque() {


        Seccion[] seccion = new Seccion[3];
        for (int i = 0; i<seccion.length ; i++) {
            seccion[i]= new Seccion();
        }
        seccion[0].DatosSeccion(seccion[0], 0, 2.50, 2.50, "Palacio Real");
        seccion[1].DatosSeccion(seccion[1], 1, 1.85, 2, "Ciudadela");
        seccion[2].DatosSeccion(seccion[2], 2, 0.5, 3.8, "Bosque NO Prohibido");


        for (int i = 0; i < seccion.length; i++) {
            for (int j = 0; j < GestionAtraccion.lista.length; j++) {
                if (seccion[i].getCode_place() == GestionAtraccion.lista[j].code_place) {
                    GestionAtraccion.lista[j].seccion = seccion[i];
                }
            }
        }



    }




}
