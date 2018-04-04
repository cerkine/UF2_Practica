package com.company.view;

import com.company.model.Atraccion;
import com.company.model.Cliente;

import java.util.Scanner;

public class MenuEleccionCliente {
    public int opcion;
    Scanner scanner = new Scanner(System.in);
    ViewAlturaAtraccionCliente viewAlturaAtraccionCliente= new ViewAlturaAtraccionCliente();
    Entrada entrada = new Entrada();
    public void menuCliente(Cliente cliente, Atraccion[] lista){
        System.out.println("Que quieres hacer ?");
        System.out.println("1) Mirar las atracciones que estan abiertas");
        System.out.println("2) Mirar a las atracciones que puede entrar");
        System.out.println("3) Consultar una atraccion especifica");
        System.out.println("4) Imprimir entrada");
        opcion = scanner.nextInt();
        scanner.nextLine();

      switch (opcion){
          case 1:

              break;
          case 2:

              viewAlturaAtraccionCliente.CompararAltura(cliente,lista);
              break;
          case 3:
              break;
          case 4:
              entrada.imprimirentrada(cliente);
              break;
      }
    }

}
