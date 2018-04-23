package com.company.manager;

import com.company.model.Atraccion;

public class GestionCompararNombre {

    public static Atraccion compararNombre(String opcion){
        for (int i = 0; i <GestionAtraccion.lista.length ; i++) {
            if (GestionAtraccion.lista[i].getClass().getSimpleName().equals(opcion)){
                return GestionAtraccion.lista[i];
            }
        }
        return null;
    }
}
