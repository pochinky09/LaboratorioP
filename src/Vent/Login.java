/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vent;

/**
 *
 * @author admin
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jLabel2ImgLog = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1User = new javax.swing.JLabel();
        jLabel1Pass = new javax.swing.JLabel();
        jTextField1User = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2Entrar = new javax.swing.JButton();
        jButton2Regitrar = new javax.swing.JButton();
        jLabel1Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2ImgLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMg/l1.png"))); // NOI18N
        getContentPane().add(jLabel2ImgLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 0, 40, 30));

        jLabel1User.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1User.setText("Usuario");
        getContentPane().add(jLabel1User, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel1Pass.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1Pass.setText("Contraseña");
        getContentPane().add(jLabel1Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
        getContentPane().add(jTextField1User, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 160, 30));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, 30));

        jButton2Entrar.setBackground(new java.awt.Color(102, 204, 0));
        jButton2Entrar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton2Entrar.setText("Acceder");
        getContentPane().add(jButton2Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jButton2Regitrar.setBackground(new java.awt.Color(255, 153, 0));
        jButton2Regitrar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton2Regitrar.setText("Registrate");
        jButton2Regitrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2RegitrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2Regitrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 380, 120, -1));

        jLabel1Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMg/f1.jpg"))); // NOI18N
        getContentPane().add(jLabel1Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 214, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2RegitrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2RegitrarActionPerformed
        // TODO add your handling code here:
                
        Agregar_Usuario pro = new Agregar_Usuario();
        pro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2RegitrarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2Entrar;
    private javax.swing.JButton jButton2Regitrar;
    private javax.swing.JLabel jLabel1Fondo;
    private javax.swing.JLabel jLabel1Pass;
    private javax.swing.JLabel jLabel1User;
    private javax.swing.JLabel jLabel2ImgLog;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1User;
    // End of variables declaration//GEN-END:variables
}
