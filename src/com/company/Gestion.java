package com.company;

public class Gestion {

    void CargarParque() {
        Seccion[] seccion = new Seccion[3];
        for (int i = 0; i<seccion.length ; i++) {
            seccion[i]= new Seccion();
        }
        seccion[0].DatosSeccion(seccion[0], 0, 2.50, 2.50, "Palacio Real");
        seccion[1].DatosSeccion(seccion[1], 1, 1.85, 2, "Ciudadela");
        seccion[2].DatosSeccion(seccion[2], 2, 0.5, 3.8, "Bosque NO Prohibido");
        Atraccion atraccion = new Atraccion();
        atraccion.Change();
//        atraccion.CargarSeccion(seccion[0]);


        for (int i = 0; i < seccion.length; i++) {
            for (int j = 0; j < atraccion.numeroAtracciones; j++) {
                if (seccion[i].code_place == atraccion.lista[j].code_place) {
                    atraccion.lista[j].seccion=seccion[i];
                }
            }
        }

        System.out.println("Quieres consultar el estado de las atracciones yago");

            atraccion.Consulta();

    }


}
