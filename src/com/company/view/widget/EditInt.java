package com.company.view.widget;

import java.util.Scanner;

public class EditInt {
    public int read(String hint){
        System.out.println(hint);
        return new Scanner(System.in).nextInt();
    }
}
