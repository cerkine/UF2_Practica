package com.company;

public class Seccion {
    int place;
    double height;
    double width;
    double area;
    String name;
    Seccion [] seccions = new Seccion[3];

    void ChangeSeccion(){
        seccions[0]= new Oceania();
        seccions[1]= new Africa();
        seccions[2]= new Europa();
        for (int i = 0; i <seccions.length ; i++) {
            seccions[i].DatosSeccion();
            seccions[i].Mostrardatos();
        }
    }
    void DatosSeccion(){

    }
    void Mostrardatos(){
        System.out.println("Nombre: "+name +"\n lugar: "+place+ "\n area: " + area);
    }
}
