package com.company;

public class Seccion {
    int place;
    double height;
    double width;
    double area= CalcularArea();
    String name;
    Seccion [] seccions = {new Oceania(), new Africa(), new Europa()};

    void ChangeSeccion(){
        for (int i = 0; i <seccions.length ; i++) {
            seccions[i].DatosSeccion();
            seccions[i].Mostrardatos();
        }
    }
    double CalcularArea(){
        return height*width;
    }
    void DatosSeccion(){

    }
    void Mostrardatos(){
        System.out.println("Nombre: "+name +"\n lugar: "+place+ "\n area: " + area);
    }
}
