package Windows;

import Classes.*;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Clase principal de la aplicación que extiende {@link javax.swing.JFrame}.
 * Esta clase maneja la interfaz gráfica de usuario y la interacción con el usuario.
 * 
 * @author Luis Carlos Caicedo Giraldo
 */
public class Main extends javax.swing.JFrame {
    
    /** Dimensiones de la pantalla para centrar la ventana */
    private final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    
    /** Conexión con la base de datos */
    protected final DAO DATABASE = new DAO();
    
    /** Lista de las programaciones de copia de seguridad */
    protected final ArrayList<Backup> SCHEDULES = DATABASE.getBackups();
    
    /**
     * Constructor de la clase Main.
     * Inicializa los componentes de la interfaz gráfica y configura la aplicación.
     */
    public Main() {
        initComponents();       // Inicializa los componentes de la interfaz gráfica
        initApp();              // Configura la aplicación (centrar ventana, etc.)
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        editSchedules = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        mySchedules = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        createSchedule = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        aboutLbl = new javax.swing.JLabel();
        titleLbl1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Securalia");
        setResizable(false);

        background.setBackground(new java.awt.Color(246, 236, 234));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(186, 114, 100));

        editSchedules.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        editSchedules.setForeground(new java.awt.Color(255, 255, 255));
        editSchedules.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editSchedules.setText("MODIFICAR  UNA  PROGRAMACIÓN");
        editSchedules.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editSchedules.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editSchedulesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editSchedulesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editSchedulesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editSchedulesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                editSchedulesMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editSchedules, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(editSchedules, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 240, 50));

        jPanel2.setBackground(new java.awt.Color(186, 114, 100));

        mySchedules.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        mySchedules.setForeground(new java.awt.Color(255, 255, 255));
        mySchedules.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mySchedules.setText("VER  MIS  PROGRAMACIONES");
        mySchedules.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mySchedules.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mySchedulesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mySchedulesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mySchedulesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mySchedulesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mySchedulesMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mySchedules, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mySchedules, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 240, 50));

        jPanel1.setBackground(new java.awt.Color(186, 114, 100));

        createSchedule.setBackground(new Color(0, 0, 0, 255));
        createSchedule.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        createSchedule.setForeground(new java.awt.Color(255, 255, 255));
        createSchedule.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createSchedule.setText("PROGRAMAR  COPIA");
        createSchedule.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createSchedule.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        createSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createScheduleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createScheduleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createScheduleMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                createScheduleMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                createScheduleMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 240, 50));

        titleLbl.setFont(new java.awt.Font("Reem Kufi", 1, 100)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(119, 70, 61));
        titleLbl.setText("RALIA");
        background.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, 70));

        aboutLbl.setForeground(new java.awt.Color(119, 70, 61));
        aboutLbl.setText("<html><u>Acerca de</u></html>");
        aboutLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutLblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aboutLblMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                aboutLblMouseReleased(evt);
            }
        });
        background.add(aboutLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, -1, -1));

        titleLbl1.setFont(new java.awt.Font("Reem Kufi", 1, 100)); // NOI18N
        titleLbl1.setForeground(new java.awt.Color(119, 70, 61));
        titleLbl1.setText("SECU");
        background.add(titleLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, 80));

        jPanel4.setBackground(new java.awt.Color(119, 70, 61));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        background.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 160, 20));

        jPanel5.setBackground(new java.awt.Color(119, 70, 61));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        background.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 160, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Custom Code">         
    /**
     * Método para inicializar la aplicación.
     * Centra la ventana en la pantalla.
     */
    private void initApp() {
        this.setLocation(SCREEN_SIZE.width / 2 - this.getSize().width / 2, SCREEN_SIZE.height / 2 - this.getSize().height / 2);   
        
        checkSchedules();
    }
    
    /**
     * Verifica las rutas de origen y destino en la lista de SCHEDULES y muestra 
     * un mensaje de advertencia si alguna no existe.
     * 
     * <p>El reporte se limita a un máximo de 5 rutas no encontradas. Si se supera este
     * límite, se indica con puntos suspensivos.</p>
     * 
     * @see Backup
     */
    private void checkSchedules() {
        final int MAX_PATHS = 5;
        int cont = 0;
        
        String nonExistentRoutes = "No se han encontrado los siguientes archivos o directorios:\n";
        for (Backup backup : SCHEDULES) {
            
            if (cont == MAX_PATHS) {
                nonExistentRoutes += "...";
                return;
            }
            
            if (!backup.getSource().getAbsoluteFile().exists()) {
                nonExistentRoutes += backup.getSource().getAbsoluteFile() + "\n";
                cont += 1;
            }
            
            if (!backup.getDestination().getAbsoluteFile().exists()) {
                nonExistentRoutes += backup.getDestination().getAbsoluteFile() + "\n";
                cont += 1;
            }
        }
        
        if (!nonExistentRoutes.equals("No se han encontrado los siguientes archivos o directorios:\n")) {
            JOptionPane.showMessageDialog(null,
                nonExistentRoutes, "¡Atención!", JOptionPane.WARNING_MESSAGE);
        }
    }
    // </editor-fold>
    
    /**
     * Maneja el evento de clic en "Crear Programación".
     * Muestra la ventana para crear una nueva programación.
     * 
     * @param evt el evento de clic del mouse
     */
    private void createScheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createScheduleMouseClicked
        new NewSchedule(this, true).setVisible(true);
    }//GEN-LAST:event_createScheduleMouseClicked

    /**
     * Maneja el evento de clic en "Mis Programaciones".
     * Muestra la ventana con las programaciones actuales.
     * 
     * @param evt el evento de clic del mouse
     */
    private void mySchedulesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mySchedulesMouseClicked
        new MySchedules(this, true).setVisible(true);
    }//GEN-LAST:event_mySchedulesMouseClicked
     
    /**
     * Maneja el evento de clic en "Editar Programaciones".
     * Muestra la ventana para editar una programación existente.
     * 
     * @param evt el evento de clic del mouse
     */
    private void editSchedulesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editSchedulesMouseClicked
        new EditSchedules(this, true).setVisible(true);
    }//GEN-LAST:event_editSchedulesMouseClicked
    
    // <editor-fold defaultstate="collapsed" desc="Style's Code">
    private void createScheduleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createScheduleMouseEntered
        this.jPanel1.setBackground( new Color(170, 101, 88) );
    }//GEN-LAST:event_createScheduleMouseEntered

    private void createScheduleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createScheduleMouseExited
       this.jPanel1.setBackground( new Color(186, 114, 100) );
    }//GEN-LAST:event_createScheduleMouseExited

    private void createScheduleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createScheduleMousePressed
        this.jPanel1.setBackground( new Color (142, 83, 71) );
    }//GEN-LAST:event_createScheduleMousePressed

    private void createScheduleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createScheduleMouseReleased
        this.jPanel1.setBackground( new Color(186, 114, 100) );
    }//GEN-LAST:event_createScheduleMouseReleased

    private void mySchedulesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mySchedulesMouseEntered
        this.jPanel2.setBackground( new Color(170, 101, 88) );
    }//GEN-LAST:event_mySchedulesMouseEntered

    private void mySchedulesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mySchedulesMouseExited
        this.jPanel2.setBackground( new Color(186, 114, 100) );
    }//GEN-LAST:event_mySchedulesMouseExited

    private void mySchedulesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mySchedulesMousePressed
        this.jPanel2.setBackground( new Color (142, 83, 71) );
    }//GEN-LAST:event_mySchedulesMousePressed

    private void mySchedulesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mySchedulesMouseReleased
        this.jPanel2.setBackground( new Color(186, 114, 100) );
    }//GEN-LAST:event_mySchedulesMouseReleased

    private void editSchedulesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editSchedulesMouseEntered
        this.jPanel3.setBackground( new Color(170, 101, 88) );
    }//GEN-LAST:event_editSchedulesMouseEntered

    private void editSchedulesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editSchedulesMouseExited
        this.jPanel3.setBackground( new Color(186, 114, 100) );
    }//GEN-LAST:event_editSchedulesMouseExited

    private void editSchedulesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editSchedulesMousePressed
        this.jPanel3.setBackground( new Color (142, 83, 71) );
    }//GEN-LAST:event_editSchedulesMousePressed

    private void editSchedulesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editSchedulesMouseReleased
        this.jPanel3.setBackground( new Color(186, 114, 100) );
    }//GEN-LAST:event_editSchedulesMouseReleased
    // </editor-fold>
    
    /**
     * Maneja el evento de clic en "Acerca de".
     * Muestra la ventana con información sobre la aplicación.
     * 
     * @param evt el evento de clic del mouse
     */
    private void aboutLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutLblMouseClicked
        new About(this, true).setVisible(true);
    }//GEN-LAST:event_aboutLblMouseClicked

    // <editor-fold defaultstate="collapsed" desc="Style's Code">
    private void aboutLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutLblMouseEntered
        this.aboutLbl.setForeground( new Color(100, 63, 56) );
    }//GEN-LAST:event_aboutLblMouseEntered

    private void aboutLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutLblMouseExited
        this.aboutLbl.setForeground( new Color(119, 70, 61) );
    }//GEN-LAST:event_aboutLblMouseExited

    private void aboutLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutLblMousePressed
        this.aboutLbl.setForeground( new Color(53, 30, 26) );
    }//GEN-LAST:event_aboutLblMousePressed

    private void aboutLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutLblMouseReleased
        this.aboutLbl.setForeground( new Color(119, 70, 61) );
    }//GEN-LAST:event_aboutLblMouseReleased
    // </editor-fold>
    
    /**
     * Método principal que se ejecuta al iniciar la aplicación.
     * Establece la apariencia del sistema y crea una nueva instancia de la clase Main.
     *
     * @param args los argumentos de línea de comandos
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException |
                    InstantiationException |
                    IllegalAccessException |
                    javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutLbl;
    private javax.swing.JPanel background;
    private javax.swing.JLabel createSchedule;
    private javax.swing.JLabel editSchedules;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel mySchedules;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel titleLbl1;
    // End of variables declaration//GEN-END:variables
}

