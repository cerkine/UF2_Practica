package com.company.view.widget;

import java.util.Scanner;

public class EditInt {
    public int read(String hint){
        System.out.println("\033[1m"+hint + "\033[0m");
        return new Scanner(System.in).nextInt();
    }
}
