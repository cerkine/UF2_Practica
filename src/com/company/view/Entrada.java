package com.company.view;

import com.company.manager.GestionCliente;
import com.company.model.Cliente;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;


public class Entrada {
    int tamaño = 0;
    int diaActual = Integer.parseInt(new SimpleDateFormat("d").format(Calendar.getInstance().getTime()));
    int mesActual = Integer.parseInt(new SimpleDateFormat("M").format(Calendar.getInstance().getTime()));
    int anyoActual = Integer.parseInt(new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime()));
    private Random random = new Random();
    String numCodigo= "4 0902  "+ random.nextInt(10)+ random.nextInt(10)+ random.nextInt(10)+ random.nextInt(10)+" "+random.nextInt(10) ;

    void imprimirentrada() {
        Cliente cliente = GestionCliente.clienteLogeado;
        for (int i = 0; i < cliente.name.length() + cliente.subname.length() + 50; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < cliente.name.length() + cliente.subname.length() + 50; i++) {
            if (i == 0) {
                System.out.print("*");
            } else if (i > 0 && i < 5) {
                System.out.print(" ");
            } else if (i == 5) {
                System.out.print(cliente.name + " " + cliente.subname);
                tamaño = cliente.name.length() + cliente.subname.length() + 45;
            } else {
                System.out.print(" ");
                if (i == 48) {
                    System.out.print("*");
                    break;
                }
            }
        }
        System.out.println();
        for (int l = 0; l < cliente.name.length() + cliente.subname.length() + 50; l++) {
            if (l == 0 || l == cliente.name.length() + cliente.subname.length() + 49) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

        }
        System.out.println();

        for (int l = 0; l < cliente.name.length() + cliente.subname.length() + 50; l++) {
            if (l == 0 || l == cliente.name.length() + cliente.subname.length() + 49) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();

        for (int i = 0; i < cliente.name.length() + cliente.subname.length() + 50; i++) {
            if (i == 0) {
                System.out.print("*");
            } else if (i > 0 && i < 5) {
                System.out.print(" ");
            } else if (i == 5) {
                System.out.print("Socio: ");
                if (cliente.subscrption){
                    System.out.print("Si");
                }
                else{
                    System.out.print("No");
                }
            }  else {
                System.out.print(" ");
                if (i == cliente.name.length() + cliente.subname.length() + 40) {
                    System.out.print("*");
                    break;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < 18 + 50; i++) {
            if (i == 0) {
                System.out.print("*");
            } else if (i > 0 && i < 5) {
                System.out.print(" ");
            } else if (i == 5) {
                System.out.print("Fecha: "+diaActual+"/"+mesActual+"/"+anyoActual);
            }else {
                System.out.print(" ");
                if (i == cliente.name.length() + cliente.subname.length() + 33) {
                    System.out.print("*");
                    break;
                }
            }
        }
        System.out.println();
        for (int l = 0; l < cliente.name.length() + cliente.subname.length() + 50; l++) {
            if (l == 0 || l == cliente.name.length() + cliente.subname.length() + 49) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

        }
        System.out.println();
        for (int i = 0; i < 18 + 50; i++) {
            if (i == 0) {
                System.out.print("*");
            } else if (i > 0 && i < 5) {
                System.out.print(" ");
            } else if (i == 38) {
                System.out.print("▏▏ ▏▏ ▏ ▏▏▏ ▏  ▏▏ ▏ ▏▏▏▏ ▏ ▏");
            }else {
                System.out.print(" ");
                if (i == cliente.name.length() + cliente.subname.length() + 35) {
                    System.out.print("*");
                    break;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < 18 + 50; i++) {
            if (i == 0) {
                System.out.print("*");
            } else if (i > 0 && i < 5) {
                System.out.print(" ");
            } else if (i == 38) {
                System.out.print("▏▏ ▏▏ ▏ ▏▏▏ ▏  ▏▏ ▏ ▏▏▏▏ ▏ ▏");
            }else {
                System.out.print(" ");
                if (i == cliente.name.length() + cliente.subname.length() + 35) {
                    System.out.print("*");
                    break;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < 18 + 50; i++) {
            if (i == 0) {
                System.out.print("*");
            } else if (i > 0 && i < 5) {
                System.out.print(" ");
            } else if (i == 38) {
                System.out.print("▏▏ ▏▏ ▏ ▏▏▏ ▏  ▏▏ ▏ ▏▏▏▏ ▏ ▏");
            }else {
                System.out.print(" ");
                if (i == cliente.name.length() + cliente.subname.length() + 35) {
                    System.out.print("*");
                    break;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < 18 + 50; i++) {
            if (i == 0) {
                System.out.print("*");
            } else if (i > 0 && i < 5) {
                System.out.print(" ");
            } else if (i == 38) {
                System.out.print(numCodigo);
            }else {
                System.out.print(" ");
                if (i == cliente.name.length() + cliente.subname.length() + 35) {
                    System.out.print("*");
                    break;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < cliente.name.length() + cliente.subname.length() + 50; i++) {
            System.out.print("*");
        }
    }
}

