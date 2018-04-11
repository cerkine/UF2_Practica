package com.company.manager;

import com.company.model.Cliente;
import com.company.view.RegistroCliente;
public class GestionCliente {
    Cliente []clientes = new Cliente[100];


    public Cliente cargarCliente(){
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i]= new Cliente();
                return clientes[i];
            }
        }
        return null;
    }

    public Cliente comprobarCliente(String comdni, String compass){

            boolean existir = false;
            for (int i = 0; i < clientes.length; i++) {
                if (clientes[i] != null && clientes[i].DNI.equals(comdni) && clientes[i].pass.equals(compass)) {
                    existir = true;
                    return clientes[i];

                }
            }
            if (!existir) {
                System.out.println("Usuario/Contraseña  INCORRECTO");
            }
            return null;
    }


    public Cliente clienteDefault () {
        clientes[99] = new Cliente();
        clientes[99].DNI="0";
        clientes[99].pass="0";
        clientes[99].height=1.70;
        return  clientes[99];
    }
    public Cliente adminDefault () {
        clientes[98] = new Cliente();
        clientes[98].DNI="admin";
        clientes[98].pass="admin";
        return  clientes[98];
    }
//    public Cliente cargarCliente2(int decisionS){
//        switch (decisionS) {
//            case 1:
//                for (int i = 0; i < clientes.length; i++) {
//                    if (clientes[i] == null) {
//                        clientes[i]= new Cliente();
//                        return clientes[i];
//                    }
//                }
//                break;
//            case 3:
//                boolean existir=false;
//                String comdni = registroCliente.comprobarDni();
//                String compass= registroCliente.comprobarPass();
//                for (int i = 0; i <clientes.length ; i++) {
//                    if (clientes[i]!=null && clientes[i].DNI.equals(comdni) && clientes[i].pass.equals(compass)) {
//                        existir= true;
//                        return clientes[i];
//
//                    }
//                }
//                if (!existir){
//                    System.out.println("Usuario/Contraseña  INCORRECTO");
//                }
//        }return clientes[99];
//    }
}
