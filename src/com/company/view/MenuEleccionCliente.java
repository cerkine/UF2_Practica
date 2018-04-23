package com.company.view;
import com.company.view.widget.MenuWidget;


public class MenuEleccionCliente {
    Entrada entrada = new Entrada();
    MenuWidget menuWidget = new MenuWidget();
    MenuJuegosAzar menuJuegosAzar = new MenuJuegosAzar();
    ViewClienteAtraccion viewClienteAtraccion = new ViewClienteAtraccion();

    public int  menuCliente(){
        menuWidget.crearMenu("Que quieres hacer","Mirar las atrraciones que estan abiertas","Mirar a las que puedes entrar","Constular una atraccion especifica","Imprimir una entrada",
                "Jugar a juegos de azar" +" CON TU DINERO");


      switch (menuWidget.opcion){
          case 1:
              ViewConsulaApertura.consulta();
              break;
          case 2:
              ViewAlturaAtraccionCliente.compararAltura();
              break;
          case 3:
              viewClienteAtraccion.mirarAtraccion();
              break;
          case 4:
              entrada.imprimirentrada();
              break;
          case 5:
              menuJuegosAzar.start();

              break;
      }
      return menuWidget.opcion;
    }

}
