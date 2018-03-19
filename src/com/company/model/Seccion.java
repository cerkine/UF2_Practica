package com.company.model;



public  class Seccion {
    public int getCode_place() {
        return code_place;
    }

    public void setCode_place(int code_place) {
        this.code_place = code_place;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
