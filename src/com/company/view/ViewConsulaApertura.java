package com.company.view;

import com.company.manager.GestionAtraccion;
import com.company.manager.GestionHora;
import com.company.model.Atraccion;

import javax.smartcardio.ATR;

public  class ViewConsulaApertura {
    public static void consulta() {
        for (int x=0; x < GestionAtraccion.lista.length; x++){
            if (GestionAtraccion.lista[x].maintenance){
                System.out.println(GestionAtraccion.lista[x].getClass().getSimpleName() + " esta en" + " \u001B[31mMANTENIMIENTO\u001B[0m");
            }
            else if (GestionAtraccion.lista[x].open < GestionHora.horaActual()) {
                System.out.println(GestionAtraccion.lista[x].getClass().getSimpleName() + " esta" + " \u001B[32mABIERTA\u001B[0m");
            }
            else {
                System.out.println(GestionAtraccion.lista[x].getClass().getSimpleName() + " esta" + " \u001B[31mCERRADA\u001B[0m, abrira a las \033[36m" + GestionAtraccion.lista[x].open + ":00\033[0m");
            }


        }
    }
    public static void consulta(Atraccion lista) {
        if (lista.maintenance){
                System.out.println(lista.getClass().getSimpleName() + " esta en" + " \u001B[31mMANTENIMIENTO\u001B[0m");
            }
            else if (lista.open < GestionHora.horaActual()) {
                System.out.println(lista.getClass().getSimpleName() + " esta" + " \u001B[32mABIERTA\u001B[0m");
            }
            else {
                System.out.println(lista.getClass().getSimpleName() + " esta" + " \u001B[31mCERRADA\u001B[0m, abrira a las \033[36m" + lista.open + ":00\033[0m");
            }
    }
}
