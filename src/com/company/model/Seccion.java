package com.company.model;



public  class Seccion {
    public int getCode_place() {
        return code_place;
    }

    int code_place; /* codigo del lugar */
    double height; /* todo es km */
    double width;
    double area;
    String name;



    public void DatosSeccion(Seccion sitios, int codigo, double height, double width, String name) {
        sitios.code_place =codigo;
        sitios.height=height;
        sitios.width=width;
        sitios.area=width*height;
        sitios.name=name;
    }
}
