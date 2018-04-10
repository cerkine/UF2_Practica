package com.company.view;

import com.company.model.Atraccion;
import com.company.model.Cliente;

import java.util.Scanner;

public class MenuEleccionCliente {
    public int opcion;
    Scanner scanner = new Scanner(System.in);
    ViewAlturaAtraccionCliente viewAlturaAtraccionCliente= new ViewAlturaAtraccionCliente();
    Entrada entrada = new Entrada();
    ViewConsulaApertura consulta = new ViewConsulaApertura();
    ViewClienteAtraccion viewClienteAtraccion = new ViewClienteAtraccion();
    public int menuCliente(Cliente cliente, Atraccion[] lista){
        System.out.println("Que quieres hacer ?");
        System.out.println("1) Mirar las atracciones que estan abiertas");
        System.out.println("2) Mirar a las atracciones que puede entrar");
        System.out.println("3) Consultar una atraccion especifica");
        System.out.println("4) Imprimir entrada");
        System.out.println("\n \n \n 0) Salir");
        opcion = scanner.nextInt();
        scanner.nextLine();

      switch (opcion){
          case 1:
              consulta.consulta(lista);
              break;
          case 2:
              viewAlturaAtraccionCliente.compararAltura(cliente,lista);
              break;
          case 3:
              viewClienteAtraccion.mirarAtraccion(lista,cliente,consulta,viewAlturaAtraccionCliente);
              break;
          case 4:
              entrada.imprimirentrada(cliente);
              break;
      }
      return opcion;
    }

}
