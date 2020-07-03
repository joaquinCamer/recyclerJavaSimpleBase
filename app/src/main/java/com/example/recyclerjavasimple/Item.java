package com.example.recyclerjavasimple;

public class Item {

    private String nombre;
    private String urlphoto;
    private float valoracion ;
    private String direccion;

    public Item(String nombre, String urlphoto, float valoracion, String direccion) {
        this.nombre = nombre;
        this.urlphoto = urlphoto;
        this.valoracion = valoracion;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlphoto() {
        return urlphoto;
    }

    public void setUrlphoto(String urlphoto) {
        this.urlphoto = urlphoto;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
