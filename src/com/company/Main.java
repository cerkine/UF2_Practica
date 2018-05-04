package com.company;
import com.company.manager.*;
import com.company.view.MenuAdminAtraccion;
import com.company.view.MenuEleccionCliente;
import com.company.view.ViewRegistroAcceso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GestionAtraccion.change();

        Gestion.cargarParque();

        ViewRegistroAcceso viewRegistroAcceso = new ViewRegistroAcceso();
        do {
            viewRegistroAcceso.decision();
        } while(GestionCliente.clienteLogeado == null);


        MenuEleccionCliente menuEleccionCliente = new MenuEleccionCliente();
        if (!"admin".equals(GestionCliente.clienteLogeado.DNI) && !"putoamo".equals(GestionCliente.clienteLogeado.pass)){
            int opcion;
            do {
                opcion = menuEleccionCliente.menuCliente();
            } while (opcion != 0);
        }
        else {
            MenuAdminAtraccion menuAdminAtraccion = new MenuAdminAtraccion();
            int opcion;
            do {
                opcion = menuAdminAtraccion.menuAdmin();
            } while (opcion != 0);
        }
    }


}
