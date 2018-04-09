package com.company.manager;

import com.company.model.Atraccion;

public class GestionCompararNombre {

    public Atraccion compararNombre(String opcion, Atraccion[] lista){
        for (int i = 0; i <lista.length ; i++) {
            if (lista[i].getClass().getSimpleName().equals(opcion)){
                return lista[i];
            }
        }
        return null;
    }
}
