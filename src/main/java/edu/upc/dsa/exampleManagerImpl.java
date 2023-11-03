package edu.upc.dsa;

import edu.upc.dsa.Exceptions.exampleNoExisteException;
import edu.upc.dsa.Exceptions.usuarioNoExisteException;
import edu.upc.dsa.classes.Juego;
import edu.upc.dsa.classes.Partida;
import edu.upc.dsa.classes.Usuario;
import org.apache.log4j.Logger;

import javax.servlet.http.Part;
import java.util.*;
import java.util.stream.Collectors;

public class exampleManagerImpl implements exampleManager{

    private static exampleManager instance;
    protected Map<String, Usuario> lUsuarios;
    protected List<Partida> lPartidas;
    protected List<Partida> lJuego;
    final static Logger logger = Logger.getLogger(exampleManagerImpl.class);

    public exampleManagerImpl() {
        this.lUsuarios = new HashMap<>();
        this.lPartidas = new LinkedList<Partida>();
        this.lJuego = new LinkedList<Partida>();
    }

    public static exampleManager getInstance() {
        if (instance==null) instance = new exampleManagerImpl();
        return instance;
    }

//USUARIOS

    public Usuario getUsuario(String mail) throws usuarioNoExisteException{
        if(lUsuarios.get(mail) == null){
            throw new usuarioNoExisteException();
        }
        return lUsuarios.get(mail);
    }

    @Override
    public Partida getPuntos(int puntos) throws exampleNoExisteException {
        return null;
    }

    public List<Usuario> getAllUsers(){
        return this.lUsuarios.values().stream().collect(Collectors.toList());
    }

    public Usuario addUser(String mail, String name, String contra) {
        logger.info("Creating a new user: " + name);
        try{
            getUsuario(mail);
            logger.info("Correo/identificador ya en uso!");
        }catch (usuarioNoExisteException e){
            Usuario u = new Usuario(mail, name, contra);
            lUsuarios.put(mail, u);
            logger.info("Usuario creado con exito!");
            return u;
        }
        return null;
    }

    public Usuario addUser(Usuario u) {
        logger.info("Creating a new user: " + u.getNombre());
        try{
            getUsuario(u.getMail());
            logger.info("Correo ya en uso!");
            return null;
        }catch (usuarioNoExisteException e){
            lUsuarios.put(u.getMail(), u);
            logger.info("Usuario creado con exito!");
            return u;
        }
    }

    @Override
    public int sizeUsuarios() {
        return 0;
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return null;
    }

    public int sizeUsers(){
        logger.info("Numero de usuarios en la lista: " + this.lUsuarios.size());
        return this.lUsuarios.size();
    }

    @Override
    public void addJuego(String id, String descripcion, String nivel) {

    }

    @Override
    public Juego addJuego(Juego j) {
        return null;
    }
    @Override
    public List<Partida> sortUsuarios(){
        lUsuarios.sort((Usuario o1, Usuario o2) -> Integer.compare(o1.getPuntos(),(o2.getPuntos())));
        for(Partida partida : lPartidas){
            logger.info("Usuario " + Usuario.getNombre() + " - Puntos " + Partida.getPuntos());
        }
        return lPartidas;
    }


    @Override
    public int getPuntos();



}
