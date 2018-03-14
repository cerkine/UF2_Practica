package com.company;
import java.util.Scanner;

public class Donacion {
    double donacion;
    double bote = 1647.84;

    void donar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuanto quieres donar?");
        System.out.println();
        donacion = scanner.nextDouble();
        bote += donacion;
        System.out.println("¡Tu donacion de "+donacion+"€ se ha añadido al bote!");
        System.out.println("¡¡MUCHAS GRACIAS!!");
        System.out.println();
        System.out.println("EL BOTE ACTUAL ES: "+bote+"€");

    }
}
