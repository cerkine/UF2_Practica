package com.company.manager;

import com.company.model.Cliente;
public class GestionCliente {
    static Cliente[] clientes = new Cliente[100];
    public static Cliente clienteLogeado;


    public static void cargarCliente() {
        GestionBaseDeDatos.get().insertCliente(clienteLogeado.name, clienteLogeado.subname, clienteLogeado.DNI, clienteLogeado.pass,
                clienteLogeado.mail, clienteLogeado.ages, clienteLogeado.height, clienteLogeado.dinero);
    }

    public static boolean comprobarCliente(String comdni, String compass) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null && clientes[i].DNI.equals(comdni) && clientes[i].pass.equals(compass)) {
                clienteLogeado = clientes[i];
                return true;

            }
        }
        return false;
    }

    public static void clienteDefault() {
        clientes[99] = new Cliente();
        clientes[99].DNI = "0";
        clientes[99].pass = "0";
        clientes[99].height = 1.70;
        clienteLogeado = clientes[99];

    }
}
