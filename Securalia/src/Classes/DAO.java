/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.sql.*;
import java.time.LocalDate;
import java.io.File;

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
     * Agrega una nueva programación de copia de seguridad a la base de datos.
     * 
     * @param schedule La programación de copia de seguridad a agregar.
     * @return true si la operación fue exitosa, false en caso contrario.
     */
    public boolean addBackup(Backup schedule) {
        try {
            Connection conn = DriverManager.getConnection(URL);
            
            String query = "INSERT INTO " + TABLE + " (id, name, source, destination, lastBackup, `interval`) VALUES (?, ?, ?, ?, ?, ?);";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setInt(1, schedule.getId());
                pstmt.setString(2, schedule.getName());
                pstmt.setString(3, schedule.getSource().getAbsolutePath());
                pstmt.setString(4, schedule.getDestination().getAbsolutePath());
                pstmt.setString(5, schedule.getLastBackup().toString());
                pstmt.setInt(6, schedule.getDayInterval());
                pstmt.executeUpdate();
            }

            conn.close();
        } catch (SQLException e) {
            System.err.println("ERROR: " + e.getMessage() + "\n");
            return false;
        }
        
        return true;
    }
    
    /**
     * Elimina una programación de copia de seguridad de la base de datos según su ID.
     * 
     * @param id El ID de la programación a eliminar.
     * @return true si la operación fue exitosa, false en caso contrario.
     */
    public boolean removeBackup(int id) {
        try {
            Connection conn = DriverManager.getConnection(URL);
            Statement stmt = conn.createStatement();
            
            String query = "DELETE FROM " + TABLE + " WHERE id = " + id + ";";
            stmt.executeUpdate(query);
            
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.err.println("ERROR: " + e.getMessage() + "\n");
            return false;
        }
        
        return true;
    }
    
    /**
     * Edita una programación de copia de seguridad en la base de datos.
     * 
     * @param schedule La programación de copia de seguridad con los nuevos datos.
     * @return true si la operación fue exitosa, false en caso contrario.
     */
    public boolean editBackup(Backup schedule) {
        try {
            Connection conn = DriverManager.getConnection(URL);
            
            String query = "UPDATE " + TABLE + " SET name=?, destination=?,`interval`=? WHERE id=?;";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, schedule.getName());
                pstmt.setString(2, schedule.getDestination().getAbsolutePath());
                pstmt.setInt(3, schedule.getDayInterval());
                pstmt.setInt(4, schedule.getId());
                pstmt.executeUpdate();
            }
            
            conn.close();
        } catch (SQLException e) {
            System.err.println("ERROR: " + e.getMessage() + "\n");
            return false;
        }
        
        return true;
    }
    
    /**
     * Recupera una programación de copia de seguridad de la base de datos según su ID.
     * 
     * @param id El ID de la programación a recuperar.
     * @return La programación de copia de seguridad correspondiente o null si no se encuentra.
     */
    public Backup getBackup(int id) {
        Backup schedule = new Backup();
        
        try {
            Connection conn = DriverManager.getConnection(URL);
            Statement stmt = conn.createStatement();
            
            String query = "SELECT * FROM " + TABLE + " WHERE id = " + id + ";";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                schedule.setId(rs.getInt("id"));
                schedule.setName(rs.getString("name"));
                schedule.setSource(new File(rs.getString("source")));
                schedule.setDestination(new File(rs.getString("destination")));
                String[] fieldsStr = rs.getString("lastBackup").split("-");
                int[] dateFields = Arrays.stream(fieldsStr).mapToInt(Integer::parseInt).toArray();
                schedule.setLastBackup(LocalDate.of(dateFields[0], dateFields[1], dateFields[2]));
                schedule.setDayInterval(rs.getInt("interval"));
            }
            
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.err.println("ERROR: " + e.getMessage() + "\n");
            return null;
        }
        
        return schedule;
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
