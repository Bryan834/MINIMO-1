package edu.upc.dsa.classes;

import edu.upc.dsa.util.idGenerator;

import javax.servlet.http.Part;
import java.util.HashMap;


public class Usuario{

    private String id;
    String mail;
    String nombre;
    String contra;

    int puntos;
    private HashMap<String, Partida> partidas;

    public Usuario(){}

    public Usuario(String mail, String nombre, String contra) {
        this.setId(idGenerator.getId());
        this.setMail(mail);
        this.setContra(contra);
        this.setNombre(nombre);
        this.setPartidas();
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.mail = mail;
    }
    public HashMap<String, Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas() {
        this.partidas = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }



    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }


    public int getPuntos() {
            return 0;
    }
}
