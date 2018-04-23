package com.company.view;

import com.company.manager.GestionAtraccion;
import com.company.manager.GestionCompararNombre;
import com.company.model.Atraccion;
import com.company.model.Cliente;

import java.util.Scanner;

public class ViewClienteAtraccion {
    Scanner scanner = new Scanner(System.in);
    Atraccion atraccion = new Atraccion();

    public void mirarAtraccion( ) {
        System.out.println("\n \n  \n");
        do {
            for (int x = 0; x < GestionAtraccion.lista.length ; x++) {
                String nombre=GestionAtraccion.lista[x].getClass().getSimpleName();
                System.out.println(nombre);
            }


            System.out.println("\n \nQue atraccion deseas consultar? \n");
            String opcion = scanner.nextLine();

            atraccion= GestionCompararNombre.compararNombre(opcion);
        }while (atraccion == null);

        ViewConsulaApertura.consulta(atraccion);
        System.out.println();
        ViewAlturaAtraccionCliente.compararAltura(atraccion);
        System.out.println();

    }

}
