package eltaloncine;
import javax.swing.JOptionPane;

public class PanelMenu extends javax.swing.JFrame {

    ElTalonCine elTalonCine;
    ElTalonCine estrenos;
    ElTalonCine clasicos;
    
    DialogFecha dialogFecha;
    
    public PanelMenu() {
        initComponents();
        dialogFecha = new DialogFecha(null, true);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        txtFieldIngresosTotales = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtFieldFechaIngresosTotales = new javax.swing.JTextField();
        sideBar = new javax.swing.JPanel();
        btnVistaEstrenos = new javax.swing.JButton();
        btnVistaClasicos = new javax.swing.JButton();
        btnVistaMenu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(153, 102, 0));
        setPreferredSize(new java.awt.Dimension(1320, 1400));
        setSize(new java.awt.Dimension(1320, 1400));

        menu.setBackground(new java.awt.Color(255, 255, 204));
        menu.setPreferredSize(new java.awt.Dimension(1320, 1400));

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 96)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EL TALON");

        jButton12.setBackground(new java.awt.Color(51, 0, 0));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("INGRESOS TOTALES");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresosTotalesActionPerformed(evt);
            }
        });

        txtFieldIngresosTotales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFieldIngresosTotales.setEnabled(false);

        jButton1.setBackground(new java.awt.Color(102, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Fecha Ingresos Totales");
        jButton1.setToolTipText("");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechaIngresosTotales(evt);
            }
        });

        txtFieldFechaIngresosTotales.setEditable(false);
        txtFieldFechaIngresosTotales.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        txtFieldFechaIngresosTotales.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 302, Short.MAX_VALUE))
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtFieldIngresosTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFieldFechaIngresosTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldFechaIngresosTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167)
                .addComponent(txtFieldIngresosTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(661, Short.MAX_VALUE))
        );

        sideBar.setBackground(new java.awt.Color(255, 255, 153));
        sideBar.setPreferredSize(new java.awt.Dimension(320, 1400));

        btnVistaEstrenos.setBackground(new java.awt.Color(102, 0, 0));
        btnVistaEstrenos.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        btnVistaEstrenos.setForeground(new java.awt.Color(255, 255, 255));
        btnVistaEstrenos.setText("ESTRENOS");
        btnVistaEstrenos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVistaEstrenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaEstrenos(evt);
            }
        });

        btnVistaClasicos.setBackground(new java.awt.Color(102, 0, 0));
        btnVistaClasicos.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        btnVistaClasicos.setForeground(new java.awt.Color(255, 255, 255));
        btnVistaClasicos.setText("CLÁSICOS");
        btnVistaClasicos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVistaClasicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaClasicos(evt);
            }
        });

        btnVistaMenu.setBackground(new java.awt.Color(102, 0, 0));
        btnVistaMenu.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        btnVistaMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnVistaMenu.setText("MENÚ");
        btnVistaMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVistaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaMenu(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(102, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SALAS");

        javax.swing.GroupLayout sideBarLayout = new javax.swing.GroupLayout(sideBar);
        sideBar.setLayout(sideBarLayout);
        sideBarLayout.setHorizontalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVistaEstrenos, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
            .addComponent(btnVistaClasicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVistaMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );
        sideBarLayout.setVerticalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVistaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(jLabel4)
                .addGap(44, 44, 44)
                .addComponent(btnVistaEstrenos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVistaClasicos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVistaEstrenos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaEstrenos
        int res = JOptionPane.showConfirmDialog(null, "¿Desea ir a la vista de Estrenos?");
        
        if(res == 0){
            this.setVisible(false);
        
            PanelEstrenos m = new PanelEstrenos();
            m.setVisible(true);
        }
    }//GEN-LAST:event_btnVistaEstrenos

    private void btnVistaClasicos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaClasicos
        int res = JOptionPane.showConfirmDialog(null, "¿Desea ir a la vista de Clásicos?");
        
        if(res == 0){
            this.setVisible(false);
        
            PanelClasicos m = new PanelClasicos();
            m.setVisible(true);
        }
    }//GEN-LAST:event_btnVistaClasicos

    private void btnVistaMenu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaMenu
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVistaMenu

    private void btnIngresosTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresosTotalesActionPerformed
        // TODO add your handling code here:
        double ingresosEstrenos = estrenos.getIngresoSala();
        double ingresosClasicos = clasicos.getIngresoSala();

        double totalIngresos = ingresosEstrenos + ingresosClasicos;

        JOptionPane.showMessageDialog(null, "Los ingresos de ambas salas son de: $" + totalIngresos);
    }//GEN-LAST:event_btnIngresosTotalesActionPerformed

    private void btnFechaIngresosTotales(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechaIngresosTotales
        // TODO add your handling code here:
        dialogFecha.setVisible(true);
        
        if(dialogFecha.getBotonPulsado() == 1) {
            txtFieldFechaIngresosTotales.setText(dialogFecha.getFechaLarga());
        } else {
            txtFieldFechaIngresosTotales.setText(null);
        }
    }//GEN-LAST:event_btnFechaIngresosTotales

    /**
     * @param args the command line arguments
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVistaClasicos;
    private javax.swing.JButton btnVistaEstrenos;
    private javax.swing.JButton btnVistaMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel sideBar;
    private javax.swing.JTextField txtFieldFechaIngresosTotales;
    private javax.swing.JLabel txtFieldIngresosTotales;
    // End of variables declaration//GEN-END:variables
}
