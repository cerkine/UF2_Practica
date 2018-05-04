package com.company.view;

import com.company.manager.GestionAtraccion;
import com.company.manager.GestionCambiarMantenimiento;
import com.company.manager.GestionCompararNombre;
import com.company.model.Atraccion;
import com.company.model.Cliente;
import com.company.view.widget.EditText;

import java.util.Scanner;

public class ViewAdminAtraccion {

    GestionCambiarMantenimiento gestionCambiarMantenimiento = new GestionCambiarMantenimiento();
    EditText editText = new EditText();

    public int mirarAtraccion() {
        System.out.println("\n \n  \n");

            for (int x = 0; x < GestionAtraccion.lista.length ; x++) {
                String nombre=GestionAtraccion.lista[x].getClass().getSimpleName();
                boolean mante =GestionAtraccion.lista[x].maintenance;
                if (mante){
                    System.out.println(GestionAtraccion.lista[x].getClass().getSimpleName() + nombre +" "+ mante + " (" + (x+1) + ")" + " \u001B[32mMANTENIMIENTO ON\u001B[0m");
                }
                else{
                    System.out.println(GestionAtraccion.lista[x].getClass().getSimpleName() + nombre +" "+ mante + " (" + (x+1) + ")" + " \u001B[31mMANTENIMIENTO OFF\u001B[0m");
                }



            }

        System.out.println("\n 0-Salir\n");
        int opcion = editText.numero("Que atraccion deseas cambiarle el mantenimiento ? \n");
        if(opcion!=0) {
            GestionAtraccion.lista[opcion - 1].maintenance = gestionCambiarMantenimiento.cambiarMantenimiento(opcion - 1, GestionAtraccion.lista);
            System.out.println(GestionAtraccion.lista[opcion - 1].maintenance);
        }

        return opcion;

    }
}
