package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Seccion seccion = new Seccion();
    seccion.ChangeSeccion();
    Atraccion atraccion = new Atraccion();
    atraccion.Change();
    atraccion.CargarSeccion(seccion);
    System.out.println(atraccion.lista[0].seccion);




    }

}
