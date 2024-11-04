package Classes;

import java.time.LocalDate;
import java.io.File;

/**
 * Clase que representa una programación de copia de seguridad.
 *
 * @author Luis Carlos Caicedo Giraldo
 */
public class Backup {
    private int id;                                 // ID único de la programación de copia de seguridad
    private String name;                            // Nombre de la programación de copia de seguridad
    private File source;                            // Archivo o directorio de origen para la copia de seguridad
    private File destination;                       // Directorio de destino donde se guardará la copia
    private LocalDate lastBackup;                   // Fecha de la última copia de seguridad realizada
    private int dayInterval;                        // Intervalo en días entre copias de seguridad

    /** Constructor vacío para Backup. */
    public Backup () {}

    /**
     * Constructor con parámetros.
     *
     * @param name Nombre de la copia de seguridad.
     * @param source Ruta de origen para la copia.
     * @param destination Ruta de destino para la copia.
     * @param lastBackup Fecha de la última copia de seguridad.
     * @param dayInterval Intervalo de días para la próxima copia.
     */
    public Backup(String name, File source, File destination, LocalDate lastBackup, int dayInterval) {
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.lastBackup = lastBackup;
        this.dayInterval = dayInterval;
    }

    /**
     * Constructor con todos los parámetros.
     *
     * @param id ID de la programación de copia de seguridad.
     * @param name Nombre de la copia de seguridad.
     * @param source Ruta de origen para la copia.
     * @param destination Ruta de destino para la copia.
     * @param lastBackup Fecha de la última copia de seguridad.
     * @param dayInterval Intervalo de días para la próxima copia.
     */
    public Backup(int id, String name, File source, File destination, LocalDate lastBackup, int dayInterval) {
        this.id = id;
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.lastBackup = lastBackup;
        this.dayInterval = dayInterval;
    }

    // Métodos getter y setter para cada atributo
    public int getId() { return this.id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public File getSource() { return this.source; }

    public void setSource(File source) { this.source = source; }

    public File getDestination() { return this.destination; }

    public void setDestination(File destination) { this.destination = destination; }

    public LocalDate getLastBackup() { return this.lastBackup; }

    public void setLastBackup(LocalDate lastBackup) { this.lastBackup = lastBackup; }

    public int getDayInterval() { return this.dayInterval; }

    public void setDayInterval(int dayInterval) { this.dayInterval = dayInterval; }

    @Override
    public String toString() {
        return "[ID: " + this.getId() +
                " Name: " + this.getName() +
                " Source: " + this.getSource().getAbsolutePath() +
                " Destination: " + this.getDestination().getAbsolutePath() +
                " Last Backup: "  + this.getLastBackup().toString() +
                " Day interval: " + this.getDayInterval() + "]";
    }

    /**
     * Convierte los atributos de la copia de seguridad a un array de Strings.
     *
     * @return Un array de Strings representando la copia de seguridad.
     */
    public String[] toArray() {
        return new String[]{String.valueOf(this.getId()),
                this.getName(),
                this.getSource().getAbsolutePath(),
                this.getDestination().getAbsolutePath(),
                Utilities.formatDateToEU(this.getLastBackup()),
                String.valueOf(this.getDayInterval())};
    }
}
