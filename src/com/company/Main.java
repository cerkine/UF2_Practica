package com.company;
import com.company.manager.*;
import com.company.view.MenuEleccionCliente;
import com.company.view.ViewRegistroAcceso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Cliente cliente = new Cliente();
//        cliente.name = "prue";
//        cliente.dinero = 100;
//        cliente.height = 1.8;
//        cliente.pass= "prue";
//        cliente.DNI = "22222";
//        cliente.subname = "preubaaa";
//        cliente.ages= 16;
//        cliente.mail = "fdssdf@dss";
//
//        GestionCliente.clienteLogeado =cliente;
//        GestionCliente.cargarCliente();

        GestionAtraccion.change();

        Gestion.cargarParque();

        ViewRegistroAcceso viewRegistroAcceso = new ViewRegistroAcceso();
        do {
            viewRegistroAcceso.decision();
        } while(GestionCliente.clienteLogeado == null);


        MenuEleccionCliente menuEleccionCliente = new MenuEleccionCliente();

        int opcioncliente;
        do{
            opcioncliente = menuEleccionCliente.menuCliente();
        }while (opcioncliente!=0);
    }


}
