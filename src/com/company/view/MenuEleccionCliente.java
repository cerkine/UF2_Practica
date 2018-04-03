package com.company.view;

import com.company.model.Atraccion;
import com.company.model.Cliente;

import java.util.Scanner;

public class MenuEleccionCliente {
    public int opcion;
    Scanner scanner = new Scanner(System.in);
    public void menuCliente(Cliente cliente, Atraccion[] lista){
        System.out.println("Que quieres hacer ?");
        System.out.println("1) Mirar las atracciones que estan abiertas");
        System.out.println("2) Mirar a las atracciones que puede entrar");
        System.out.println("3) Consultar una atraccion especifica");
        opcion = scanner.nextInt();
        scanner.nextLine();

      switch (opcion){
          case 1:

              break;
          case 2:
              ViewAlturaAtraccionCliente viewAlturaAtraccionCliente= new ViewAlturaAtraccionCliente();
              viewAlturaAtraccionCliente.CompararAltura(cliente,lista);
              break;
          case 3:
              break;
      }
    }

}
