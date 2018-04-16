package com.company.view;

import com.company.model.Atraccion;
import com.company.model.Cliente;
import com.company.view.widget.MenuWidget;

import java.util.Scanner;

public class MenuEleccionCliente {
    public int opcion;
    Scanner scanner = new Scanner(System.in);
    ViewAlturaAtraccionCliente viewAlturaAtraccionCliente= new ViewAlturaAtraccionCliente();
    Entrada entrada = new Entrada();
    ViewConsulaApertura consulta = new ViewConsulaApertura();
    MenuWidget menuWidget = new MenuWidget();
    MenuJuegosAzar menuJuegosAzar = new MenuJuegosAzar();
    ViewClienteAtraccion viewClienteAtraccion = new ViewClienteAtraccion();
    public int  menuCliente(Cliente cliente, Atraccion[] lista){
        menuWidget.crearMenu("Que quieres hacer","Mirar las atrraciones que estan abiertas","Mirar a las que puedes entrar","Constular una atraccion especifica","Imprimir una entrada",
                "Jugar a juegos de azar" +" CON TU DINERO");

      switch (menuWidget.opcion){
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
          case 5:
              menuJuegosAzar.start(cliente);

              break;
      }
      return menuWidget.opcion;
    }

}
