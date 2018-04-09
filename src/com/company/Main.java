package com.company;
import com.company.manager.Gestion;
import com.company.view.MenuEleccionCliente;
import com.company.view.ViewAlturaAtraccionCliente;
import com.company.manager.GestionAtraccion;
import com.company.manager.GestionConsulta;
import com.company.model.Cliente;
import com.company.model.Donacion;
import com.company.view.ClienteView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente cliente;
        // write your code here
        GestionAtraccion gestionAtraccion = new GestionAtraccion();
        gestionAtraccion.Change();
//        GestionConsulta gestionConsulta = new GestionConsulta();
        Scanner scanner = new Scanner(System.in);

        Gestion gestion = new Gestion();
        gestion.CargarParque(gestionAtraccion);

        ClienteView clienteView = new ClienteView();

        cliente = clienteView.decision();/*
            Esto puede llegar a dar un null, podemos hacer que el cliente[99] lo cargemos, ponemos una variable boolean en cliente que sea null=false, si esto nos va a devolver un null, podemos iniciarliar
            ese cliente y lo cargamos con null true, aqui podmos hacer que si if(cliente.null) haga una cosa y sino pos que haga otra, asi nos evitamos que el main pete si no hay espacio de usuario o si no introducen
            bien la contraseña*/

        MenuEleccionCliente menuEleccionCliente = new MenuEleccionCliente();
        menuEleccionCliente.menuCliente(cliente,gestionAtraccion.lista, gestionAtraccion);
    }

}
