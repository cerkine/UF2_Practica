package com.company;
import com.company.manager.Gestion;
import com.company.manager.GestionBaseDeDatos;
import com.company.manager.GestionHora;
import com.company.view.MenuEleccionCliente;
import com.company.manager.GestionAtraccion;
import com.company.model.Cliente;
import com.company.view.ViewRegistroAcceso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       GestionAtraccion.change();

        Gestion.cargarParque();

        ViewRegistroAcceso viewRegistroAcceso = new ViewRegistroAcceso();

        viewRegistroAcceso.decision();


        MenuEleccionCliente menuEleccionCliente = new MenuEleccionCliente();

        int opcioncliente;
        do{
            opcioncliente = menuEleccionCliente.menuCliente();
        }while (opcioncliente!=0);
    }


}
