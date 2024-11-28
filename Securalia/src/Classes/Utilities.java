package Classes;

import java.time.LocalDate;

/**
 * Clase utilitaria que proporciona métodos para operaciones comunes.
 * 
 * @author Luis Carlos Caicedo Giraldo
 */
public class Utilities {
    
    /**
     * Formatea una fecha en formato ISO (YYYY-MM-DD) a formato europeo (DD-MM-YYYY).
     * 
     * @param date La fecha a formatear.
     * @return La fecha formateada como una cadena en formato DD-MM-YYYY.
     */
    public static String formatDateToEU(LocalDate date) {
        String[] fields = date.toString().split("-");
        return fields[2] + "-" + fields[1] + "-" + fields[0];
    }
}
