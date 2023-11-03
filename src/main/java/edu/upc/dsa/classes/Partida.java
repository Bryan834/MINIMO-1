package edu.upc.dsa.classes;

import edu.upc.dsa.util.idGenerator;

import javax.servlet.http.Part;

public class Partida {

    Partida partida;

    String id;
    String nombrej;

    String idjugador;

    int puntos;

    String fecha;

    public Partida(){}

    public Partida(String id, String nombrej, String fecha) {
        this.setId(idGenerator.getId());
        this.setIdjugador(idjugador);
        this.setNombrej(nombrej);
        this.setFecha(fecha);
        this.puntos= partida.puntos;
    }

    public static String getPuntos() {
            return null;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNombrej() {
        return nombrej;
    }
    public void setNombrej(String nombrej) {
        this.nombrej = nombrej;
    }

    public String getIdjugador() {
        return idjugador;
    }
    public void setIdjugador(String idjugador) {
        this.idjugador = idjugador;
    }


    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }






}
