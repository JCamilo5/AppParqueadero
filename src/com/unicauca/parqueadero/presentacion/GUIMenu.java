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
    private GUIBusquedaConductor busqueda;
    private GUIParqueaderoController parqueController;
    private GUIRegistroVigilante vistaRegVig;
    private String privilegio;
    private String ubicacion;
    

    /**
     * Creates new form test
     */
    public GUIMenu() {

        initComponents();

    }
    public void setUbicacion(String ubi){
        this.ubicacion = ubi;
    }
 
    public void setVistaRegVig(GUIRegistroVigilante vista){
        this.vistaRegVig = vista;
    }
    public void setVistaMapa(GUIParqueaderoController pc){
        this.parqueController = pc;
    }
    public void setBusqueda(GUIBusquedaConductor vista){
        this.busqueda = vista;
    }
    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }

    public void iniciar() {
        Image icon = Toolkit.getDefaultToolkit().getImage("./src/recursos/logo.png");
        this.setIconImage(icon);
        ponerUsuarioLogueado();
        //Asigno rivilegios
        if (privilegio.equals("administrador")) {
            this.sbMnuAyuda.setVisible(true);
            this.sbMnuOpcAdmin.setVisible(true);
            this.sbMnuOpciones.setVisible(true);
            if(ubicacion.equals("Entrada")){
                Utilidades.estrategia = "Entrada";

            }
            if(ubicacion.equals("Salida")){
                Utilidades.estrategia = "Salida";              
            }
            
        }
        if (privilegio.equals("vigilante")) {
            this.sbMnuAyuda.setVisible(true);
            this.sbMnuOpcAdmin.setVisible(false);
            this.sbMnuOpciones.setVisible(true);
            System.out.println("Antes de preguntar ubicacion");
            if(ubicacion.equals("Entrada")){
                Utilidades.estrategia = "Entrada";
                this.btnSalidaConductor.setVisible(false);

            }
            if(ubicacion.equals("Salida")){
                Utilidades.estrategia = "Salida";
                this.btnConsConductor.setVisible(false);
                
            }
        }
        this.setExtendedState(MAXIMIZED_BOTH);
        ponerUsuarioLogueado();
        this.setVisible(true);

    }

    public void usuario_activo(String usuario) {
        lblUsuario.setForeground(Color.RED);
        lblUsuario.setText("Bienvenido " + usuario);

    }

    private void ponerUsuarioLogueado() {

        if (Utilidades.usuario == null) {
            this.mnuEmpleadoLogueado.setText("(Anónimo)");
        } else {
            this.mnuEmpleadoLogueado.setText("(" + Utilidades.usuario.getUser() + ")");
            usuario_activo(Utilidades.usuario.getNombres() + " " + Utilidades.usuario.getApellidos());
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
        sbMnuOpciones = new javax.swing.JMenu();
        btnConsConductor = new javax.swing.JMenuItem();
        btnSalidaConductor = new javax.swing.JMenuItem();
        btnVerMapa = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenuItem();
        sbMnuAyuda = new javax.swing.JMenu();
        menAcercade = new javax.swing.JMenuItem();
        sbMnuOpcAdmin = new javax.swing.JMenu();
        sbMnuRegVigilante = new javax.swing.JMenuItem();
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

        sbMnuOpciones.setText("Opciones");

        btnConsConductor.setBackground(new java.awt.Color(153, 153, 255));
        btnConsConductor.setText("Ingresar Conductor");
        btnConsConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsConductorActionPerformed(evt);
            }
        });
        sbMnuOpciones.add(btnConsConductor);

        btnSalidaConductor.setText("Registrar Salida");
        btnSalidaConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaConductorActionPerformed(evt);
            }
        });
        sbMnuOpciones.add(btnSalidaConductor);

        btnVerMapa.setText("Ver Mapa");
        btnVerMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMapaActionPerformed(evt);
            }
        });
        sbMnuOpciones.add(btnVerMapa);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        sbMnuOpciones.add(btnSalir);

        mbParqueadero.add(sbMnuOpciones);

        sbMnuAyuda.setText("Ayuda");

        menAcercade.setText("Acerca de");
        menAcercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAcercadeActionPerformed(evt);
            }
        });
        sbMnuAyuda.add(menAcercade);

        mbParqueadero.add(sbMnuAyuda);

        sbMnuOpcAdmin.setText("Opciones de Administrador");

        sbMnuRegVigilante.setText("Agregar Vigilante");
        sbMnuRegVigilante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbMnuRegVigilanteActionPerformed(evt);
            }
        });
        sbMnuOpcAdmin.add(sbMnuRegVigilante);

        mbParqueadero.add(sbMnuOpcAdmin);

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
        parqueController.mostrarMapa();
    }//GEN-LAST:event_btnVerMapaActionPerformed

    private void btnConsConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsConductorActionPerformed

        busqueda.setMaximizable(true);
        dskEscritorio.add(busqueda);
        busqueda.show();
    }//GEN-LAST:event_btnConsConductorActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void menAcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAcercadeActionPerformed
        String str = "Gestion de parqueadero \n"
                + "Version 0.2 - Segunda entrega \n"
                + "Universidad del Cauca";
        Utilidades.mensajeExito(str, "Acerca de");
    }//GEN-LAST:event_menAcercadeActionPerformed

    private void sbMnuRegVigilanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbMnuRegVigilanteActionPerformed
        vistaRegVig.iniciar();
    }//GEN-LAST:event_sbMnuRegVigilanteActionPerformed

    private void btnSalidaConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaConductorActionPerformed
        parqueController.iniciar();
        parqueController.lanzarHilo();
    }//GEN-LAST:event_btnSalidaConductorActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnConsConductor;
    private javax.swing.JMenuItem btnSalidaConductor;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JMenuItem btnVerMapa;
    private javax.swing.JDesktopPane dskEscritorio;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuBar mbParqueadero;
    private javax.swing.JMenuItem menAcercade;
    private javax.swing.JMenu mnuEmpleadoLogueado;
    private javax.swing.JMenu sbMnuAyuda;
    private javax.swing.JMenu sbMnuOpcAdmin;
    private javax.swing.JMenu sbMnuOpciones;
    private javax.swing.JMenuItem sbMnuRegVigilante;
    // End of variables declaration//GEN-END:variables
}
