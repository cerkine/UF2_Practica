package com.company.view;

import com.company.manager.GestionCompararNombre;
import com.company.model.Atraccion;
import com.company.model.Cliente;

import java.util.Scanner;

public class ViewClienteAtraccion {
    Scanner scanner = new Scanner(System.in);
    Atraccion[] atraccion = new Atraccion[1];
    GestionCompararNombre gestionCompararNombre = new GestionCompararNombre();

    public void mirarAtraccion(Atraccion[] lista, Cliente cliente, ViewConsulaApertura viewConsulaApertura, ViewAlturaAtraccionCliente viewAlturaAtraccionCliente) {
        System.out.println("\n \n  \n");
        do {
            for (int x = 0; x <lista.length ; x++) {
                String nombre=lista[x].getClass().getSimpleName();
                System.out.println(nombre);

            }


            System.out.println("\n \nQue atraccion deseas consultar? \n");
            String opcion = scanner.nextLine();

            atraccion[0] = gestionCompararNombre.compararNombre(opcion, lista);
        }while (atraccion[0] == null);

        viewConsulaApertura.consulta(atraccion);
        System.out.println();
        viewAlturaAtraccionCliente.compararAltura(cliente,atraccion);
        System.out.println();

    }

}
