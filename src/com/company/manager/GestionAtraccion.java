package com.company.manager;

import com.company.model.*;

public class GestionAtraccion {
    public int numeroAtracciones=11;
    public Atraccion [] lista = new Atraccion[numeroAtracciones+1];
    public void Change(){
        lista[0]= new Tiovivo();
        lista[1] = new MontañaRusa();
        lista[2] = new AutosChoque();
        lista[3] = new CarreraCaballos();
        lista[4] = new Noria();
        lista[5] = new Pacman();
        lista[6] = new PiedraPapelTijeraLagartoSpok();
        lista[7] = new Toroloco();
        lista[8] = new Tragaperras();
        lista[9] = new Tronquitos();
        lista[10] = new ZonaArcade();
        for (int x=0; x < numeroAtracciones; x++) {
            lista[x].CambiarAtr();

        }


    }
}
