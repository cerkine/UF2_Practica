package com.company;



public  class Seccion {
    int code_place; /* codigo del lugar */
    double height; /* todo es km */
    double width;
    double area;
    String name;
    Seccion[] sitios = new Seccion[3];
    void DatosSeccion() {
        sitios[0].code_place =1;
        sitios[0].height=2.50;
        sitios[0].width=2.50;
        sitios[0].area=sitios[0].width*sitios[0].height;
        sitios[0].name="Palacio Real";
        
        sitios[1].code_place =2;
        sitios[1].height=1.85;
        sitios[1].width=2;
        sitios[1].area=sitios[1].width*sitios[1].height;
        sitios[1].name="Ciudadela";

        sitios[1].code_place =3;
        sitios[1].height=0.50;
        sitios[1].width=3.02;
        sitios[1].area=sitios[1].width*sitios[1].height;
        sitios[1].name="Bosque NO Prohíbido";
    }
}
