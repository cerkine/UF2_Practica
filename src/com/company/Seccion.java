package com.company;

public class Seccion {
    int place;
    double height;
    double width;
    double area= CalcularArea();
    String name;

    double CalcularArea(){
        return height*width;
    }
    void DatosSeccion(){

    }
    void Mostrardatos(){
        System.out.println("Nombre: "+name +"\n lugar: "+place+ "\n area: " + area);
    }
}
