/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

/**
 *
 * @author geoal
 */
public class TemasMetodo extends javax.swing.JFrame {

    /**
     * Creates new form TemasMetodo
     */
    public TemasMetodo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonSalir = new javax.swing.JButton();
        ButtonTema1 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonSalir.setBackground(new java.awt.Color(255, 255, 255));
        ButtonSalir.setForeground(new java.awt.Color(51, 51, 255));
        ButtonSalir.setText("Salir");
        ButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        ButtonTema1.setText("Tema 1");
        ButtonTema1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonTema1MouseClicked(evt);
            }
        });
        ButtonTema1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTema1ActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonTema1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/verd.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 386, 646));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalirActionPerformed
        System.exit(0);

    // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSalirActionPerformed

    private void ButtonTema1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonTema1MouseClicked
     Interfaz interfaz = new Interfaz();
     interfaz.setVisible(true);
     this.dispose();
        
// TODO add your handling code here:
    }//GEN-LAST:event_ButtonTema1MouseClicked

    private void ButtonTema1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTema1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonTema1ActionPerformed

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
            java.util.logging.Logger.getLogger(TemasMetodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemasMetodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemasMetodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemasMetodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemasMetodo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSalir;
    private javax.swing.JButton ButtonTema1;
    private javax.swing.JLabel Fondo;
    // End of variables declaration//GEN-END:variables
}
