package Windows;

import Classes.*;
import java.awt.Color;
import java.util.ArrayList;
import java.io.File;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.event.ListSelectionEvent;


/**
 * Clase que representa un diálogo para editar programaciones de copias de seguridad.
 * 
 * @author Luis Carlos Caicedo Giraldo
 */
public class EditSchedules extends javax.swing.JDialog {
    
    /** La fecha actual utilizada para establecer valores predeterminados o realizar cálculos de fechas. */
    private final LocalDate CURRENT_DATE = LocalDate.now();
    
    /** Referencia al marco principal de la aplicación, permitiendo la interacción con la ventana principal. */
    private final Main PARENT;
    
    /** La programación de copia de seguridad actualmente seleccionada para editar. */
    private Backup currentSchedule;
    
    /**
     * Constructor de la clase EditSchedules.
     * Este constructor inicializa un nuevo diálogo para editar las programaciones de copias
     * de seguridad. Establece el marco principal de la aplicación como el padre del diálogo
     * y configura la ventana para que sea modal. 
     *
     * @param parent El marco principal de la aplicación, que actúa como el padre de este diálogo.
     * @param modal Un booleano que indica si el diálogo debe ser modal (verdadero) o no (falso).
     */
    public EditSchedules(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        PARENT = (Main) parent;
        this.initApp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        backBtn = new javax.swing.JPanel();
        backLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        modifyBtn = new javax.swing.JPanel();
        modifyLbl = new javax.swing.JLabel();
        removeBtn = new javax.swing.JPanel();
        removeLbl = new javax.swing.JLabel();
        backupInterval = new javax.swing.JSpinner();
        jSeparator3 = new javax.swing.JSeparator();
        nextBackup = new javax.swing.JLabel();
        backupIntervalLbl = new javax.swing.JLabel();
        backupNameLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        backupName = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        backupDestinationLbl = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        backupDestination = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        backupSource = new javax.swing.JTextField();
        backupOriginLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Securalia | Modificar una programación");
        setResizable(false);

        background.setBackground(new java.awt.Color(246, 236, 234));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 170, 410));

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
                .addComponent(backLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 90, -1));

        titleLbl.setFont(new java.awt.Font("Reem Kufi", 1, 23)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(119, 70, 61));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("MODIFICA  UNA  PROGRAMACIÓN");
        background.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 400, 30));

        modifyBtn.setBackground(new java.awt.Color(186, 114, 100));

        modifyLbl.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        modifyLbl.setForeground(new java.awt.Color(255, 255, 255));
        modifyLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modifyLbl.setText("Modificar");
        modifyLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modifyLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifyLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modifyLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modifyLblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                modifyLblMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                modifyLblMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout modifyBtnLayout = new javax.swing.GroupLayout(modifyBtn);
        modifyBtn.setLayout(modifyBtnLayout);
        modifyBtnLayout.setHorizontalGroup(
            modifyBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modifyBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modifyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        modifyBtnLayout.setVerticalGroup(
            modifyBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modifyBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modifyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(modifyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, -1, -1));

        removeBtn.setBackground(new java.awt.Color(186, 114, 100));

        removeLbl.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        removeLbl.setForeground(new java.awt.Color(255, 255, 255));
        removeLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        removeLbl.setText("Eliminar");
        removeLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeLblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                removeLblMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                removeLblMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout removeBtnLayout = new javax.swing.GroupLayout(removeBtn);
        removeBtn.setLayout(removeBtnLayout);
        removeBtnLayout.setHorizontalGroup(
            removeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(removeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        removeBtnLayout.setVerticalGroup(
            removeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(removeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(removeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, -1, -1));

        backupInterval.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        backupInterval.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        backupInterval.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backupInterval.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                backupIntervalStateChanged(evt);
            }
        });
        background.add(backupInterval, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 50, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 180, 10));

        nextBackup.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        nextBackup.setText("Proxima copia : 00/00/0000");
        background.add(nextBackup, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 160, 40));

        backupIntervalLbl.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        backupIntervalLbl.setText("Intervalo entre cada copia :");
        background.add(backupIntervalLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 160, 20));

        backupNameLbl.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        backupNameLbl.setText("Nombre de la copia : ");
        background.add(backupNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 130, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 260, 10));

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
        background.add(backupName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 240, 40));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 220, 10));

        backupDestinationLbl.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        backupDestinationLbl.setText("Destino de la copia :");
        background.add(backupDestinationLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 120, 20));

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
        background.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 30, 20));

        backupDestination.setEditable(false);
        backupDestination.setBackground(new java.awt.Color(246, 236, 234));
        backupDestination.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        backupDestination.setForeground(java.awt.Color.gray);
        backupDestination.setText("C:\\...");
        backupDestination.setBorder(null);
        backupDestination.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        background.add(backupDestination, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 200, 40));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 420, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 260, 10));

        backupSource.setEditable(false);
        backupSource.setBackground(new java.awt.Color(246, 236, 234));
        backupSource.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        backupSource.setForeground(java.awt.Color.gray);
        backupSource.setText("C:\\...");
        backupSource.setBorder(null);
        backupSource.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        background.add(backupSource, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 240, 40));

        backupOriginLbl.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        backupOriginLbl.setText("Origen de la copia :");
        background.add(backupOriginLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 120, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Custom Code"> 
    /**
     * Inicializa la configuración de la ventana del diálogo.
     * Este método establece el tamaño y la ubicación del diálogo en relación con la ventana
     * principal de la aplicación. Intenta inicializar la tabla que muestra las programaciones
     * de copias de seguridad, y maneja posibles errores durante esta operación.
     */
    private void initApp() {
        this.setSize(700, 550);
        this.setLocation(
                PARENT.getLocation().x + (PARENT.getSize().width / 14),
                PARENT.getLocation().y + (PARENT.getSize().height / 10)
        );
        
        try { 
            initTable(); 
        } catch (Exception e) { System.err.println("ERROR: " + e.getMessage() + "\n"); }
    }

    /**
     * Inicializa la tabla que muestra las programaciones de copias de seguridad.
     * Este método crea un modelo de tabla con columnas para "ID" y "Nombre", y 
     * llena la tabla con los datos de las programaciones existentes. 
     * Los valores de ID y Nombre de cada programación se agregan como filas en la tabla.
     * 
     * @throws Exception Si ocurre un error durante la inicialización de la tabla.
     */
    private void initTable() throws Exception {
        DefaultTableModel table = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
               return false;
            }
        };
        
        String[] columnsName = {"ID", "Nombre"};
        table.setColumnIdentifiers(columnsName);
        
        ArrayList<Backup> schedules = PARENT.SCHEDULES;
        
        for (Backup schedule : schedules) {
            String[] row = {String.valueOf(schedule.getId()), schedule.getName()};
            table.addRow(row);
        }
        
        this.jTable1.setModel(table);
        
        tableSelectionListener();
        
        TableColumnModel columnModel = jTable1.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(5);
    
    }

    /**
     * Configura un listener para gestionar la selección de filas en la tabla de programaciones.
     * 
     * Este método añade un {@code ListSelectionListener} a la tabla {@code jTable1} que 
     * detecta cambios en la selección. Al seleccionar una fila, se obtiene el ID de la 
     * programación correspondiente y se actualiza el formulario con los datos de dicha 
     * programación, asegurando que se manejen solo los cambios finales de selección.
     */
    private void tableSelectionListener() {                                     // ActionListener de las filas seleccionadas;
        DefaultTableModel table = (DefaultTableModel) this.jTable1.getModel();
        this.jTable1.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            // Asegurarse de que la selección cambie
            if (!e.getValueIsAdjusting()) {
                int selectedRow = jTable1.getSelectedRow();
                if (selectedRow != -1) {
                    String idStr = (String) table.getValueAt(selectedRow, 0);
                    int backupId = Integer.parseInt(idStr);
                    for (Backup schedule : PARENT.SCHEDULES) {                  // Obtiene el objeto con el id de la programación
                        if (schedule.getId() == backupId) currentSchedule = schedule;
                    }
                    updateForm();                                               // Actualiza el formulario vacio con los datos de la programación seleccionada
                }
            }
        });
    }

    /**
     * Actualiza los campos del formulario con los datos de la programación de copia seleccionada.
     * Este método establece el nombre de la copia de seguridad, las rutas de origen y destino, 
     * y actualiza la información sobre la próxima copia programada. También ajusta los colores 
     * de los campos para indicar que contienen datos válidos.
     */
    private void updateForm() {
        this.backupName.setText(currentSchedule.getName());
        this.backupName.setForeground(Color.BLACK);
        this.backupSource.setText(currentSchedule.getSource().getAbsolutePath());
        this.backupDestination.setText(currentSchedule.getDestination().getAbsolutePath());
        this.backupDestination.setToolTipText(currentSchedule.getDestination().getAbsolutePath());
        this.backupDestination.setForeground(Color.BLACK);
        int interval = currentSchedule.getDayInterval();
        String date = Utilities.formatDateToEU(currentSchedule.getLastBackup().plusDays(interval));
        this.nextBackup.setText("Proxima copia: " + date);
        this.backupInterval.setValue(interval);
    }

    /**
     * Elimina una programación de copia de seguridad de la lista interna de programaciones.
     * Este método busca la programación con el identificador especificado en la lista de 
     * programaciones y, si se encuentra, la elimina de la lista {@code SCHEDULES} del 
     * objeto principal {@code PARENT}.
     * 
     * @param id El identificador de la programación a eliminar.
     */
    private void updateInternalList(int id) {
        for (Backup schedule : PARENT.SCHEDULES) { 
            if (schedule.getId() == id)  {
                PARENT.SCHEDULES.remove(schedule);
                return;
            } 
        }
    }// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Style's Code"> 
    private void backLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMouseEntered
        this.backBtn.setBackground( new Color(170, 101, 88) );
    }//GEN-LAST:event_backLblMouseEntered

    private void backLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMouseExited
        this.backBtn.setBackground( new Color(186, 114, 100) );
    }//GEN-LAST:event_backLblMouseExited

    private void backLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMousePressed
        this.backBtn.setBackground( new Color(142, 83, 71) );
    }//GEN-LAST:event_backLblMousePressed

    private void backLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMouseReleased
        this.backBtn.setBackground( new Color(186, 114, 100) );
    }//GEN-LAST:event_backLblMouseReleased
   
    private void modifyLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyLblMouseEntered
        this.modifyBtn.setBackground( new Color(170, 101, 88) );
    }//GEN-LAST:event_modifyLblMouseEntered

    private void modifyLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyLblMouseExited
        this.modifyBtn.setBackground( new Color(186, 114, 100) );
    }//GEN-LAST:event_modifyLblMouseExited

    private void modifyLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyLblMousePressed
    this.modifyBtn.setBackground( new Color(142, 83, 71) );
    }//GEN-LAST:event_modifyLblMousePressed

    private void modifyLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyLblMouseReleased
        this.modifyBtn.setBackground( new Color(186, 114, 100) );
    }//GEN-LAST:event_modifyLblMouseReleased
   
    private void removeLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeLblMouseEntered
        this.removeBtn.setBackground( new Color(170, 101, 88) );
    }//GEN-LAST:event_removeLblMouseEntered

    private void removeLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeLblMouseExited
        this.removeBtn.setBackground( new Color(186, 114, 100) );
    }//GEN-LAST:event_removeLblMouseExited

    private void removeLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeLblMousePressed
        this.removeBtn.setBackground( new Color(142, 83, 71) );
    }//GEN-LAST:event_removeLblMousePressed

    private void removeLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeLblMouseReleased
        this.removeBtn.setBackground( new Color(186, 114, 100) );
    }//GEN-LAST:event_removeLblMouseReleased
    // </editor-fold>
    
    /**
     * Actualiza la fecha de la próxima copia de seguridad según el intervalo seleccionado.
     * 
     * @param evt Evento que indica el cambio en el intervalo de días.
     */
    private void backupIntervalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_backupIntervalStateChanged
        if (currentSchedule != null) {
            int interval = (int) this.backupInterval.getValue();
            this.nextBackup.setForeground(Color.BLACK);
            this.nextBackup.setText("Proxima copia : " + Utilities.formatDateToEU(currentSchedule.getLastBackup().plusDays(interval)));
        }
    }//GEN-LAST:event_backupIntervalStateChanged

    // <editor-fold defaultstate="collapsed" desc="Style's Code"> 
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
     * Maneja la acción de seleccionar un directorio como destino para la copia de seguridad.
     * Si hay un horario de copia de seguridad actual, se abre un selector de archivos.
     * Si se elige un directorio, se actualiza el campo de destino. 
     * Si se elige un archivo, se muestra un mensaje de advertencia.
     *
     * @param evt Evento que indica que se ha realizado una acción en el botón.
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (currentSchedule != null) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                String filePath = selectedFile.getAbsolutePath();
                if (selectedFile.isFile()) {                                    // El destino debe ser un directorio
                    JOptionPane.showMessageDialog(this, "El destino debe ser un directorio", "¡Atención!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    this.backupDestination.setForeground(Color.BLACK);          // Cambia el color de la fuente del destino de la copia de seguridad
                    this.backupDestination.setText(filePath);                   // Establece el TextField del destino con la ruta del origen
                    this.backupDestination.setToolTipText(filePath);            // Establece el ToolTipText del destino con la ruta del origen
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Maneja la acción de eliminar programaciones seleccionadas en la tabla.
     * Al hacer clic en la etiqueta de eliminar, se presenta un cuadro de confirmación.
     * Si el usuario confirma, se eliminan las programaciones seleccionadas de la base de datos
     * y de la tabla.
     *
     * @param evt Evento que indica que se ha hecho clic en la etiqueta de eliminación.
     */
    private void removeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeLblMouseClicked
        DefaultTableModel currentModel = (DefaultTableModel) this.jTable1.getModel();
        int[] selection = this.jTable1.getSelectedRows();
        
        int option = JOptionPane.showConfirmDialog(null,"Se eliminaran las programaciones selecionadas", "¡Atención!", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            for (int row : selection) {
                String backupIdStr = String.valueOf(currentModel.getValueAt(row, 0));
                int backupId = Integer.parseInt(backupIdStr);                   // Obtiene el id de la programación seleccionada en la tabla
                PARENT.DATABASE.removeBackup(backupId);                         // Elimina la programación de la base de datos
                currentModel.removeRow(row);                                    // Elimina la programación de la tabla
                updateInternalList(backupId);
            }
        }
    }//GEN-LAST:event_removeLblMouseClicked

    /**
     * Maneja la acción de modificar la programación de copia seleccionada.
     * Al hacer clic en la etiqueta de modificar, se actualizan los campos del objeto
     * `currentSchedule` si han cambiado, y se intenta guardar la modificación en la base de datos.
     * Si la modificación es exitosa, se muestra un mensaje de éxito y se reinicializa la tabla.
     * Si hay un error, se muestra un mensaje de error.
     *
     * @param evt Evento que indica que se ha hecho clic en la etiqueta de modificación.
     */
    private void modifyLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyLblMouseClicked
        if (currentSchedule != null) {
            if (!this.backupName.getText().equals(currentSchedule.getName()) && !this.backupName.getText().isEmpty()) {
                currentSchedule.setName(this.backupName.getText());
            }
        
            if (!this.backupDestination.getText().equals(currentSchedule.getDestination().getAbsolutePath())) {
                currentSchedule.setDestination( new File(this.backupDestination.getText()));
            }
        
            if ((int) this.backupInterval.getValue() != currentSchedule.getDayInterval()) {
                currentSchedule.setDayInterval((int) this.backupInterval.getValue());
            }
            
            
            if (!PARENT.DATABASE.editBackup(currentSchedule)) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error con la modificación", "!Atención¡", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Se modificado la programación con exito", "Información", JOptionPane.INFORMATION_MESSAGE);
                try { initTable(); } catch (Exception e) { System.err.println("ERROR: " + e.getMessage() + "\n"); }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en la carga de la programación", "!Atención¡", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_modifyLblMouseClicked

    /**
     * Cierra el diálogo actual al hacer clic en la etiqueta de retroceso.
     *
     * @param evt Evento de clic.
     */
    private void backLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMouseClicked
        this.dispose();
    }//GEN-LAST:event_backLblMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backBtn;
    private javax.swing.JLabel backLbl;
    private javax.swing.JPanel background;
    private javax.swing.JTextField backupDestination;
    private javax.swing.JLabel backupDestinationLbl;
    private javax.swing.JSpinner backupInterval;
    private javax.swing.JLabel backupIntervalLbl;
    private javax.swing.JTextField backupName;
    private javax.swing.JLabel backupNameLbl;
    private javax.swing.JLabel backupOriginLbl;
    private javax.swing.JTextField backupSource;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel modifyBtn;
    private javax.swing.JLabel modifyLbl;
    private javax.swing.JLabel nextBackup;
    private javax.swing.JPanel removeBtn;
    private javax.swing.JLabel removeLbl;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
