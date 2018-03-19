package com.company.view;

import com.company.model.Cliente;

import java.util.Scanner;

public class General {
    Cliente []clientes = new Cliente[100];
    public int decisionS;
    Scanner scanner =new Scanner(System.in);
    RegistroCliente registroCliente = new RegistroCliente();
    PantallaDonacion pantallaDonacion = new PantallaDonacion();
    public Cliente decision() {
        do {
            System.out.println("Que deseas hacer: \n Nuevo cliente-1 \n Soy cliente-3 \n Salir -0");
            decisionS = scanner.nextInt();scanner.nextLine();
            switch (decisionS) {
                case 1:
                    for (int i = 0; i < clientes.length; i++) {
                        if (clientes[i] == null) {
                            clientes[i]= new Cliente();
                            registroCliente.pedirDatos(clientes[i]);
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
            }
        }while(decisionS != 0);
        return clientes[99];
    }
}
