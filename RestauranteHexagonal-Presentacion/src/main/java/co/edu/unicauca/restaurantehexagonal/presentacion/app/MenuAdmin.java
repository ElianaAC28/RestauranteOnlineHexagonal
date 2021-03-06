/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.restaurantehexagonal.presentacion.app;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SoftwareTeam
 */
public class MenuAdmin extends javax.swing.JFrame {


    String restId = "1";

    /**
     * Creates new form Contactanos
     */
    public MenuAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Visitante");
    }
    
    public MenuAdmin(String restId){
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Visitante");
        this.restId = restId;
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
        lblElegirRest = new javax.swing.JLabel();
        btnAddComp = new javax.swing.JButton();
        btnUpdateAlm = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        imgLogo = new javax.swing.JLabel();
        btnMostrarComp = new javax.swing.JButton();
        btnAddAlm1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        lblElegirRest.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lblElegirRest.setForeground(new java.awt.Color(255, 255, 255));
        lblElegirRest.setText("BIENVENIDO");
        jPanel1.add(lblElegirRest);
        lblElegirRest.setBounds(270, 90, 200, 40);

        btnAddComp.setBackground(new java.awt.Color(255, 51, 43));
        btnAddComp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddComp.setForeground(new java.awt.Color(255, 255, 255));
        btnAddComp.setText("Agregar Componentes");
        btnAddComp.setBorder(null);
        btnAddComp.setBorderPainted(false);
        btnAddComp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAddComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCompActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddComp);
        btnAddComp.setBounds(100, 280, 210, 50);

        btnUpdateAlm.setBackground(new java.awt.Color(255, 51, 43));
        btnUpdateAlm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdateAlm.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateAlm.setText("Actualizar Almuerzo");
        btnUpdateAlm.setBorder(null);
        btnUpdateAlm.setBorderPainted(false);
        btnUpdateAlm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUpdateAlm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAlmActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdateAlm);
        btnUpdateAlm.setBounds(100, 220, 210, 50);

        btnCerrarSesion.setBackground(new java.awt.Color(255, 51, 43));
        btnCerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar Sesi??n");
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarSesion);
        btnCerrarSesion.setBounds(550, 60, 100, 40);

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo restaurante2 - Copy.png"))); // NOI18N
        jPanel1.add(imgLogo);
        imgLogo.setBounds(390, 140, 300, 220);

        btnMostrarComp.setBackground(new java.awt.Color(255, 51, 43));
        btnMostrarComp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMostrarComp.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarComp.setText("Mostrar Componentes");
        btnMostrarComp.setBorder(null);
        btnMostrarComp.setBorderPainted(false);
        btnMostrarComp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMostrarComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarCompActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrarComp);
        btnMostrarComp.setBounds(100, 340, 210, 50);

        btnAddAlm1.setBackground(new java.awt.Color(255, 51, 43));
        btnAddAlm1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddAlm1.setForeground(new java.awt.Color(255, 255, 255));
        btnAddAlm1.setText("Agregar Almuerzo");
        btnAddAlm1.setBorder(null);
        btnAddAlm1.setBorderPainted(false);
        btnAddAlm1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAddAlm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAlm1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddAlm1);
        btnAddAlm1.setBounds(100, 160, 210, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Base - copia.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 720, 480);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCompActionPerformed
        AdminCompo admiCom = new AdminCompo(restId);
        admiCom.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddCompActionPerformed

    private void btnUpdateAlmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAlmActionPerformed
        AdminActualizarAlmuerzo update = new AdminActualizarAlmuerzo(restId);
        update.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUpdateAlmActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        //resp =0 si, resp = 1 no.
        int resp = JOptionPane.showConfirmDialog(null, "??Est?? seguro que desea salir?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if (resp==0){
        IniciarSesion login = new IniciarSesion();
        login.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnMostrarCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCompActionPerformed
        Admin admiComDis = new Admin(restId);
        admiComDis.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMostrarCompActionPerformed

    private void btnAddAlm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAlm1ActionPerformed
        AdminAlmuerzo admin = null;
        try {
            admin = new AdminAlmuerzo(restId);
        } catch (Exception ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        admin.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnAddAlm1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAlm1;
    private javax.swing.JButton btnAddComp;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnMostrarComp;
    private javax.swing.JButton btnUpdateAlm;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblElegirRest;
    // End of variables declaration//GEN-END:variables

    private Admin Admin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private AdminAlmuerzo AdminAlmuerzo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
