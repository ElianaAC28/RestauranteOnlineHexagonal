/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.restaurantehexagonal.presentacion.app;


import co.edu.unicauca.restaurantehexagonal.access.Factory;
import co.edu.unicauca.restaurantehexagonal.dominio.entities.Almuerzo;
import co.edu.unicauca.restaurantehexagonal.dominio.entities.Componente;
import co.edu.unicauca.restaurantehexagonal.dominio.entities.Restaurante;
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IAlmuerzoRepository;
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IComponenteRepository;
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IRestauranteRepository;
import co.edu.unicauca.restaurantehexagonal.dominio.services.AlmuerzoService;
import co.edu.unicauca.restaurantehexagonal.dominio.services.ComponenteService;
import co.edu.unicauca.restaurantehexagonal.dominio.services.RestauranteService;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author SoftwareTeam
 */
public class Usuario extends javax.swing.JFrame {

    String restId = "";
    int almuerzo = 1;

    /**
     * Creates new form Usuario
     */
    public Usuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            llenarTabla();//llama al metodo que se encarga de llenar los cbx
        } catch (Exception ex) {
            Logger.getLogger(AdminActualizarAlmuerzo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario(String restId) {
        this.restId = restId;
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Usuario");
        jLabel3.setText("Bienvenido a " + obtenerNombreRest());
        llenarAlmuerzos();
         try {
            llenarTabla();
        } catch (Exception ex) {
            Logger.getLogger(AdminActualizarAlmuerzo.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        cbxAlmuerzos = new javax.swing.JComboBox<>();
        btnSelectAlmuerzo = new javax.swing.JButton();
        lblFondoAlmuerzo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxEntrada = new javax.swing.JComboBox<>();
        cbxProteina = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxPrincipio = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbxBebida = new javax.swing.JComboBox<>();
        btnRealizarPedido = new javax.swing.JButton();
        lbldescripcion = new javax.swing.JLabel();
        btnRestaurantes = new javax.swing.JButton();
        btnContacto = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        cbxAlmuerzos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getContentPane().add(cbxAlmuerzos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 160, 30));

        btnSelectAlmuerzo.setBackground(new java.awt.Color(255, 51, 43));
        btnSelectAlmuerzo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnSelectAlmuerzo.setForeground(new java.awt.Color(255, 255, 255));
        btnSelectAlmuerzo.setText("Seleccionar Almuerzo");
        btnSelectAlmuerzo.setBorder(null);
        btnSelectAlmuerzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectAlmuerzoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelectAlmuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 160, 40));

        lblFondoAlmuerzo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Base2.png"))); // NOI18N
        getContentPane().add(lblFondoAlmuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 610, 250));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Seleccione lo que desee para su pedido");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 550, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo restaurante esquina.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 70, 50));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 43));
        jLabel3.setText("Bienvenido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 550, 70));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 280, 30));

        lblImagen.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblImagen.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 140, 110));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Entrada:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        cbxEntrada.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbxEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 90, -1));

        cbxProteina.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbxProteina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProteinaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxProteina, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 90, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Proteina:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Principio:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        cbxPrincipio.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbxPrincipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPrincipioActionPerformed(evt);
            }
        });
        getContentPane().add(cbxPrincipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 90, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bebida:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        cbxBebida.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbxBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBebidaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 90, -1));

        btnRealizarPedido.setBackground(new java.awt.Color(255, 51, 43));
        btnRealizarPedido.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnRealizarPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizarPedido.setText("Realizar Pedido");
        btnRealizarPedido.setBorder(null);
        btnRealizarPedido.setBorderPainted(false);
        btnRealizarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRealizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRealizarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 110, 30));

        lbldescripcion.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbldescripcion.setForeground(new java.awt.Color(255, 255, 255));
        lbldescripcion.setText("des");
        getContentPane().add(lbldescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 560, 30));

        btnRestaurantes.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        btnRestaurantes.setForeground(new java.awt.Color(255, 255, 255));
        btnRestaurantes.setText("Restaurantes");
        btnRestaurantes.setBorder(null);
        btnRestaurantes.setBorderPainted(false);
        btnRestaurantes.setContentAreaFilled(false);
        btnRestaurantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurantesActionPerformed(evt);
            }
        });
        getContentPane().add(btnRestaurantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, 30));

        btnContacto.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        btnContacto.setForeground(new java.awt.Color(255, 255, 255));
        btnContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cc.png"))); // NOI18N
        btnContacto.setText("Contactanos");
        btnContacto.setBorder(null);
        btnContacto.setBorderPainted(false);
        btnContacto.setContentAreaFilled(false);
        btnContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactoActionPerformed(evt);
            }
        });
        getContentPane().add(btnContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, 30));

        btnCerrarSesion.setBackground(new java.awt.Color(255, 51, 43));
        btnCerrarSesion.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 100, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/si.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 220, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Base2.png"))); // NOI18N
        jLabel1.setText("\n");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEntradaActionPerformed

    private void cbxProteinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProteinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxProteinaActionPerformed

    private void cbxPrincipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPrincipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxPrincipioActionPerformed

    private void cbxBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBebidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxBebidaActionPerformed
    //Realiza el pedido con exito
    private void btnRealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPedidoActionPerformed
        JOptionPane.showMessageDialog(null, "Su pedido se ha realizado con éxito");
    }//GEN-LAST:event_btnRealizarPedidoActionPerformed
    //Envia a la ventana donse se ouede contactar con nosotros
    private void btnRestaurantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurantesActionPerformed
        GUIRestaurante cont = new GUIRestaurante(1);
        cont.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRestaurantesActionPerformed
    //Vuelve a LogIn
    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        //resp =0 si, resp = 1 no.
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if (resp==0){
        IniciarSesion log = new IniciarSesion();
        log.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactoActionPerformed
        Contacto cont = new Contacto(7);
        cont.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnContactoActionPerformed

    private void btnSelectAlmuerzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectAlmuerzoActionPerformed
        String almuerz = cbxAlmuerzos.getItemAt(cbxAlmuerzos.getSelectedIndex());
        char idalmu = almuerz.charAt(almuerz.length()-1);
        almuerzo = Character.getNumericValue(idalmu);
        lbldescripcion.setText("Descripcion: " + descripcion());
        cbxAlmuerzos.setVisible(false);
        btnSelectAlmuerzo.setVisible(false);
        lblFondoAlmuerzo.setVisible(false);
    }//GEN-LAST:event_btnSelectAlmuerzoActionPerformed

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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }
    //Aqui es donde se realiza todo el proceso de llenado de los cbx
    private void llenarTabla() throws Exception {
        IComponenteRepository service = Factory.getInstance().getRepositoryComponente();
        ComponenteService componenteService = new ComponenteService(service);

        List<Componente> objListComponentes = new ArrayList<Componente>();
        objListComponentes = componenteService.listComponentesAlmuerzo(almuerzo);

        String matriz[][] = new String[objListComponentes.size()][3];

        for (int i = 0; i < objListComponentes.size(); i++) {
            matriz[i][0] = objListComponentes.get(i).getNombreComponente();
            matriz[i][1] = objListComponentes.get(i).getTipoComponente();
            if ("Entrada".equals(objListComponentes.get(i).getTipoComponente())) {
                cbxEntrada.addItem(objListComponentes.get(i).getNombreComponente());
            }
            if ("Principio".equals(objListComponentes.get(i).getTipoComponente())) {
                cbxPrincipio.addItem(objListComponentes.get(i).getNombreComponente());
            }
            if ("Proteina".equals(objListComponentes.get(i).getTipoComponente())) {
                cbxProteina.addItem(objListComponentes.get(i).getNombreComponente());
            }
            if ("Bebida".equals(objListComponentes.get(i).getTipoComponente())) {
                cbxBebida.addItem(objListComponentes.get(i).getNombreComponente());
            }
        }

    }
    
    private void llenarAlmuerzos() {
        IAlmuerzoRepository service = Factory.getInstance().getRepositoryAlmuerzo();
        AlmuerzoService almuerzoService = new AlmuerzoService(service);
        
        List<Almuerzo> objListAlmuerzos = new ArrayList<Almuerzo>();
        objListAlmuerzos = almuerzoService.listAlmuerzosRestaurante(restId);
        
        for(Almuerzo almu : objListAlmuerzos){
            cbxAlmuerzos.addItem("Almuerzo " + almu.getIdAlmuerzo());
        }
        
        cbxAlmuerzos.setSelectedIndex(0);
    }
    
    private String obtenerNombreRest() {
        String nombre = "";
        IRestauranteRepository service = Factory.getInstance().getRepositoryRestaurante();
        RestauranteService restauranteService = new RestauranteService(service);
        
        Restaurante rest = new Restaurante();
        try {
            rest = restauranteService.findRestaurante(restId);
        } catch (Exception ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        nombre = rest.getNombreRestaurante();
        return nombre;
    }
    
    private String descripcion() 
    {
        String nombre = "";
        IAlmuerzoRepository service = Factory.getInstance().getRepositoryAlmuerzo();
        AlmuerzoService almuerzoService = new AlmuerzoService(service);
        
        Almuerzo almu = new Almuerzo();
        try {
            almu = almuerzoService.buscar(restId);
        } catch (Exception ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        nombre = almu.getDescripcion();
        return nombre;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnContacto;
    private javax.swing.JButton btnRealizarPedido;
    private javax.swing.JButton btnRestaurantes;
    private javax.swing.JButton btnSelectAlmuerzo;
    private javax.swing.JComboBox<String> cbxAlmuerzos;
    private javax.swing.JComboBox<String> cbxBebida;
    private javax.swing.JComboBox<String> cbxEntrada;
    private javax.swing.JComboBox<String> cbxPrincipio;
    private javax.swing.JComboBox<String> cbxProteina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFondoAlmuerzo;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lbldescripcion;
    // End of variables declaration//GEN-END:variables

}
