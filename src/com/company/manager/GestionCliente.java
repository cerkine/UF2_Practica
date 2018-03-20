package com.company.manager;

import com.company.model.Cliente;
import com.company.view.RegistroCliente;

public class GestionCliente {
    Cliente []clientes = new Cliente[100];
    RegistroCliente registroCliente = new RegistroCliente();
    public Cliente cargarCliente(int decisionS){
        switch (decisionS) {
            case 1:
                for (int i = 0; i < clientes.length; i++) {
                    if (clientes[i] == null) {
                        clientes[i]= new Cliente();
                        return clientes[i];
                    }
                }
                break;
            case 3:
                boolean existir=false;
                String comdni = registroCliente.comprobarDni();
                String compass= registroCliente.comprobarPass();
                for (int i = 0; i <clientes.length ; i++) {
                    if (clientes[i]!=null && clientes[i].DNI.equals(comdni) && clientes[i].pass.equals(compass)) {
                        existir= true;
                        return clientes[i];

                    }
                }
                if (!existir){
                    System.out.println("Usuario/Contraseña  INCORRECTO");
                }
        }return clientes[99];
    }
}
