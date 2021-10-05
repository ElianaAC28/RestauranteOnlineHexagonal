/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.restaurantehexagonal.presentacion.app;


import co.edu.unicauca.restaurantehexagonal.access.Factory;
import co.edu.unicauca.restaurantehexagonal.dominio.entities.Almuerzo;
import co.edu.unicauca.restaurantehexagonal.dominio.entities.Componente;
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IAlmuerzoRepository;
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IComponenteRepository;
import co.edu.unicauca.restaurantehexagonal.dominio.services.AlmuerzoService;
import co.edu.unicauca.restaurantehexagonal.dominio.services.ComponenteService;
import static co.edu.unicauca.restaurantehexagonal.dominio.services.Messages.successMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SoftwareTeam
 */
public class AdminAlmuerzo extends javax.swing.JFrame {

    /**
     * Creates new form AdminComponentes
     */
    List<Componente> objListComponentes = new ArrayList<Componente>();
    String tipoid;
    
    String restId = "1";

    public AdminAlmuerzo() throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Administrador Almuerzo");
        setLocationRelativeTo(null); //centrar la ventana

        mostrar();

    }
    
    public AdminAlmuerzo(String restId) throws Exception {
        this.restId = restId;
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Administrador Almuerzo");
        setLocationRelativeTo(null); //centrar la ventana

        mostrar();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaComp = new javax.swing.JTable();
        lblAddAlmuerzo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCrearAlmu = new javax.swing.JButton();
        btnAddComp = new javax.swing.JButton();
        txtAlmu = new javax.swing.JTextField();
        lblImagen = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        imgContacto1 = new javax.swing.JLabel();
        btnContacto = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        btnAddAlmu = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnMostrarComp = new javax.swing.JButton();
        btnContacto1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setLayout(null);

        tblListaComp.setAutoCreateRowSorter(true);
        tblListaComp.setFont(new java.awt.Font("Calibri Light", 2, 14)); // NOI18N
        tblListaComp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListaComp);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(90, 180, 550, 170);

        lblAddAlmuerzo.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lblAddAlmuerzo.setForeground(new java.awt.Color(255, 51, 43));
        lblAddAlmuerzo.setText("Agregar almuerzo");
        jPanel1.add(lblAddAlmuerzo);
        lblAddAlmuerzo.setBounds(70, 40, 300, 50);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 51));
        jLabel4.setText("Id:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(-30, 0, 16, 17);

        btnCrearAlmu.setBackground(new java.awt.Color(255, 51, 43));
        btnCrearAlmu.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnCrearAlmu.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearAlmu.setText("Crear");
        btnCrearAlmu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearAlmuActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearAlmu);
        btnCrearAlmu.setBounds(310, 100, 70, 30);

        btnAddComp.setBackground(new java.awt.Color(255, 51, 43));
        btnAddComp.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnAddComp.setForeground(new java.awt.Color(255, 255, 255));
        btnAddComp.setText("Agregar componentes");
        btnAddComp.setActionCommand("");
        btnAddComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCompActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddComp);
        btnAddComp.setBounds(430, 100, 200, 30);
        jPanel1.add(txtAlmu);
        txtAlmu.setBounds(170, 100, 130, 30);

        lblImagen.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(lblImagen);
        lblImagen.setBounds(390, 180, 240, 140);

        lblCosto.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblCosto.setForeground(new java.awt.Color(255, 255, 255));
        lblCosto.setText("Costo:");
        jPanel1.add(lblCosto);
        lblCosto.setBounds(190, 380, 50, 20);

        imgContacto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cc.png"))); // NOI18N
        jPanel1.add(imgContacto1);
        imgContacto1.setBounds(430, 50, 40, 30);

        btnContacto.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        btnContacto.setForeground(new java.awt.Color(255, 255, 255));
        btnContacto.setText("Contactanos");
        btnContacto.setBorder(null);
        btnContacto.setBorderPainted(false);
        btnContacto.setContentAreaFilled(false);
        btnContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactoActionPerformed(evt);
            }
        });
        jPanel1.add(btnContacto);
        btnContacto.setBounds(470, 60, 82, 17);

        btnSalir.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);
        btnSalir.setBounds(610, 60, 29, 17);

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Seleccione los componentes para crear el almuerzo");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(90, 150, 460, 20);
        jPanel1.add(txtCosto);
        txtCosto.setBounds(230, 370, 120, 30);

        btnAddAlmu.setBackground(new java.awt.Color(255, 51, 43));
        btnAddAlmu.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnAddAlmu.setForeground(new java.awt.Color(255, 255, 255));
        btnAddAlmu.setText("Agregar almuerzo");
        btnAddAlmu.setActionCommand("");
        btnAddAlmu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAlmuActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddAlmu);
        btnAddAlmu.setBounds(400, 370, 140, 30);

        btnUpdate.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 51, 43));
        btnUpdate.setText("Actualizar almuerzo");
        btnUpdate.setBorder(null);
        btnUpdate.setBorderPainted(false);
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate);
        btnUpdate.setBounds(360, 420, 190, 23);

        btnMostrarComp.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnMostrarComp.setForeground(new java.awt.Color(255, 51, 43));
        btnMostrarComp.setText("Mostrar Componentes");
        btnMostrarComp.setBorder(null);
        btnMostrarComp.setBorderPainted(false);
        btnMostrarComp.setContentAreaFilled(false);
        btnMostrarComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarCompActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrarComp);
        btnMostrarComp.setBounds(170, 420, 180, 23);

        btnContacto1.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        btnContacto1.setForeground(new java.awt.Color(255, 255, 255));
        btnContacto1.setText("Ayuda");
        btnContacto1.setBorder(null);
        btnContacto1.setBorderPainted(false);
        btnContacto1.setContentAreaFilled(false);
        btnContacto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContacto1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnContacto1);
        btnContacto1.setBounds(560, 60, 40, 17);

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Id Almuerzo:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(80, 100, 90, 20);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 43));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Base - copia.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 720, 480);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCompActionPerformed

        //Sacamos el ide de la tabla con los componentes
        DefaultTableModel tabla1 = (DefaultTableModel) tblListaComp.getModel();

        String id_Comp = String.valueOf(tabla1.getValueAt(tblListaComp.getSelectedRow(), 0));
        String nombreCom = String.valueOf(tabla1.getValueAt(tblListaComp.getSelectedRow(), 2));
        String idTipo = convert(nombreCom);

        IAlmuerzoRepository service = Factory.getInstance().getRepositoryAlmuerzo();
        AlmuerzoService objService = new AlmuerzoService(service);

        IComponenteRepository serviceCom = Factory.getInstance().getRepositoryComponente();
        ComponenteService objServiceCom = new ComponenteService(serviceCom);

        Almuerzo objAlmu = new Almuerzo();

        objAlmu.setIdAlmuerzo(txtAlmu.getText());
        objAlmu.setRestId(1 + "");
        int ban = 0;

        try {
            // Así mismo como el anterior vamos a contar cuantos tiposs de componentes hay en un almuerzo determinado. 
            String response = objServiceCom.contarComponente(Integer.parseInt(txtAlmu.getText()), Integer.parseInt(idTipo));

            int valor = Integer.parseInt(response); //convertimos a entero la respuesta de contarComponente
            if (valor <= 4) {
                ban = 1; //bandera para saber que hay menos de 4 componentes del mismo tipo
            }
        } catch (Exception ex) {
            System.out.println(ex);
            successMessage(ex.getMessage() + "Error", "Atención");
        }

        if (ban == 1) { // comparamos la bandera para saber la cantidad de componentes que tiene el almuerzo del mismo tipo
            try {
                String response = objService.asociarComp(txtAlmu.getText(), id_Comp); // enviamos al objService el metodo de asocie el componente al almuerzo
                successMessage("Componente del Almuerzo " + response + " fue asociado con exito.", "Atención");

            } catch (Exception ex) {
                System.out.println(ex);
                successMessage(ex.getMessage() + "Error", "Atención");
            }
        } else {
            successMessage("El almuerzo se encuentra con 5 componentes del tipo " + nombreCom, "Atención");

        }

    }//GEN-LAST:event_btnAddCompActionPerformed

    private void btnContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactoActionPerformed
        // TODO add your handling code here:
        Contacto cont = new Contacto(3, restId);
        cont.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnContactoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
     //resp =0 si, resp = 1 no.
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            MenuAdmin menu = new MenuAdmin(restId);
            menu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed
    
    private void btnCrearAlmuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearAlmuActionPerformed
        // TODO add your handling code here:

        IAlmuerzoRepository service = Factory.getInstance().getRepositoryAlmuerzo();
        AlmuerzoService objService = new AlmuerzoService(service);
        Almuerzo objAlmu = new Almuerzo();
        objAlmu.setIdAlmuerzo(txtAlmu.getText());
        objAlmu.setRestId(1 + ""); //de forma predeterminada lo guardamos en el restaurante 1
        objAlmu.setCostoAlm(0 + ""); //fabrica hasta que le enviemos el precio

        try {
            String cont = objService.contarAlmu(objAlmu);
            if (Integer.parseInt(cont) == 0) {
                String response = objService.createAlmuerzo(objAlmu);
                llenarTabla();
                successMessage("Almuerzo" + response + " Creado con exito.", "Atención");
                txtAlmu.setEditable(false);
                btnCrearAlmu.setVisible(false);
            } else {
                successMessage("Almuerzo no fue creado, ya exite un almuerzo con ese ID", "Error");
                clearCotronls();
            }

        } catch (Exception ex) {
            System.out.println(ex);
            successMessage(ex.getMessage() + "Error", "Atención");
        }
    }//GEN-LAST:event_btnCrearAlmuActionPerformed

    private void btnAddAlmuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAlmuActionPerformed
        // TODO add your handling code here:
        IAlmuerzoRepository service = Factory.getInstance().getRepositoryAlmuerzo();
        AlmuerzoService objService = new AlmuerzoService(service);
        Almuerzo objAlmu = new Almuerzo();
        objAlmu.setIdAlmuerzo(txtAlmu.getText());
        objAlmu.setRestId(1 + ""); //de forma predeterminada lo guardamos en el restaurante 1
        objAlmu.setCostoAlm(txtCosto.getText()); //fabrica hasta que le enviemos el precio

        try {
            String response = objService.updateCosto(objAlmu);
            successMessage("Almuerzo" + response + " Creado con exito.", "Atención");
            clearcontroles();
            txtAlmu.setEditable(true);

        } catch (Exception ex) {
            System.out.println(ex);
            successMessage(ex.getMessage() + "Error", "Atención");
        }
    }//GEN-LAST:event_btnAddAlmuActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        AdminActualizarAlmuerzo update = new AdminActualizarAlmuerzo(restId);
        update.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnMostrarCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCompActionPerformed
        Admin admin = new Admin(restId);
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMostrarCompActionPerformed

    private void btnContacto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContacto1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnContacto1ActionPerformed

    private void clearCotronls() {
        txtAlmu.setText("");
    }

    private void clearcontroles() {
        txtAlmu.setText("");
        txtCosto.setText("");
        btnCrearAlmu.setVisible(true);
        //Sacamos el ide de la tabla con los componentes
        DefaultTableModel tabla1 = (DefaultTableModel) tblListaComp.getModel();
        tabla1.setRowCount(0);
    }

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
            java.util.logging.Logger.getLogger(AdminAlmuerzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAlmuerzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAlmuerzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAlmuerzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                try {
                    new AdminAlmuerzo().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(AdminAlmuerzo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void mostrar() throws Exception {
        /*IComponenteRepository service = IFactory.getInstance().getRepositoryComponente();
        ComponenteService componenteService = new ComponenteService(service);

        Componente objComponente = new Componente();

        objListComponentes = componenteService.listComponentes();

        for (int i = 0; i < objListComponentes.size(); i++) {

            if ("Entrada".equals(objListComponentes.get(i).getTipoComponente())) {
                String componenteMenu = objListComponentes.get(i).getNombreComponente();
                cbxEntrada.addItem(componenteMenu);

            }
            if ("Principio".equals(objListComponentes.get(i).getTipoComponente())) {
                String componenteMenu = objListComponentes.get(i).getNombreComponente();
                cbxPrincipio.addItem(componenteMenu);
            }
            if ("Proteina".equals(objListComponentes.get(i).getTipoComponente()) || "Proteína".equals(objListComponentes.get(i).getTipoComponente())) {
                String componenteMenu = objListComponentes.get(i).getNombreComponente();
                cbxProteina.addItem(componenteMenu);
            }
            if ("Bebida".equals(objListComponentes.get(i).getTipoComponente())) {
                String componenteMenu = objListComponentes.get(i).getNombreComponente();
                cbxBebida.addItem(componenteMenu);
            }

        }*/
    }

    private void llenarTabla() throws Exception {
        IComponenteRepository service = Factory.getInstance().getRepositoryComponente();
        ComponenteService componenteService = new ComponenteService(service);

        //Componente objComponente = new Componente();
        List<Componente> objListComponentes = new ArrayList<Componente>();

        objListComponentes = componenteService.listComponentes();

        String matriz[][] = new String[objListComponentes.size()][3];

        for (int i = 0; i < objListComponentes.size(); i++) {
            matriz[i][0] = objListComponentes.get(i).getIdComponente() + "";
            matriz[i][1] = objListComponentes.get(i).getNombreComponente();
            matriz[i][2] = objListComponentes.get(i).getTipoComponente();
        }

        tblListaComp.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "ID", "Nombre", "Tipo"
                }
        ));
    }

    private String convert(String nombre) {
        if (nombre.equals("Entrada")) {
            return 1 + "";
        }
        if (nombre.equals("Principio")) {
            return 2 + "";
        }
        if (nombre.equals("Proteina")) {
            return 3 + "";
        }
        return 4 + "";
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAlmu;
    private javax.swing.JButton btnAddComp;
    private javax.swing.JButton btnContacto;
    private javax.swing.JButton btnContacto1;
    private javax.swing.JButton btnCrearAlmu;
    private javax.swing.JButton btnMostrarComp;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel imgContacto1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddAlmuerzo;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTable tblListaComp;
    private javax.swing.JTextField txtAlmu;
    private javax.swing.JTextField txtCosto;
    // End of variables declaration//GEN-END:variables

}
