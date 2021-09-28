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
 * @author softwareTeam
 */
public class AdminCompoDispo extends javax.swing.JFrame {
    
    String idComp = "";
    String idAlmu = "";
    /**
     * Creates new form AdminComponentes
     */
    public AdminCompoDispo(){
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Actualizar Componente Almuerzo");        
    }
    
    public AdminCompoDispo(String viejo, String idAlmu1){
        idComp = viejo;
        idAlmu = idAlmu1;
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Actualizar Componente Almuerzo");  
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
        jLabel2 = new javax.swing.JLabel();
        lblCompDispo = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        btnMostrarComp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaComp = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        imgContacto1 = new javax.swing.JLabel();
        btnContacto = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo restaurante esquina.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 70, 90, 60);

        lblCompDispo.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lblCompDispo.setForeground(new java.awt.Color(153, 0, 0));
        lblCompDispo.setText("Componentes Disponibles");
        jPanel1.add(lblCompDispo);
        lblCompDispo.setBounds(170, 110, 410, 50);

        btnSeleccionar.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnSeleccionar.setForeground(new java.awt.Color(153, 0, 0));
        btnSeleccionar.setText("Seleccionar componente");
        btnSeleccionar.setBorder(null);
        btnSeleccionar.setBorderPainted(false);
        btnSeleccionar.setContentAreaFilled(false);
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionar);
        btnSeleccionar.setBounds(430, 380, 190, 30);

        btnMostrarComp.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnMostrarComp.setForeground(new java.awt.Color(153, 0, 0));
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
        btnMostrarComp.setBounds(90, 380, 200, 27);

        tblListaComp.setAutoCreateRowSorter(true);
        tblListaComp.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
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
        jScrollPane1.setBounds(90, 170, 540, 180);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 51));
        jLabel4.setText("Id:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(-30, 0, 16, 18);

        lblAdmin.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(153, 0, 0));
        lblAdmin.setText("Administrador");
        jPanel1.add(lblAdmin);
        lblAdmin.setBounds(380, 80, 90, 20);

        imgContacto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cc.png"))); // NOI18N
        jPanel1.add(imgContacto1);
        imgContacto1.setBounds(470, 60, 48, 48);

        btnContacto.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
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
        btnContacto.setBounds(510, 80, 77, 19);

        btnSalir.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
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
        btnSalir.setBounds(600, 80, 27, 19);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Base2.png"))); // NOI18N
        jPanel1.add(lblFondo);
        lblFondo.setBounds(0, -20, 770, 530);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
         AdminActualizarAlmuerzo adcom = new AdminActualizarAlmuerzo();
        //Sacamos el ide de la tabla con los componentes
        DefaultTableModel tabla1 = (DefaultTableModel) tblListaComp.getModel();
        
        int ban=0;
        String tipoCom = "";
        
        String idCompNuevo=String.valueOf(tabla1.getValueAt(tblListaComp.getSelectedRow(),0));
        String nombreCom = String.valueOf(tabla1.getValueAt(tblListaComp.getSelectedRow(),2));
        

        //VARIABLE PARA SACAR ID COMPTIPO
        String idTipoCom = convert(nombreCom);
               
        IAlmuerzoRepository service = Factory.getInstance().getRepositoryAlmuerzo();
        AlmuerzoService objService= new AlmuerzoService(service);
        
        IComponenteRepository serviceCom = Factory.getInstance().getRepositoryComponente();
        ComponenteService objServiceCom = new ComponenteService(serviceCom);
        
        Almuerzo objAlmu = new Almuerzo();
        
        objAlmu.setIdAlmuerzo(idAlmu);
        objAlmu.setRestId(idComp);
        objAlmu.setCostoAlm(idCompNuevo); //mandarle el id del componente nuevo
           
        try {
             // Así mismo como el anterior vamos a contar cuantos tiposs de componentes hay en un almuerzo determinado. 
             String response = objServiceCom.contarComponente(Integer.parseInt(idAlmu), Integer.parseInt(idTipoCom));
             
             int valor = Integer.parseInt(response); //convertimos a entero la respuesta de contarComponente
             if(valor <= 4 ){
                ban = 1; //bandera para saber que hay menos de 4 componentes del mismo tipo
             } 
        } catch (Exception ex) {
                System.out.println(ex);
                successMessage(ex.getMessage() + "Error", "Atención");
        }
        
        if(ban == 1  ){ // comparamos la bandera para saber la cantidad de componentes que tiene el almuerzo del mismo tipo
            try {
                String contar = objServiceCom.buscarComponente(Integer.parseInt(idAlmu), Integer.parseInt(idCompNuevo)) ;
                if(contar.equals(0+"")){
                    String response = objService.updateAlmuerzo(objAlmu); // enviamos al objService el metodo de updateAlmuerzo el objeto almuerzo con los datos
                    successMessage("Componente de Almuerzo " + response + " Actualizado con exito.", "Atención");
                }
                else{
                    successMessage("Componente del Almuerzo " + idComp + " Ya esta en uso .", "Error");
                }                

            } catch (Exception ex) {
                    System.out.println(ex);
                    successMessage(ex.getMessage() + "Error", "Atención");
            }
        }
        else{
             successMessage("El almuerzo se encuentra con 5 componentes", "Atención");

        }
        adcom.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnMostrarCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCompActionPerformed
        try {
            llenarTabla();
        } catch (Exception ex) {
            Logger.getLogger(AdminCompoDispo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMostrarCompActionPerformed

    private void btnContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactoActionPerformed
        // TODO add your handling code here:
        Contacto cont = new Contacto(5);
        cont.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnContactoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
         //resp =0 si, resp = 1 no.
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if (resp==0){
        MenuAdmin menu = new MenuAdmin();
        menu.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(AdminCompoDispo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminCompoDispo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminCompoDispo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminCompoDispo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                    new AdminCompoDispo().setVisible(true);
                } catch (Exception ex) { 
                    Logger.getLogger(AdminCompoDispo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
        });
    }
    private void llenarTabla() throws Exception {
        IComponenteRepository service= Factory.getInstance().getRepositoryComponente();
        ComponenteService componenteService= new ComponenteService(service);

        //Componente objComponente = new Componente();
        List<Componente> objListComponentes = new ArrayList<Componente>();

        objListComponentes = componenteService.listComponentes(idAlmu);

        String matriz[][] = new String[objListComponentes.size()][3];

        for (int i = 0; i < objListComponentes.size(); i++) {
            matriz[i][0] = objListComponentes.get(i).getIdComponente()+"";
            matriz[i][1] = objListComponentes.get(i).getNombreComponente();
            matriz[i][2] = objListComponentes.get(i).getTipoComponente();
        }

        tblListaComp.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                     "ID","Nombre", "Tipo"
                }
        ));
    }
    
    private String convert(String nombre){
        if(nombre.equals("Entrada")){
            return 1+"";
        }
        if(nombre.equals("Principio")){
            return 2+"";
        }
        if(nombre.equals("Proteina")){
            return 3+"";
        }
        return 4+"";
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContacto;
    private javax.swing.JButton btnMostrarComp;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel imgContacto1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblCompDispo;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTable tblListaComp;
    // End of variables declaration//GEN-END:variables
}