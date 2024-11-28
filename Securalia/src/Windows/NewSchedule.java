package Windows;

import Classes.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import java.io.File;
import java.time.LocalDate;

/**
 * Clase que representa la ventana modal para crear una nueva programación de copia de seguridad.
 * 
 * @author Luis Carlos Caicedo Giraldo
 */
public class NewSchedule extends javax.swing.JDialog {
    /** La fecha actual utilizada para establecer valores predeterminados o realizar cálculos de fechas. */
    private final LocalDate CURRENT_DATE = LocalDate.now();
    
    /** Referencia al marco principal de la aplicación, permitiendo la interacción con la ventana principal. */
    private final Main PARENT;
    
    /**
     * Constructor de la clase NewSchedule.
     * Crea una nueva instancia de la ventana modal para configurar una nueva programación de copia de seguridad.
     *
     * @param parent el marco padre de la ventana, que debe ser una instancia de {@link Main}.
     * @param modal indica si la ventana es modal (true) o no (false).
     */
    public NewSchedule(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.PARENT = (Main) parent;
        this.initApp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backBtn = new javax.swing.JPanel();
        backLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        backupNameLbl = new javax.swing.JLabel();
        backupIntervalLbl = new javax.swing.JLabel();
        backupOriginLbl = new javax.swing.JLabel();
        backupDestinationLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        backupName = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        backupInterval = new javax.swing.JSpinner();
        nextBackup = new javax.swing.JLabel();
        confirmScheduling = new javax.swing.JPanel();
        confirmSchedulingLbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        backupSource = new javax.swing.JTextField();
        backupDestination = new javax.swing.JTextField();
        clearFields = new javax.swing.JPanel();
        clearFieldsLbl = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Securalia | Programar una copia de seguridad");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(246, 236, 234));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtn.setBackground(new java.awt.Color(186, 114, 100));

        backLbl.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        backLbl.setForeground(new java.awt.Color(255, 255, 255));
        backLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backLbl.setText("Atras");
        backLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backLblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backLblMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backLblMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout backBtnLayout = new javax.swing.GroupLayout(backBtn);
        backBtn.setLayout(backBtnLayout);
        backBtnLayout.setHorizontalGroup(
            backBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        backBtnLayout.setVerticalGroup(
            backBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 90, 30));

        titleLbl.setFont(new java.awt.Font("Reem Kufi", 1, 23)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(119, 70, 61));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("PROGRAMA  UNA  COPIA  DE SEGURIDAD");
        jPanel1.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 480, 40));

        backupNameLbl.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        backupNameLbl.setText("Nombre de la copia : ");
        jPanel1.add(backupNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 120, 20));

        backupIntervalLbl.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        backupIntervalLbl.setText("Intervalo entre cada copia :");
        jPanel1.add(backupIntervalLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, 20));

        backupOriginLbl.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        backupOriginLbl.setText("Origen de la copia :");
        jPanel1.add(backupOriginLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 20));

        backupDestinationLbl.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        backupDestinationLbl.setText("Destino de la copia :");
        jPanel1.add(backupDestinationLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 120, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 260, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 220, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 220, 10));

        backupName.setBackground(new java.awt.Color(246, 236, 234));
        backupName.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        backupName.setForeground(java.awt.Color.gray);
        backupName.setBorder(null);
        backupName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        backupName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                backupNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                backupNameFocusLost(evt);
            }
        });
        jPanel1.add(backupName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 240, 40));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 200, 10));

        backupInterval.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        backupInterval.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        backupInterval.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backupInterval.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                backupIntervalStateChanged(evt);
            }
        });
        jPanel1.add(backupInterval, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 50, 30));

        nextBackup.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        nextBackup.setText("Proxima copia : 00/00/0000");
        jPanel1.add(nextBackup, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 180, 40));

        confirmScheduling.setBackground(new java.awt.Color(186, 114, 100));

        confirmSchedulingLbl.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        confirmSchedulingLbl.setForeground(new java.awt.Color(255, 255, 255));
        confirmSchedulingLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmSchedulingLbl.setText("Confirmar");
        confirmSchedulingLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmSchedulingLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmSchedulingLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmSchedulingLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmSchedulingLblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                confirmSchedulingLblMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                confirmSchedulingLblMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout confirmSchedulingLayout = new javax.swing.GroupLayout(confirmScheduling);
        confirmScheduling.setLayout(confirmSchedulingLayout);
        confirmSchedulingLayout.setHorizontalGroup(
            confirmSchedulingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(confirmSchedulingLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        confirmSchedulingLayout.setVerticalGroup(
            confirmSchedulingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmSchedulingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(confirmSchedulingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(confirmScheduling, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 90, 30));

        jButton1.setBackground(new java.awt.Color(186, 114, 100));
        jButton1.setFont(new java.awt.Font("Rubik", 0, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("...");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 30, 20));

        jButton2.setBackground(new java.awt.Color(186, 114, 100));
        jButton2.setFont(new java.awt.Font("Rubik", 0, 10)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("...");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 30, 20));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 430, 20));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 430, 20));

        backupSource.setEditable(false);
        backupSource.setBackground(new java.awt.Color(246, 236, 234));
        backupSource.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        backupSource.setForeground(java.awt.Color.gray);
        backupSource.setText("C:\\...");
        backupSource.setBorder(null);
        backupSource.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(backupSource, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 200, 40));

        backupDestination.setEditable(false);
        backupDestination.setBackground(new java.awt.Color(246, 236, 234));
        backupDestination.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        backupDestination.setForeground(java.awt.Color.gray);
        backupDestination.setText("C:\\...");
        backupDestination.setBorder(null);
        backupDestination.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(backupDestination, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 200, 40));

        clearFields.setBackground(new java.awt.Color(186, 114, 100));

        clearFieldsLbl.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        clearFieldsLbl.setForeground(new java.awt.Color(255, 255, 255));
        clearFieldsLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clearFieldsLbl.setText("Limpiar");
        clearFieldsLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearFieldsLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearFieldsLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearFieldsLblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clearFieldsLblMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                clearFieldsLblMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout clearFieldsLayout = new javax.swing.GroupLayout(clearFields);
        clearFields.setLayout(clearFieldsLayout);
        clearFieldsLayout.setHorizontalGroup(
            clearFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clearFieldsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        clearFieldsLayout.setVerticalGroup(
            clearFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clearFieldsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(clearFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 90, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 480, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Custom Code"> 
    /**
     * Inicializa la configuración de la ventana modal.
     * Este método establece el tamaño y la posición de la ventana en función de la ubicación del marco padre,
     * y asigna valores predeterminados a los campos de texto de la ventana.
     */
    private void initApp(){
        this.setSize(550, 550);
        this.setLocation(
                PARENT.getLocation().x + (PARENT.getSize().width / 6),
                PARENT.getLocation().y + (PARENT.getSize().height / 10)
        );
        
        this.backupName.setText("Ejemplo-" + Utilities.formatDateToEU(CURRENT_DATE));
        this.nextBackup.setText("Proxima copia : " + Utilities.formatDateToEU(CURRENT_DATE.plusDays(1))); 
    }
    
    /**
     * Crea un nuevo objeto de tipo {@link Backup} utilizando los datos ingresados en los campos de la interfaz.
     * Asigna automáticamente un ID incrementado en base al último ID en la lista de programaciones de la ventana principal.
     * 
     * @return un objeto {@link Backup} con los valores especificados en la interfaz de usuario.
     */
    private Backup createBackup() {
        Backup schedule = new Backup();
        int id;
        if (PARENT.SCHEDULES.isEmpty()) {
            id = 1;
        } else {
            id = PARENT.SCHEDULES.get(PARENT.SCHEDULES.size() - 1).getId() + 1;
        }
        
        try {
            schedule.setId(id);
            schedule.setName(this.backupName.getText());
            schedule.setSource(new File(this.backupSource.getText()));
            schedule.setDestination(new File(this.backupDestination.getText()));
            schedule.setLastBackup(CURRENT_DATE);
            schedule.setDayInterval((int) this.backupInterval.getValue());
        } catch (Exception e) {
            System.err.println("ERROR" + e.getMessage() + "\n");
            JOptionPane.showMessageDialog(this, "Los valores de los campos no son válidos", "¡Atención!", JOptionPane.ERROR_MESSAGE);
        }
        
        return schedule;
    }

    /**
     * Cierra la ventana después de confirmar con el usuario.
     * Este método muestra un cuadro de diálogo de confirmación al usuario. Si el usuario selecciona "Sí",
     * se descartan todos los datos y la ventana se cierra. Si selecciona "No", la ventana permanece abierta.
     */
    private void close() {
        if ((backupName.getText().equals("Ejemplo-" + Utilities.formatDateToEU(CURRENT_DATE)) || backupName.getText().isEmpty()) &&
                backupSource.getText().equals("C:\\...") &&
                backupDestination.getText().equals("C:\\...") &&
                backupInterval.getValue().equals(1)) {
            this.dispose();
        } else {
            int option = JOptionPane.showConfirmDialog(null,"Se perderan todos los datos", "¿Desea salir?", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                this.dispose();
            }
        }
    }// </editor-fold>  
    
    /**
     * Maneja el evento de clic para regresar a la ventana anterior.
     * Llama al método {@link #close()} para confirmar y cerrar la ventana actual.
     *
     * @param evt el evento de clic del ratón generado al hacer clic en la etiqueta de retroceso
     */
    private void backLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMouseClicked
        close();
    }//GEN-LAST:event_backLblMouseClicked

    /**
     * Maneja el evento de clic para confirmar y guardar una programación de copia de seguridad.
     * Verifica que los campos necesarios estén completos, crea la programación y la guarda en la base de datos.
     * Muestra mensajes al usuario según el resultado de la operación.
     *
     * @param evt el evento de clic del ratón generado al hacer clic en la etiqueta de confirmación
     */
    private void confirmSchedulingLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmSchedulingLblMouseClicked
        if (this.backupName.getText().isEmpty() ||                              // Comprueba que los campos no esten vacios
                this.backupSource.getText().equals("C:\\...") ||
                this.backupDestination.getText().equals("C:\\...")) {
            JOptionPane.showMessageDialog(this, "Completa la programación de la copia", "¡Atención!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Backup backupSchedule = createBackup();                                 // Crea la programación de la copia de seguridad
  
        if (!this.PARENT.DATABASE.addBackup(backupSchedule)) {                  // Añade la programación a la base de datos
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error con la base de datos", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Se ha guardado la programación correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            PARENT.SCHEDULES.add(backupSchedule);
        }
        this.dispose();
    }//GEN-LAST:event_confirmSchedulingLblMouseClicked

    // <editor-fold defaultstate="collapsed" desc="Styles Code"> 
    private void backLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMouseEntered
        this.backBtn.setBackground( new Color(170, 101, 88) );
    }//GEN-LAST:event_backLblMouseEntered

    private void backLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMouseExited
        this.backBtn.setBackground( new Color(186, 114, 100) );
    }//GEN-LAST:event_backLblMouseExited

    private void backLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMousePressed
        this.backBtn.setBackground( new Color(170, 101, 88)  );
    }//GEN-LAST:event_backLblMousePressed

    private void backLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMouseReleased
        this.backBtn.setBackground( new Color(186, 114, 100) );
    }//GEN-LAST:event_backLblMouseReleased
   
    private void confirmSchedulingLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmSchedulingLblMouseEntered
        this.confirmScheduling.setBackground( new Color(170, 101, 88) );
    }//GEN-LAST:event_confirmSchedulingLblMouseEntered

    private void confirmSchedulingLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmSchedulingLblMouseExited
        this.confirmScheduling.setBackground( new Color(186, 114, 100) );
    }//GEN-LAST:event_confirmSchedulingLblMouseExited

    private void confirmSchedulingLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmSchedulingLblMousePressed
        this.confirmScheduling.setBackground( new Color(142, 83, 71) );
    }//GEN-LAST:event_confirmSchedulingLblMousePressed

    private void confirmSchedulingLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmSchedulingLblMouseReleased
        this.confirmScheduling.setBackground( new Color(186, 114, 100) );
    }//GEN-LAST:event_confirmSchedulingLblMouseReleased

    private void backupNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_backupNameFocusGained
        String exampleName = "Ejemplo-" + Utilities.formatDateToEU(CURRENT_DATE);
        if (this.backupName.getText().equals(exampleName)) {
            this.backupName.setText("");
            this.backupName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_backupNameFocusGained

    private void backupNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_backupNameFocusLost
        String exampleName = "Ejemplo-" + Utilities.formatDateToEU(CURRENT_DATE);
        if (this.backupName.getText().isEmpty()) {
            this.backupName.setForeground(Color.GRAY);
            this.backupName.setText(exampleName);
        }
    }//GEN-LAST:event_backupNameFocusLost
       // </editor-fold> 
    
    /**
     * Maneja el evento de acción para seleccionar un archivo o directorio como origen de la copia de seguridad.
     * Este método abre un cuadro de diálogo de selección de archivos. Si el usuario selecciona un archivo o
     * directorio, actualiza el campo de texto del origen de la copia de seguridad con la ruta seleccionada y
     * establece un nombre sugerido para la copia de seguridad basado en el nombre del archivo o directorio y la fecha actual.
     *
     * @param evt el evento de acción generado al hacer clic en el botón de selección de origen
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();
            this.backupSource.setForeground(Color.BLACK);                       // Cambia el color de la fuente del origen de la copia de seguridad
            this.backupSource.setText(filePath);                                // Establece el TextField del origen con la ruta del origen
            this.backupSource.setToolTipText(filePath);                         // Establece el ToolTipText del origen con la ruta del origen
            if (!this.backupSource.getText().isEmpty() && !this.backupSource.getText().equals("C:\\...")) {
                String fileName = selectedFile.getName();
                this.backupName.setForeground(Color.BLACK);                                                         // Cambia el color de la fuente del nombre de la copia de seguridad
                this.backupName.setText(fileName + "-" + Utilities.formatDateToEU(CURRENT_DATE));                   // Establece un nuevo nombre
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Maneja el evento de acción para seleccionar un directorio como destino de la copia de seguridad.
     * Este método abre un cuadro de diálogo de selección de archivos. Si el usuario selecciona un directorio,
     * actualiza el campo de texto del destino de la copia de seguridad con la ruta seleccionada. Si se selecciona
     * un archivo en su lugar, se muestra un mensaje de advertencia al usuario indicando que el destino debe ser un directorio.
     *
     * @param evt el evento de acción generado al hacer clic en el botón de selección de destino
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();
            if (selectedFile.isFile()) {                                        // El destino debe ser un directorio
                JOptionPane.showMessageDialog(this, "El destino debe ser un directorio", "¡Atención!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                this.backupDestination.setForeground(Color.BLACK);              // Cambia el color de la fuente del destino de la copia de seguridad              
                this.backupDestination.setText(filePath);                       // Establece el TextField del destino con la ruta del origen
                this.backupDestination.setToolTipText(filePath);                // Establece el ToolTipText del destino con la ruta del origen
            }   
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Maneja el evento de cambio en el valor del intervalo de copias de seguridad.
     * Este método se invoca cuando el usuario ajusta el valor del componente de intervalo. Actualiza
     * el texto que muestra la próxima fecha de copia de seguridad en función del intervalo seleccionado.
     *
     * @param evt el evento de cambio generado al modificar el valor del intervalo de copias
     */
    private void backupIntervalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_backupIntervalStateChanged
        int interval = (int) this.backupInterval.getValue();
        this.nextBackup.setForeground(Color.BLACK);
        this.nextBackup.setText("Proxima copia : " + Utilities.formatDateToEU(CURRENT_DATE.plusDays(interval)));
    }//GEN-LAST:event_backupIntervalStateChanged

    /**
     * Maneja el evento de clic en la etiqueta para limpiar los campos de la programación de copia de seguridad.
     * Este método comprueba si los campos de entrada no están vacíos y solicita confirmación al usuario
     * antes de limpiar los campos. Si el usuario confirma, restablece los campos a sus valores predeterminados
     * y actualiza el texto que muestra la próxima copia de seguridad.
     *
     * @param evt el evento de clic del ratón generado al hacer clic en la etiqueta de limpieza de campos
     */
    private void clearFieldsLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldsLblMouseClicked
        if (!this.backupName.getText().isEmpty() ||                             // Comprueba que los campos no esten vacios
                !this.backupSource.getText().equals("C:\\...") ||
                !this.backupDestination.getText().equals("C:\\...")) {
            int option = JOptionPane.showConfirmDialog(null,"Se limpiaran los campos de la programación", "¡Atención!", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                this.backupName.setText("Ejemplo-" + Utilities.formatDateToEU(CURRENT_DATE));
                this.backupName.setForeground(Color.GRAY);
                this.backupSource.setText("C:\\...");
                this.backupSource.setForeground(Color.GRAY);
                this.backupDestination.setText("C:\\...");
                this.backupDestination.setForeground(Color.GRAY);
                this.nextBackup.setText("Proxima copia : " + Utilities.formatDateToEU(CURRENT_DATE.plusDays(1)));
                this.backupInterval.setValue(1);
            }
        }
    }//GEN-LAST:event_clearFieldsLblMouseClicked

    // <editor-fold defaultstate="collapsed" desc="Styles Code"> 
    private void clearFieldsLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldsLblMouseEntered
        this.clearFields.setBackground( new Color(170, 101, 88) );
    }//GEN-LAST:event_clearFieldsLblMouseEntered

    private void clearFieldsLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldsLblMouseExited
        this.clearFields.setBackground( new Color(186, 114, 100) );
    }//GEN-LAST:event_clearFieldsLblMouseExited

    private void clearFieldsLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldsLblMousePressed
        this.clearFields.setBackground( new Color(142, 83, 71) );
    }//GEN-LAST:event_clearFieldsLblMousePressed

    private void clearFieldsLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldsLblMouseReleased
        this.clearFields.setBackground( new Color(186, 114, 100) );
    }//GEN-LAST:event_clearFieldsLblMouseReleased
    // </editor-fold>
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backBtn;
    private javax.swing.JLabel backLbl;
    private javax.swing.JTextField backupDestination;
    private javax.swing.JLabel backupDestinationLbl;
    private javax.swing.JSpinner backupInterval;
    private javax.swing.JLabel backupIntervalLbl;
    private javax.swing.JTextField backupName;
    private javax.swing.JLabel backupNameLbl;
    private javax.swing.JLabel backupOriginLbl;
    private javax.swing.JTextField backupSource;
    private javax.swing.JPanel clearFields;
    private javax.swing.JLabel clearFieldsLbl;
    private javax.swing.JPanel confirmScheduling;
    private javax.swing.JLabel confirmSchedulingLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel nextBackup;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
