package com.company;
import com.company.manager.Gestion;
import com.company.manager.GestionHora;
import com.company.view.MenuEleccionCliente;
import com.company.manager.GestionAtraccion;
import com.company.model.Cliente;
import com.company.view.ViewRegistroAcceso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente cliente;
        // write your code here
        GestionAtraccion gestionAtraccion = new GestionAtraccion();
        gestionAtraccion.change();
        Scanner scanner = new Scanner(System.in);

        Gestion gestion = new Gestion();
        gestion.cargarParque(gestionAtraccion);

        ViewRegistroAcceso viewRegistroAcceso = new ViewRegistroAcceso();

        cliente= viewRegistroAcceso.decision();/*

            Esto puede llegar a dar un null, podemos hacer que el cliente[99] lo cargemos, ponemos una variable boolean en cliente que sea null=false, si esto nos va a devolver un null, podemos iniciarliar
            ese cliente y lo cargamos con null true, aqui podmos hacer que si if(cliente.null) haga una cosa y sino pos que haga otra, asi nos evitamos que el main pete si no hay espacio de usuario o si no introducen
            bien la contraseña*/


        MenuEleccionCliente menuEleccionCliente = new MenuEleccionCliente();

        int opcioncliente;
        do{
            opcioncliente= menuEleccionCliente.menuCliente(cliente,gestionAtraccion.lista);
        }while (opcioncliente!=0);
    }


}
