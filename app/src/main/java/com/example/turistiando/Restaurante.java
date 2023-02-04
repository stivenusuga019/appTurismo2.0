package com.example.turistiando;

public class Restaurante {

    private int fotografias1;
    private String nombre1;
    private String descripcion1;
    private  String precio1;


    public Restaurante(int fotografias1, String nombre1, String descripcion1, String precio1) {
        this.fotografias1 = fotografias1;
        this.nombre1 = nombre1;
        this.descripcion1 = descripcion1;
        this.precio1 = precio1;
    }

    public int getFotografias1() {
        return fotografias1;
    }

    public void setFotografias1(int fotografias1) {
        this.fotografias1 = fotografias1;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getDescripcion1() {
        return descripcion1;
    }

    public void setDescripcion1(String descripcion1) {
        this.descripcion1 = descripcion1;
    }

    public String getPrecio1() {
        return precio1;
    }

    public void setPrecio1(String precio1) {
        this.precio1 = precio1;
    }
}
