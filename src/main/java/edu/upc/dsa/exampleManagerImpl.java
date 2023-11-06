package edu.upc.dsa;

import edu.upc.dsa.Exceptions.exampleNoExisteException;
import edu.upc.dsa.Exceptions.usuarioNoExisteException;
import edu.upc.dsa.classes.Juego;
import edu.upc.dsa.classes.Partida;
import edu.upc.dsa.classes.Usuario;
import org.apache.log4j.Logger;

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
    public void addPartida(String id,String nombreJuego ,String nombrej, String fecha) {

    }

    public Usuario getUser(String mail) throws usuarioNoExisteException{
        if(lUsuarios.get(mail) == null){
            throw new usuarioNoExisteException();
        }
        return lUsuarios.get(mail);
    }
    @Override
    public Usuario addUser(String mail, String nombre, String contra) {
        logger.info("Creating a new user: " + nombre);
        try{
            getUser(mail);
            logger.info("Correo ya en uso!");
        }catch (usuarioNoExisteException e){
            Usuario u = new Usuario(mail, nombre, contra);
            lUsuarios.put(mail, u);
            logger.info("Usuario creado con exito!");
            return u;
        }

        return null;
    }


    @Override
    public List<Partida> sortUsuarios(){
        //lUsuarios.sort((Usuario o1, Usuario o2) -> Integer.compare(o1.getPuntos(),(o2.getPuntos())));
        for(Partida partida : lPartidas){
            try {
                logger.info("Usuario " + Usuario.class.newInstance().getNombre() + " - Puntos " + Partida.getPuntos());
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return lPartidas;
    }

    @Override
    public Usuario addUser(Usuario u) {
        return null;
    }


    @Override
    public int getPuntos() {
        return 0;
    }


    public Object getPartida(String nombreJuego) throws exampleNoExisteException {
        return null;
    }


    public int getNivel() {
        return 0;
    }


}
