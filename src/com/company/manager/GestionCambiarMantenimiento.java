package com.company.manager;

import com.company.model.Atraccion;

public class GestionCambiarMantenimiento {

    public Boolean cambiarMantenimiento (int opcion ,Atraccion[] lista){
        int  i = opcion;
        if (lista[i].maintenance == false){
                    return true;

                }
                else{
                    return false;

                }
    }
}
