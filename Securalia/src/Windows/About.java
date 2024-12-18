package Windows;

/**
 * Clase que representa un diálogo modal que muestra información sobre la aplicación.
 * 
 * @author Luis Carlos Caicedo Giraldo
 */
public class About extends javax.swing.JDialog {
    private final Main PARENT; 
    
    /**
     * Constructor de la clase About.
     *
     * @param parent Ventana principal que actúa como padre.
     * @param modal Indica si el diálogo es modal.
     */
    public About(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        PARENT = (Main) parent;
        initApp();
    }
    
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Securalia | Acerca de");
        setResizable(false);

        background.setBackground(new java.awt.Color(246, 236, 234));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(119, 70, 61));
        jLabel1.setText("Proyecto Securalia");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(119, 70, 61));
        jLabel2.setText("Modulo  Acceso a Datos   2º DAM");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(119, 70, 61));
        jLabel3.setText("Creado por:  Luis Carlos Caicedo Giraldo");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Custom Code"> 
    /**
     * Inicializa la configuración del diálogo.
     * Ajusta el tamaño y la ubicación del diálogo en relación al padre.
     */
    private void initApp() {
        this.setSize(400, 200);
        this.setLocation(PARENT.getLocation().x + (PARENT.getSize().width / 4), PARENT.getLocation().y + (PARENT.getSize().height / 3));
    }
    // </editor-fold>
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
