package edu.upc.dsa;

import edu.upc.dsa.classes.Juego;
import edu.upc.dsa.Exceptions.exampleNoExisteException;
import edu.upc.dsa.Exceptions.usuarioNoExisteException;
import edu.upc.dsa.classes.Partida;
import edu.upc.dsa.classes.Usuario;
import java.util.LinkedList;
import java.util.List;


public interface exampleManager {

    public void addJuego(String id, String descripcion, String nivel);
    public Juego addJuego(Juego j);

    public List<Partida> sortUsuarios();

    public Usuario addUser(Usuario u);

    public int sizeUsuarios();

    public List<Usuario> getAllUsuarios();

    public Usuario getUsuario(String mail) throws usuarioNoExisteException;

    public Partida getPuntos(int puntos) throws exampleNoExisteException;


}
