package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Atraccion atraccion = new Atraccion();
    atraccion.Change();
    Seccion [] seccions = new Seccion[3];
        for (int i = 0; i <seccions.length ; i++) {
            seccions[i].DatosSeccion();
    }


    }

}
