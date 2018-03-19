package com.company.view;

import com.company.model.Cliente;
import com.company.model.Donacion;

import java.util.Scanner;

public class PantallaDonacion {
    public void donar(Cliente cliente, Donacion donacion){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuanto quieres donar?");
        System.out.println();
        cliente.cantidad = scanner.nextDouble();
        donacion.bote +=  cliente.cantidad;
        System.out.println("¡Tu donacion de "+donacion+"€ se ha añadido al bote!");
        System.out.println("¡¡MUCHAS GRACIAS!!");
        System.out.println();
        System.out.println("EL BOTE ACTUAL ES: "+donacion.bote+"€");

    }

}
