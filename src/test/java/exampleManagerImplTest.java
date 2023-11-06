import edu.upc.dsa.Exceptions.exampleNoExisteException;
import edu.upc.dsa.Exceptions.usuarioNoExisteException;
import edu.upc.dsa.classes.*;
import edu.upc.dsa.exampleManagerImpl;
import edu.upc.dsa.exampleManager;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import javax.servlet.http.Part;
import java.util.LinkedList;
import java.util.logging.Logger;

public class exampleManagerImplTest {

    final static Logger logger = Logger.getLogger(String.valueOf(exampleManagerImpl.class));
    exampleManager exampleManager;

    @Before
    public void setUp() throws usuarioNoExisteException {
        logger.info("--------Generando datos--------");
        exampleManager = new exampleManagerImpl();
        exampleManager.addJuego("mario bros", "para salvar a la princesa tendrás que pasarte todos los niveles","3");
        exampleManager.addJuego("cundy crush", "haz combinaciones con los caramelos y gana el máximo de puntos","4");
        exampleManager.addJuego("the Binding of Isaac", "Sobrevive a las mazmorras matando a todas las ordas de enemigos","5");

        exampleManager.addUser("bryan@gmail.com", "Bryan", "1234");
        exampleManager.addUser("cris@gmail.com", "Cristina", "asdasd");
        exampleManager.addUser("pepito@gmail.com", "Pepito", "qwsaqwsa");

        exampleManager.addPartida("1829374371" ,"Candy Crush", "Bryan", "01/08/22");
        exampleManager.addPartida("1829374372" ,"Candy Crush", "Cristina", "01/08/22");
        exampleManager.addPartida("1829374373" , "Mario Bros","Cristina", "03/12/22");
        exampleManager.addPartida("1829374374" ,"Mario Bros", "Pepito", "17/12/22");
        exampleManager.addPartida("1829374375" ,"Candy Crush", "Pepito", "09/02/23");


    }

    @After
    public void tearDown(){
        logger.info("--------Final Tests--------");
    }

    @Test
    public void testUsuario() throws usuarioNoExisteException {
        logger.info("--------Comprobando lista usuarios--------");
        Assert.assertEquals(3, this.exampleManager.sizeUsuarios());
        Assert.assertEquals("Bryan", exampleManager.getUsuario("bryan@gmail.com").getNombre());
        Assert.assertEquals("Pepito", exampleManager.getUsuario("pepito@gmail.com").getNombre());
        Assert.assertEquals("Cristina", exampleManager.getUsuario("cris@gmail.com").getNombre());
    }


    @Test
    public void testGetNivel()throws exampleNoExisteException{
        logger.info("--------Comprobando el nivel de la partida--------");



    }

    @Test
    public void testGetPuntos()throws exampleNoExisteException{
        logger.info("--------Obtener los puntos de la partida--------");


    }

    @Test
    public void testGetPartidasJugadas()throws usuarioNoExisteException{



    }

    @Test
    public void testRanking()throws exampleNoExisteException{



    }

    @Test
    public void testPasarNivel()throws usuarioNoExisteException{



    }



}
