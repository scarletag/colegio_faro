/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.inicio;

import views.estudiantes.login_users;

/**
 *
 * @author Luis
 */
public class login_sesion extends javax.swing.JFrame {

    /**
     * Creates new form login_sesion
     */
    public login_sesion() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        login_estudiantes = new javax.swing.JButton();
        login_catedraticos = new javax.swing.JButton();
        login_direccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_estudiantes.setText("Estudiantes");
        login_estudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_estudiantesActionPerformed(evt);
            }
        });
        jPanel1.add(login_estudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 141, 76));

        login_catedraticos.setText("Catedraticos");
        jPanel1.add(login_catedraticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 135, 76));

        login_direccion.setText("Direccion");
        jPanel1.add(login_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 133, 76));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_estudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_estudiantesActionPerformed
        login_users alumnos = new login_users();
        alumnos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_login_estudiantesActionPerformed

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
            java.util.logging.Logger.getLogger(login_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_catedraticos;
    private javax.swing.JButton login_direccion;
    private javax.swing.JButton login_estudiantes;
    // End of variables declaration//GEN-END:variables
}
