package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Seccion seccion = new Seccion();
        seccion.DatosSeccion();
        Atraccion atraccion = new Atraccion();
        atraccion.CargarSeccion(seccion);
        atraccion.Change();
        System.out.println("Quieres consultar el estado de las atracciones yago");
        if (scanner.nextLine().toLowerCase().equals("si")) {
            atraccion.Consulta();
        }

    }

}
