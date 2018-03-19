package com.company.view;

import com.company.model.Cliente;

import java.util.Scanner;

public class General {
    Cliente []clientes = new Cliente[100];
    public int decisionS;
    Scanner scanner =new Scanner(System.in);
    RegistroCliente registroCliente = new RegistroCliente();
    PantallaDonacion pantallaDonacion = new PantallaDonacion();
    public void decision() {
        do {
            System.out.println("Que deseas hacer: \n Nuevo cliente-1 \n Soy cliente-3 \n Salir -0");
            decisionS = scanner.nextInt();scanner.nextLine();
            switch (decisionS) {
                case 1:
                    for (int i = 0; i < clientes.length; i++) {
                        if (clientes[i] == null) {

                            clientes[i]= new Cliente();
                            registroCliente.pedirDatos(clientes[i]);
                            break;
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i <clientes.length ; i++) {
                        if(clientes[i]!=null ) {
                            String comdni = registroCliente.comprobarDni(clientes[i]);
                            String compass= registroCliente.comprobarPass(clientes[i]);

                        if (clientes[i].DNI.equals(comdni) && clientes[i].pass.equals(compass)) {
                            System.out.println("existes bro");
                        }
                        }
                    }
            }
        }while(decisionS != 0);
    }
}
