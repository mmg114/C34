package LogsYDate;

import java.util.logging.Logger;
//import java.util.logging.ConsoleHandler;
import java.util.logging.Level;

public class LogExample {
    private static final Logger logger = Logger.getLogger(LogExample.class.getName());

    public static void main(String[] args) {
        // ConsoleHandler consoleHandler = new ConsoleHandler();
        // consoleHandler.setLevel(Level.FINE);
        // logger.addHandler(consoleHandler);

        // logger.setLevel(Level.FINE);        
        // logger.setUseParentHandlers(false);
       
        logger.info("Inicio del proceso");

        try {
            int resultado = 10 / 2;
            logger.fine("El resultado es: " + resultado); // Este nivel por defecto no se muestra
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error al dividir", e);
        }

        logger.warning("Este es un mensaje de advertencia");
        logger.info("Fin del proceso");
    }
}