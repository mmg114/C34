package LogsYDate;

import java.util.logging.Logger;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class LoggerWithDate {
    private static final Logger logger = Logger.getLogger(LoggerWithDate.class.getName());

    public static void main(String[] args) {
        LocalDateTime fecha = LocalDateTime.now();
        Calendar calendar = Calendar.getInstance();
        System.out.println(fecha);
        Date date = calendar.getTime();
        System.out.println(date);
        
        LocalDateTime now = LocalDateTime.now();
        logger.info(now.toString());
        String fechaHora = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        logger.info("Inicio del proceso - " + fechaHora);

        try {
            int valor = 100 / 5;
            logger.info("Resultado: " + valor);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error al calcular", e);
        }

        logger.info("Fin del proceso - " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}