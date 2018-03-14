package com.company;

import java.util.Scanner;

public class MainAdri {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Seccion seccion = new Seccion();

        seccion.ChangeSeccion();
        Atraccion atraccion = new Atraccion();
        atraccion.CargarSeccion(seccion);
        atraccion.Change();
        System.out.println("Quieres consultar el estado de las atracciones?");
        if (scanner.nextLine().toLowerCase().equals("si")) {
            atraccion.Consulta();
        }




    }
}
