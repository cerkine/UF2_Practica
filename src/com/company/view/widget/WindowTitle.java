package com.company.view.widget;

public class WindowTitle {
    public void show(String title){

        System.out.println("\033[36m"+title.toUpperCase()+"\033[0m");
    }
}
