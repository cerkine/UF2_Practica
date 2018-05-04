package com.company.manager;

import com.company.model.Cliente;
public class GestionCliente {
    public static Cliente clienteLogeado;


    public static void cargarCliente() {
        GestionBaseDeDatos.get().insertCliente(clienteLogeado.name, clienteLogeado.subname, clienteLogeado.DNI, clienteLogeado.pass,
                clienteLogeado.mail, clienteLogeado.ages, clienteLogeado.height, clienteLogeado.dinero);
    }
}
