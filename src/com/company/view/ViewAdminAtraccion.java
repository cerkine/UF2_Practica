package com.company.view;

import com.company.manager.GestionCambiarMantenimiento;
import com.company.manager.GestionCompararNombre;
import com.company.model.Atraccion;
import com.company.model.Cliente;

import java.util.Scanner;

public class ViewAdminAtraccion {

    Scanner scanner = new Scanner(System.in);
    Atraccion[] atraccion = new Atraccion[1];
    GestionCompararNombre gestionCompararNombre = new GestionCompararNombre();
    GestionCambiarMantenimiento gestionCambiarMantenimiento = new GestionCambiarMantenimiento();

    public void mirarAtraccion(Atraccion[] lista) {
        System.out.println("\n \n  \n");
        do {
            for (int x = 0; x <lista.length ; x++) {
                String nombre=lista[x].getClass().getSimpleName();
                boolean mante =lista[x].maintenance;
                if (mante){
                    System.out.println(lista[x].getClass().getSimpleName() + nombre +" "+ mante + " (" + x + ")" + " \u001B[32mMANTENIMIENTO ON\u001B[0m");
                }
                else{
                    System.out.println(lista[x].getClass().getSimpleName() + nombre +" "+ mante + " (" + x + ")" + " \u001B[31mMANTENIMIENTO OFF\u001B[0m");
                }



            }


            System.out.println("\n \nQue atraccion deseas cambiarle el mantenimiendo ? \n");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            lista[opcion].maintenance = gestionCambiarMantenimiento.cambiarMantenimiento(opcion, lista);
            System.out.println(lista[opcion].maintenance);
        }while (atraccion[0] == null);

    }
}
