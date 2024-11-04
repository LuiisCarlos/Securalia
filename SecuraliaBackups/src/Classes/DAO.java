package Classes;

import java.util.ArrayList;
import java.time.LocalDate;
import java.io.File;
import java.sql.*;

/**
 * Clase que gestiona las operaciones de acceso a datos (DAO) para la base de datos de copias de seguridad.
 * Proporciona métodos para agregar, eliminar, editar y recuperar programaciones de copias de seguridad.
 *
 * @author Luis Carlos Caicedo Giraldo
 */
public class DAO {
    private final String DB_FILENAME = "backup_schedule.db";                    // Nombre de el archivo .db que actua como base de datos
    private final String TABLE = "schedules";                                   // Nombre de la tabla
    private final String URL = "jdbc:sqlite:./" + DB_FILENAME;                  // URL de conexión a la base de datos

    /**
     * Constructor por defecto para la clase DAO.
     * Inicializa una nueva instancia de la clase sin establecer conexiones ni configuraciones específicas.
     */
    public DAO() { 
        createDatabase();
        createTable();
    }
    
    /**
     * Crea el archivo de base de datos si no existe.
     */
    private void createDatabase() {
        try (Connection conn = DriverManager.getConnection(URL)) {
            System.out.println("Tabla lista para ser usada.");
        } catch (SQLException e) {
            System.err.println("ERROR: " + e.getMessage() + "\n");
        }
    }

    /**
     * Crea la tabla 'schedules' en la base de datos si no existe.
     */
    private void createTable() {
        try {
            Connection conn = DriverManager.getConnection(URL);
            Statement stmt = conn.createStatement();
            
            String createSchedulesTable = """
                CREATE TABLE IF NOT EXISTS schedules (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    name TEXT NOT NULL,
                    source TEXT NOT NULL,
                    destination TEXT NOT NULL,
                    lastBackup TEXT NOT NULL,
                    interval INTEGER NOT NULL
                );
                """;
            
            stmt.execute(createSchedulesTable);
            
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.err.println("ERROR: " + e.getMessage() + "\n");
        }
    }

    /**
     * Recupera todas las programaciones de copia de seguridad de la base de datos.
     *
     * @return Una lista de todas las programaciones de copia de seguridad.
     */
    public ArrayList<Backup> getBackups() {
        ArrayList<Backup> schedules = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(URL);
            Statement stmt = conn.createStatement();

            String query = "SELECT * FROM " + TABLE + ";";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String[] date = rs.getString("lastBackup").split("-");
                LocalDate lastBackup = LocalDate.of(Integer.parseInt(date[0]) ,
                        Integer.parseInt(date[1]),
                        Integer.parseInt(date[2]));

                schedules.add(new Backup(
                        rs.getInt("id"),
                        rs.getString("name"),
                        new File(rs.getString("source")),
                        new File(rs.getString("destination")),
                        lastBackup,
                        rs.getInt("interval")
                ));
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.err.println("ERROR: " + e.getMessage() + "\n");
            return null;
        }

        return schedules;
    }
}
