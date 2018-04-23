package com.company.manager;

import com.company.model.*;


public class GestionAtraccion {
    public static Class[] classes = {Tiovivo.class, MontañaRusa.class, AutosChoque.class, CarreraCaballos.class, Noria.class, Pacman.class, PiedraPapelTijeraLagartoSpok.class, Toroloco.class, Tragaperras.class, Tronquitos.class, ZonaArcade.class};
    public static Atraccion [] lista = new Atraccion[classes.length];

    public static void change(){
        for (int x=0; x < classes.length; x++){
            try {
                lista[x] = (Atraccion) classes[x].newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

            lista[x].cambiarAtr();
        }
    }


}

