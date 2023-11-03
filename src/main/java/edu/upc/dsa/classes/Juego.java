package edu.upc.dsa.classes;

import edu.upc.dsa.util.idGenerator;

public class Juego {
    String nombre;
    String descripcion;
    int nivel;

    public Juego(){}

    public Juego(String nombre, String descripcion, int nivel) {
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.nivel= nivel;
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




}
