package com.example.turistiando;

public class Hotel {

    private int fotografias;
    private String nombre;
    private String descripcion;
    private  String precio;

    public Hotel(int fotografias, String nombre, String descripcion, String precio) {
        this.fotografias = fotografias;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getFotografias() {
        return fotografias;
    }

    public void setFotografias(int fotografias) {
        this.fotografias = fotografias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
