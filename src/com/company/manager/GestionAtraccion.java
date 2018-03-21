package com.company.manager;

import com.company.model.*;

public class GestionAtraccion {
    public Atraccion [] lista = new Atraccion[9];
    public void Change(){
        lista[0]= new Tiovivo();
        lista[1] = new MontañaRusa();
        lista[2] = new AutosChoque();
        lista[3] = new CarreraCaballos();
        lista[4] = new Noria();
        lista[5] = new ZonaArcade();
        lista[6] = new PiedraPapelTijeraLagartoSpok();
        lista[7] = new Toroloco();
        lista[8] = new Tronquitos();

        for (int x=0; x < lista.length; x++) {
            lista[x].CambiarAtr();

        }


    }
}
