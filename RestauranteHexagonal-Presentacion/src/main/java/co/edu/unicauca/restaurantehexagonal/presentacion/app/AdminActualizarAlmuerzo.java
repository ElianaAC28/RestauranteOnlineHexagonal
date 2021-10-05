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
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author softwareTeam
 */
public class AdminActualizarAlmuerzo extends javax.swing.JFrame {
    
    
    String restId = "1";
    /**
     * Creates new form AdminComponentes
     */public AdminActualizarAlmuerzo(){
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Actualizar Almuerzo");
            
        }
     
    public AdminActualizarAlmuerzo(String restId){
        this.restId = restId;
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Actualizar Almuerzo");
            
    }     
     
    String dato = "";
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnQuitar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaComp = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtruta = new javax.swing.JTextField();
        btnFoto = new javax.swing.JButton();
        txtAlmu = new javax.swing.JTextField();
        lblIdAlmu = new javax.swing.JLabel();
        imgUpdate = new javax.swing.JLabel();
        btnContacto = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        imgContacto1 = new javax.swing.JLabel();
        imgEliminar = new javax.swing.JLabel();
        lblIdAlmu1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        btnQuitar.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnQuitar.setForeground(new java.awt.Color(255, 51, 43));
        btnQuitar.setText("Eliminar componente");
        btnQuitar.setBorder(null);
        btnQuitar.setBorderPainted(false);
        btnQuitar.setContentAreaFilled(false);
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuitar);
        btnQuitar.setBounds(270, 410, 200, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo restaurante esquina.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 70, 90, 60);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 43));
        jLabel5.setText("Actualizar almuerzo");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(160, 80, 320, 50);

        btnBuscar.setBackground(new java.awt.Color(255, 51, 43));
        btnBuscar.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar);
        btnBuscar.setBounds(360, 130, 80, 30);

        btnActualizar.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 51, 43));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(null);
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar);
        btnActualizar.setBounds(510, 410, 70, 20);

        btnMostrar.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("Atras");
        btnMostrar.setBorder(null);
        btnMostrar.setBorderPainted(false);
        btnMostrar.setContentAreaFilled(false);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar);
        btnMostrar.setBounds(80, 410, 90, 23);

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
        jScrollPane1.setBounds(120, 190, 510, 170);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 51));
        jLabel4.setText("Id:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(-30, 0, 16, 18);

        txtruta.setEditable(false);
        jPanel1.add(txtruta);
        txtruta.setBounds(470, 370, 160, 24);

        btnFoto.setBackground(new java.awt.Color(255, 51, 43));
        btnFoto.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnFoto.setForeground(new java.awt.Color(255, 255, 255));
        btnFoto.setText("Foto");
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });
        jPanel1.add(btnFoto);
        btnFoto.setBounds(200, 400, 70, 30);
        jPanel1.add(txtAlmu);
        txtAlmu.setBounds(220, 130, 130, 30);

        lblIdAlmu.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblIdAlmu.setForeground(new java.awt.Color(255, 255, 255));
        lblIdAlmu.setText("Seleccione los componentes del almuerzo que desea actualizar o eliminar");
        jPanel1.add(lblIdAlmu);
        lblIdAlmu.setBounds(120, 170, 450, 20);

        imgUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/update.png"))); // NOI18N
        jPanel1.add(imgUpdate);
        imgUpdate.setBounds(590, 400, 30, 30);

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
        btnContacto.setBounds(510, 80, 71, 18);

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
        btnSalir.setBounds(600, 80, 24, 18);

        imgContacto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cc.png"))); // NOI18N
        jPanel1.add(imgContacto1);
        imgContacto1.setBounds(470, 60, 48, 48);

        imgEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar2.png"))); // NOI18N
        jPanel1.add(imgEliminar);
        imgEliminar.setBounds(470, 400, 20, 30);

        lblIdAlmu1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblIdAlmu1.setForeground(new java.awt.Color(255, 255, 255));
        lblIdAlmu1.setText("Id Almuerzo:");
        jPanel1.add(lblIdAlmu1);
        lblIdAlmu1.setBounds(130, 140, 90, 20);

        lblFondo.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Base2.png"))); // NOI18N
        jPanel1.add(lblFondo);
        lblFondo.setBounds(0, -10, 720, 510);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
                
        DefaultTableModel tabla1 = (DefaultTableModel) tblListaComp.getModel();
        dato=String.valueOf(tabla1.getValueAt(tblListaComp.getSelectedRow(),0));
        
        
        //Utilizamos el constructor para enviar datos al otro jframe
        AdminCompoDispo adcom = new AdminCompoDispo(dato,txtAlmu.getText(), restId);        
        
        adcom.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnActualizarActionPerformed
    
    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        Admin admin = new Admin(restId);
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        try {
            llenarTabla(); //Metodo para llenar la tabla con los componentes del almuerzo buscado
        } catch (Exception ex) {
            Logger.getLogger(AdminActualizarAlmuerzo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        // TODO add your handling code here:
        int input = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el componente?", "Alerta!", JOptionPane.YES_NO_OPTION);
        // 0=yes, 1=no, 
        System.out.println(input);
        if (input==0){
            
        
        DefaultTableModel tabla1 = (DefaultTableModel) tblListaComp.getModel(); // crea la tabla 1, y se le asiigna el modelo
        dato = String.valueOf(tabla1.getValueAt(tblListaComp.getSelectedRow(),0)); // sacar el id del compoente que se selecciona en la tabla1   
        String nombre = String.valueOf(tabla1.getValueAt(tblListaComp.getSelectedRow(),1)); // Saca el nombre de componente que se selecciona en la tabla 1 y se asigna a la variable nombre

        String id_Almu = txtAlmu.getText(); // Guarda el id del almuerzo que se escribe en el txt y se guarda en id_almu
        
        //Generar la instancia del repositoro de la factoria para ser guardada en serivicio.
        IAlmuerzoRepository service = Factory.getInstance().getRepositoryAlmuerzo(); 
        
        // Creamos el almuerzoService y le amndamos el servicio creado anteriormente
        AlmuerzoService objService= new AlmuerzoService(service);
        
        // creamos el objeto objAlmu de la clase Almuerzo
        Almuerzo objAlmu = new Almuerzo();
        
        //Al objAlmu creado que hereda los atributos de la clase almuero y le enviamos el id del almuerzo para que sea gutado en IdAlmuero de objAlmu
        objAlmu.setIdAlmuerzo(id_Almu);
        objAlmu.setRestId(dato); //mandamos el id del componente a eliminar, reutilizando la variable restId
          
        try {
            String response = objService.deleteCompAlmuerzo(objAlmu);
            successMessage("Componente " + nombre + " Fue eliminado del almuerzo "+response+" con exito.", "Atención");
            tabla1.setRowCount(0); //reset de la tabla
            txtAlmu.setText(""); //limpiamos el txt
        } catch (Exception ex) {
                System.out.println(ex);
                successMessage(ex.getMessage() + "Error", "Atención");
            }
        }
        
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactoActionPerformed
        // TODO add your handling code here:
        Contacto cont = new Contacto(2, restId);
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

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
        DefaultTableModel tabla1 = (DefaultTableModel) tblListaComp.getModel();
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
        j.setFileFilter(fil);

        int s = j.showOpenDialog(this);
        if(s == JFileChooser.APPROVE_OPTION){
            String ruta = j.getSelectedFile().getAbsolutePath();
            txtruta.setText(ruta);
        } //PARTE ACTUALIZAR FOTO
        IAlmuerzoRepository service = Factory.getInstance().getRepositoryAlmuerzo();
        AlmuerzoService objService = new AlmuerzoService(service);
        Almuerzo objAlmu = new Almuerzo();
        objAlmu.setIdAlmuerzo(txtAlmu.getText());
        objAlmu.setRestId(1 + ""); //de forma predeterminada lo guardamos en el restaurante 1
        File ruta = new File(txtruta.getText());
        try {
            byte[] icono = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(icono);
            objAlmu.setFoto(icono);
            String response = objService.updateFoto(objAlmu);
            JOptionPane.showMessageDialog(null, "La Foto del Almuerzo fue Actualizada con exito", "Confrimacion", JOptionPane.INFORMATION_MESSAGE);
            //clearcontroles();
            txtAlmu.setEditable(true);
            txtAlmu.setText(""); //limpiamos el txt 
            txtruta.setText("");
            
        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, ex.getMessage() +"Falla en el sistema", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        tabla1.setRowCount(0);
    }//GEN-LAST:event_btnFotoActionPerformed

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
            java.util.logging.Logger.getLogger(AdminActualizarAlmuerzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminActualizarAlmuerzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminActualizarAlmuerzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminActualizarAlmuerzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                    new AdminActualizarAlmuerzo().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(AdminActualizarAlmuerzo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
        });
    }
    private void llenarTabla() throws Exception {
        IComponenteRepository service = Factory.getInstance().getRepositoryComponente();
        ComponenteService componenteService= new ComponenteService(service);

        //Componente objComponente = new Componente();
        List<Componente> objListComponentes = new ArrayList<Componente>();
        int almuerzo = Integer.parseInt(txtAlmu.getText());
        objListComponentes = componenteService.listComponentesAlmuerzo(almuerzo);

        String matriz[][] = new String[objListComponentes.size()][3];

        for (int i = 0; i < objListComponentes.size(); i++) {
            matriz[i][0] = objListComponentes.get(i).getIdComponente()+"";
            matriz[i][1] = objListComponentes.get(i).getNombreComponente();
            matriz[i][2] = objListComponentes.get(i).getTipoComponente();
        }

        tblListaComp.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                     "ID","NombreComponente", "TipoComponente"
                }
        ));
        
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnContacto;
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel imgContacto1;
    private javax.swing.JLabel imgEliminar;
    private javax.swing.JLabel imgUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIdAlmu;
    private javax.swing.JLabel lblIdAlmu1;
    private javax.swing.JTable tblListaComp;
    private javax.swing.JTextField txtAlmu;
    private javax.swing.JTextField txtruta;
    // End of variables declaration//GEN-END:variables


}
