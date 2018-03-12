package com.company;

public class Seccion {
    int place;
    String name;
    int height;
    int width;
    int area= CalcularArea();

    int CalcularArea(){
        return height*width;
    }

}
