package com.company.view;

import com.company.model.Atraccion;
import com.company.model.Cliente;

import java.util.Scanner;

public class MenuAdminAtraccion {
    public int opcion;
    Scanner scanner = new Scanner(System.in);
    ViewAlturaAtraccionCliente viewAlturaAtraccionCliente= new ViewAlturaAtraccionCliente();
    Entrada entrada = new Entrada();
    ViewConsulaApertura consulta = new ViewConsulaApertura();
    ViewAdminAtraccion viewAdminAtraccion = new ViewAdminAtraccion();
    public int menuAdmin(Atraccion[] lista){
        System.out.println("Que quieres hacer ?");
        System.out.println("1) Mirar las atracciones");
        System.out.println("\n \n \n 0) Salir");
        opcion = scanner.nextInt();
        scanner.nextLine();
        int opcionDev;
        switch (opcion){
            case 1:
                do{
                    opcionDev=viewAdminAtraccion.mirarAtraccion(lista);
                }while (opcionDev!=0);
                break;
        }
        return opcion;
    }
}
