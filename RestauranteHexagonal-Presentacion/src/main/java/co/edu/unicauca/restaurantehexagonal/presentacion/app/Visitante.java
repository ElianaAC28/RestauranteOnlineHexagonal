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
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IComponenteRepository;
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IRestauranteRepository;
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IAlmuerzoRepository;
import co.edu.unicauca.restaurantehexagonal.dominio.services.ComponenteService;
import co.edu.unicauca.restaurantehexagonal.dominio.services.RestauranteService;
import co.edu.unicauca.restaurantehexagonal.dominio.services.AlmuerzoService;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author SoftwareTeam
 */
public class Visitante extends javax.swing.JFrame {

    String restId = "";
    int almuerzo = 1;

    /**
     * Creates new form Usuario
     */
    public Visitante() {
        initComponents();//inicializa
         setLocationRelativeTo(null);

        try {
            llenarTabla();//llama al metodo que se encarga de llenar los cbx
        } catch (Exception ex) {
            Logger.getLogger(AdminActualizarAlmuerzo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Visitante(String restId) {
        this.restId = restId;
        initComponents();
        lblBienvenido.setText("Bienvenido a " + obtenerNombreRest());
        llenarAlmuerzos();
        setLocationRelativeTo(null);
        setTitle("Visitante");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSelectAlmuerzo = new javax.swing.JButton();
        cbxAlmuerzos = new javax.swing.JComboBox<>();
        lblFondoAlmuerzo = new javax.swing.JLabel();
        btnBackSelectAlmu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblBienvenido = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxEntrada = new javax.swing.JComboBox<>();
        cbxProteina = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxPrincipio = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbxBebida = new javax.swing.JComboBox<>();
        btnRealizarPedido = new javax.swing.JButton();
        lblDescripcion = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        imgRes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        cbxAlmuerzos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getContentPane().add(cbxAlmuerzos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 160, 30));

        lblFondoAlmuerzo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Base2.png"))); // NOI18N
        getContentPane().add(lblFondoAlmuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 610, 280));

        btnBackSelectAlmu.setBackground(new java.awt.Color(255, 51, 43));
        btnBackSelectAlmu.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnBackSelectAlmu.setForeground(new java.awt.Color(255, 255, 255));
        btnBackSelectAlmu.setText("Volver a Seleccionar Almuerzo");
        btnBackSelectAlmu.setBorder(null);
        btnBackSelectAlmu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSelectAlmuActionPerformed(evt);
            }
        });
        getContentPane().add(btnBackSelectAlmu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 190, 30));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Este es nuestro menu del día, pero recuerda que debes iniciar sesión");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 550, 30));

        lblBienvenido.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(255, 51, 43));
        lblBienvenido.setText("Bienvenido");
        getContentPane().add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 550, 60));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 43));
        jLabel7.setText("Entrada:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 60, 20));

        cbxEntrada.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        cbxEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 90, -1));

        cbxProteina.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        cbxProteina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProteinaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxProteina, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 90, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 43));
        jLabel8.setText("Proteina:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, 20));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 43));
        jLabel9.setText("Principio:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        cbxPrincipio.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        cbxPrincipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPrincipioActionPerformed(evt);
            }
        });
        getContentPane().add(cbxPrincipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 90, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 43));
        jLabel10.setText("Bebida:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 320, 50, -1));

        cbxBebida.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        cbxBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBebidaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 90, -1));

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

        lblDescripcion.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion.setText("Des");
        getContentPane().add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 560, 30));

        btnAtras.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("Atras");
        btnAtras.setBorder(null);
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 60, 30));

        btnIniciarSesion.setBackground(new java.awt.Color(255, 51, 43));
        btnIniciarSesion.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 90, 30));

        imgRes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/si.jpg"))); // NOI18N
        getContentPane().add(imgRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 220, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Base2.png"))); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 490));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo restaurante esquina.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 70, 50));

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
    //Envia un mensaje al cliente de que debe inicar sesion
    private void btnRealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPedidoActionPerformed

        JOptionPane.showMessageDialog(null, "Debe iniciar sesión para poder realizar el pedido", "Realizar pedido", JOptionPane.WARNING_MESSAGE);

    }//GEN-LAST:event_btnRealizarPedidoActionPerformed
    //Aqui se devuelve a la anterior ventana
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        GUIRestaurante vist = new GUIRestaurante(0);
        vist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed
    //Aqui envia a la ventana LogIn
    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        // TODO add your handling code here:
        IniciarSesion login = new IniciarSesion();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnSelectAlmuerzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectAlmuerzoActionPerformed
        String almu, almuerz;
        almuerz = cbxAlmuerzos.getItemAt(cbxAlmuerzos.getSelectedIndex());
        String[] parts = almuerz.split(" ");
        almu = parts[1];

        char idalmu = almuerz.charAt(almuerz.length()-1);
        almuerzo = Character.getNumericValue(idalmu);
        lblDescripcion.setText("Descripcion: " + descripcion());
        cbxAlmuerzos.setVisible(false);
        btnSelectAlmuerzo.setVisible(false);
        lblFondoAlmuerzo.setVisible(false);
        btnBackSelectAlmu.setVisible(true);

        try{
            llenarTabla();
        }catch (Exception ex) {
            Logger.getLogger(AdminActualizarAlmuerzo.class.getName()).log(Level.SEVERE, null, ex);
        }
        foto(almu);
    }//GEN-LAST:event_btnSelectAlmuerzoActionPerformed

    private void btnBackSelectAlmuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackSelectAlmuActionPerformed
        btnBackSelectAlmu.setVisible(false);
        cbxAlmuerzos.setVisible(true);
        btnSelectAlmuerzo.setVisible(true);
        lblFondoAlmuerzo.setVisible(true);
        cbxBebida.removeAllItems();
        cbxEntrada.removeAllItems();
        cbxPrincipio.removeAllItems();
        cbxProteina.removeAllItems();

    }//GEN-LAST:event_btnBackSelectAlmuActionPerformed

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
            java.util.logging.Logger.getLogger(Visitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Visitante().setVisible(true);
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
    
    private void foto(String almu) {
        try {
            IAlmuerzoRepository service = Factory.getInstance().getRepositoryAlmuerzo();
            AlmuerzoService objService = new AlmuerzoService(service);
            List<Almuerzo> response = new ArrayList<Almuerzo>();

            response = objService.foto(almu);

            byte[] bi = response.get(0).getFoto();
            BufferedImage image = null;
            InputStream in = new ByteArrayInputStream(bi);
            image = ImageIO.read(in);
            ImageIcon imgi = new ImageIcon(image.getScaledInstance(360, 170, 0));
            imgRes.setIcon(imgi);

        } catch (Exception ex) {
            imgRes.setText("No imagen");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBackSelectAlmu;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRealizarPedido;
    private javax.swing.JButton btnSelectAlmuerzo;
    private javax.swing.JComboBox<String> cbxAlmuerzos;
    private javax.swing.JComboBox<String> cbxBebida;
    private javax.swing.JComboBox<String> cbxEntrada;
    private javax.swing.JComboBox<String> cbxPrincipio;
    private javax.swing.JComboBox<String> cbxProteina;
    private javax.swing.JLabel imgRes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFondoAlmuerzo;
    // End of variables declaration//GEN-END:variables

}
