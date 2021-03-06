/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.presentacion;

import com.unicauca.parqueadero.negocio.GestorVigilante;
import com.unicauca.parqueadero.utilidades.Utilidades;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Properties;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import recursos.DateLabelFormatter;


/**
 *
 * @author JuanCamilo
 */
public class GUIRegistroVigilante extends javax.swing.JFrame {
    
    private JDatePickerImpl dtpFechaNaci;
    private  JDatePickerImpl datePicker;
    private GestorVigilante modelo;
    /**
     * Creates new form GUIRegistroVigilante
     */
    public GUIRegistroVigilante() {
        initComponents();
    }
    public void iniciar(){
        Image icon = Toolkit.getDefaultToolkit().getImage("./src/recursos/guardia.png");
        this.setIconImage(icon);
        this.setTitle("REGISTRO VIGILANTE");
        this.setSize(407, 441);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public void cargarDtp(){
        UtilDateModel model = new UtilDateModel();
        model.setDate(1999, 0, 1);
        Properties p = new Properties();
        p.put("text.year", "Year");
        p.put("text.month", "Month");
        p.put("text.today", "Today");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        this.dtpFechaNaci = datePicker;
        pnlFecha.add(dtpFechaNaci);
    }
    public void setModelo(GestorVigilante g){
        this.modelo = g;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTitulo = new javax.swing.JPanel();
        lblTitluo = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        pnlRegistro = new javax.swing.JPanel();
        lblCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        pnlGenero = new javax.swing.JPanel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        lblFechaNaci = new javax.swing.JLabel();
        pnlFecha = new javax.swing.JPanel();
        lblEmpresa = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        txtNomUsuario = new javax.swing.JTextField();
        lblContrasenia = new javax.swing.JLabel();
        psConstraseina = new javax.swing.JPasswordField();
        lblUbicacion = new javax.swing.JLabel();
        cbxUbicacion = new javax.swing.JComboBox<>();

        setLayout(new java.awt.BorderLayout());

        pnlTitulo.setBackground(new java.awt.Color(0, 102, 102));

        lblTitluo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitluo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitluo.setText("REGISTRO DE VIGILANTE");
        pnlTitulo.add(lblTitluo);

        add(pnlTitulo, java.awt.BorderLayout.PAGE_START);

        pnlBotones.setBackground(new java.awt.Color(0, 102, 102));

        btnRegistrar.setBackground(new java.awt.Color(0, 51, 51));
        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        pnlBotones.add(btnRegistrar);

        add(pnlBotones, java.awt.BorderLayout.SOUTH);

        pnlRegistro.setBackground(new java.awt.Color(0, 102, 102));
        pnlRegistro.setLayout(new java.awt.GridLayout(9, 2, 10, 10));

        lblCedula.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCedula.setText("Digite la cedula");
        pnlRegistro.add(lblCedula);
        pnlRegistro.add(txtCedula);

        lblNombres.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombres.setText("Digite los nombres");
        pnlRegistro.add(lblNombres);
        pnlRegistro.add(txtNombres);

        lblApellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellidos.setText("Digite los apellidos");
        pnlRegistro.add(lblApellidos);
        pnlRegistro.add(txtApellidos);

        lblGenero.setForeground(new java.awt.Color(255, 255, 255));
        lblGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGenero.setText("Seleccione el genero");
        pnlRegistro.add(lblGenero);

        pnlGenero.setBackground(new java.awt.Color(0, 102, 102));

        rbMasculino.setBackground(new java.awt.Color(0, 102, 102));
        rbMasculino.setForeground(new java.awt.Color(255, 255, 255));
        rbMasculino.setSelected(true);
        rbMasculino.setText("Masculino");
        rbMasculino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbMasculinoMouseClicked(evt);
            }
        });
        pnlGenero.add(rbMasculino);

        rbFemenino.setBackground(new java.awt.Color(0, 102, 102));
        rbFemenino.setForeground(new java.awt.Color(255, 255, 255));
        rbFemenino.setText("Femenino");
        rbFemenino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbFemeninoMouseClicked(evt);
            }
        });
        pnlGenero.add(rbFemenino);

        pnlRegistro.add(pnlGenero);

        lblFechaNaci.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNaci.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaNaci.setText("Ingrese la fecha de nacimiento");
        pnlRegistro.add(lblFechaNaci);
        pnlRegistro.add(pnlFecha);

        lblEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresa.setText("Digite la empresa a la cual pertenece");
        pnlRegistro.add(lblEmpresa);
        pnlRegistro.add(txtEmpresa);

        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Digite un nombre de usuario");
        pnlRegistro.add(lblUsuario);
        pnlRegistro.add(txtNomUsuario);

        lblContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        lblContrasenia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContrasenia.setText("Digita una contraseña");
        pnlRegistro.add(lblContrasenia);
        pnlRegistro.add(psConstraseina);

        lblUbicacion.setForeground(new java.awt.Color(255, 255, 255));
        lblUbicacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUbicacion.setText("Seleccione su ubicacion");
        pnlRegistro.add(lblUbicacion);

        cbxUbicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salida_Norte", "Entrada_Sur" }));
        pnlRegistro.add(cbxUbicacion);

        add(pnlRegistro, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(!camposValidos()){
            String ced,nombs,apells,emp,user,pass,fechaNaci,ubic,genero;
            ced = txtCedula.getText();
            nombs=txtNombres.getText();
            apells=txtApellidos.getText();
            emp = txtEmpresa.getText();
            user=txtNomUsuario.getText();
            pass = getPassword();
            ubic = cbxUbicacion.getSelectedItem().toString();
            if(rbFemenino.isSelected()){
                genero = "F";
            }else{
                genero = "M";
            }
            fechaNaci  = datePicker.getJFormattedTextField().getText();
            boolean exito;
            exito = modelo.agregarVigilante(ced, emp, user, nombs, apells, genero, fechaNaci, pass, ubic);
            if(exito){
                Utilidades.mensajeExito("Vigilante Registrado con Exito", "Registro Exitoso");
                limpiarCajas();
            }else{
                Utilidades.mensajeError("Un error inesperado ha ocurrido", "Error");
            }
        }else{
            Utilidades.mensajeError("Faltan campos por completar", "Campos Vacios");
        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed
    
    private void limpiarCajas(){
        txtApellidos.setText("");
        txtNombres.setText("");
        txtNomUsuario.setText("");
        txtApellidos.setText("");
        txtCedula.setText("");
        limpiarContrasena();
    }
    private void limpiarContrasena(){
         
        for (int i = 0; i < psConstraseina.getPassword().length; i++) {
            psConstraseina.setText("");
        }
    }
    private void rbMasculinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbMasculinoMouseClicked
        this.rbFemenino.setSelected(false);
    }//GEN-LAST:event_rbMasculinoMouseClicked

    private void rbFemeninoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbFemeninoMouseClicked
        this.rbMasculino.setSelected(false);
    }//GEN-LAST:event_rbFemeninoMouseClicked
    private boolean camposValidos(){
        boolean vacios = true;
        int a = txtApellidos.getText().length();
        int n = txtNombres.getText().length();
        int c = txtCedula.getText().length();
        int e = txtEmpresa.getText().length();
        int u = txtNomUsuario.getText().length();
        String password = "";
        for (int i = 0; i < psConstraseina.getPassword().length; i++) {
            password = password+psConstraseina.getPassword()[i];
        }
        int p = password.length();
        if(a>0 && n>0 && c>0 && e>0 && u>0 && p>0){
            vacios = false;
        }
        return vacios;
    }
    private String getPassword(){
        String password = "";
        for (int i = 0; i < psConstraseina.getPassword().length; i++) {
            password = password+psConstraseina.getPassword()[i];
        }
        return password;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxUbicacion;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblFechaNaci;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTitluo;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlFecha;
    private javax.swing.JPanel pnlGenero;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JPasswordField psConstraseina;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtNomUsuario;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
