package com.company.view.widget;

import java.util.Scanner;

public class EditText {

    public String texto(String hint) {
        System.out.println(hint);
        Scanner scanner = new Scanner(System.in);
        Mensaje mensaje = new Mensaje();
        boolean esValido = false;
        String valor = "";
        do {
            valor = scanner.nextLine();
            esValido = true;
            if ("".equals(valor)) {
                mensaje.mostrarError("Error no puedes dejar el campo vacio");
                esValido = false;
            }
        } while (!esValido);

        return valor;
    }

    public int numero(String hint) {
        System.out.println(hint);
        Scanner scanner = new Scanner(System.in);
        Mensaje mensaje = new Mensaje();
        boolean esValido = false;
        int valor = 0;
        do {
            valor = scanner.nextInt();
            scanner.nextLine();
            esValido = true;
            if (valor == 0) {
                mensaje.mostrarError("Error tienes que poner un numero mayor que 0");
                esValido = false;
            }

        } while (!esValido);

        return valor;
    }

    public double altura(String hint) {
        System.out.println(hint);
        Scanner scanner = new Scanner(System.in);
        Mensaje mensaje = new Mensaje();
        boolean esValido = false;
        double valor = 0;
        do {
            valor = scanner.nextDouble();
            scanner.nextLine();
            esValido = true;
            if (valor == 0) {
                mensaje.mostrarError("Error no puedes dejar el campo vacio");
                esValido = false;
            }
        } while (!esValido);
        return valor;
    }
}
