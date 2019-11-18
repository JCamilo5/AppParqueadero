/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.presentacion;

import com.unicauca.parqueadero.utilidades.Utilidades;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author JuanCamilo
 */
public class GUIMenu extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    public GUIMenu() {
        initComponents();
        //Poner el icono de la aplicación
        Image icon = Toolkit.getDefaultToolkit().getImage("./src/recursos/logo.png");
        this.setIconImage(icon);
        ponerUsuarioLogueado();
    }
    public void usuario_activo(String usuario){
        lblUsuario.setForeground(Color.RED);
        lblUsuario.setText("Bienvenido "+ usuario);
        
    }
    private void ponerUsuarioLogueado() {

            if (Utilidades.usuario == null) {
                this.mnuEmpleadoLogueado.setText("(Anónimo)");
            } else {
                this.mnuEmpleadoLogueado.setText("(" + Utilidades.usuario.getUser() + ")");
                usuario_activo(Utilidades.usuario.getNombres()+" "+Utilidades.usuario.getApellidos());
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

        lblUsuario = new javax.swing.JLabel();
        dskEscritorio = new javax.swing.JDesktopPane();
        mbParqueadero = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        btnConsConductor = new javax.swing.JMenuItem();
        btnVerMapa = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menAcercade = new javax.swing.JMenuItem();
        mnuEmpleadoLogueado = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración de Parqueadero");
        setBackground(new java.awt.Color(153, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblUsuario.setEnabled(false);

        dskEscritorio.setBackground(new java.awt.Color(153, 153, 255));

        mbParqueadero.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        mbParqueadero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mbParqueadero.setMaximumSize(new java.awt.Dimension(324, 32769));
        mbParqueadero.setPreferredSize(new java.awt.Dimension(345, 21));

        jMenu2.setText("Opciones");

        btnConsConductor.setBackground(new java.awt.Color(153, 153, 255));
        btnConsConductor.setText("Consultar informacion del conductor");
        btnConsConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsConductorActionPerformed(evt);
            }
        });
        jMenu2.add(btnConsConductor);

        btnVerMapa.setText("Ver Mapa");
        btnVerMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMapaActionPerformed(evt);
            }
        });
        jMenu2.add(btnVerMapa);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jMenu2.add(btnSalir);

        mbParqueadero.add(jMenu2);

        jMenu1.setText("Ayuda");

        menAcercade.setText("Acerca de");
        menAcercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAcercadeActionPerformed(evt);
            }
        });
        jMenu1.add(menAcercade);

        mbParqueadero.add(jMenu1);

        mnuEmpleadoLogueado.setBackground(new java.awt.Color(255, 51, 153));
        mnuEmpleadoLogueado.setText("Usuario");
        mnuEmpleadoLogueado.setEnabled(false);
        mbParqueadero.add(mnuEmpleadoLogueado);

        setJMenuBar(mbParqueadero);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1011, Short.MAX_VALUE)
                .addComponent(lblUsuario)
                .addGap(22, 22, 22))
            .addComponent(dskEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(dskEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMapaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerMapaActionPerformed

    private void btnConsConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsConductorActionPerformed
       GUIBusquedaConductor ins = new GUIBusquedaConductor();
        ins.setMaximizable(true);

        dskEscritorio.add(ins);
        ins.show();
    }//GEN-LAST:event_btnConsConductorActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void menAcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAcercadeActionPerformed
         String str = "Gestion de parqueadero \n"
                + "Version 0.1 - Primera entrega \n"
                + "Universidad del Cauca";
        Utilidades.mensajeExito(str, "Acerca de");
    }//GEN-LAST:event_menAcercadeActionPerformed

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
            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnConsConductor;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JMenuItem btnVerMapa;
    private javax.swing.JDesktopPane dskEscritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuBar mbParqueadero;
    private javax.swing.JMenuItem menAcercade;
    private javax.swing.JMenu mnuEmpleadoLogueado;
    // End of variables declaration//GEN-END:variables
}
