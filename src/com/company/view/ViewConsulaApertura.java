package com.company.view;

import com.company.manager.GestionHora;
import com.company.model.Atraccion;

public class ViewConsulaApertura {
    public void consulta(Atraccion[] lista) {
        for (int x=0; x < lista.length; x++){
            if (lista[x].maintenance){
                System.out.println(lista[x].getClass().getSimpleName() + " esta en" + " \u001B[31mMANTENIMIENTO\u001B[0m");
            }
            else if (lista[x].open < GestionHora.horaActual()) {
                System.out.println(lista[x].getClass().getSimpleName() + " esta" + " \u001B[32mABIERTA\u001B[0m");
            }
            else {
                System.out.println(lista[x].getClass().getSimpleName() + " esta" + " \u001B[31mCERRADA\u001B[0m, abrira a las \033[36m" + lista[x].open + ":00\033[0m");
            }


        }
    }
}
