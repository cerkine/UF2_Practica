package com.company;

public class Atraccion {
    Atraccion [] lista = new Atraccion[5];
    boolean open;
    boolean maintenance;
    double price;
    double maxHeight;
    double minHeight;

    void Change(){
        lista[0]= new Tiovivo();
        lista[1] = new MontañaRusa();
        lista[0].CambiarAtr();
        lista[1].CambiarAtr();
    }

    void CambiarAtr () {

    }
}
