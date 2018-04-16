package com.company.view.widget;

public class Mensaje {

    public void mostrarError(String texto){
        System.out.println("\033[31m \uD83D\uDEAB " + texto + "\033[0m");
    }
}
