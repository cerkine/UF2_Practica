package com.company.view;

import com.company.manager.GestionAtraccion;
import com.company.manager.GestionConsulta;
import com.company.model.Atraccion;
import com.company.model.Cliente;
import com.company.view.widget.WindowTitle;

import java.util.Scanner;

public class MenuEleccionCliente {
    public int opcion;
    Scanner scanner = new Scanner(System.in);
    ViewAlturaAtraccionCliente viewAlturaAtraccionCliente= new ViewAlturaAtraccionCliente();
    Entrada entrada = new Entrada();
    GestionConsulta consulta = new GestionConsulta();
    WindowTitle windowTitle = new WindowTitle();
    public void menuCliente(Cliente cliente, Atraccion[] lista, GestionAtraccion gestionAtraccion){
        windowTitle.show("Que quieres hacer ?");
        System.out.println("1) Mirar las atracciones que estan abiertas");
        System.out.println("2) Mirar a las atracciones que puede entrar");
        System.out.println("3) Consultar una atraccion especifica");
        System.out.println("4) Imprimir entrada");
        opcion = scanner.nextInt();
        scanner.nextLine();

      switch (opcion){
          case 1:
              consulta.Consulta(gestionAtraccion);
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
