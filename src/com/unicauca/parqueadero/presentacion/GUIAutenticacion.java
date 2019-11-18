/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.presentacion;
import com.unicauca.parqueadero.negocio.*;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;

/**
 *
 * @author JuanCamilo
 */
public class GUIAutenticacion extends javax.swing.JFrame {
     GestorUsuarios gestor_usuarios = new GestorUsuarios();
    
    /**
     * Creates new form GUILogin
     */
    public GUIAutenticacion() {
        initComponents();
        myInit();
    }

    private void myInit(){
        this.setLocation(400, 250);
        Image icon = Toolkit.getDefaultToolkit().getImage("./src/recursos/logo.png");
        this.setSize(480, 185);
        this.setIconImage(icon);
        this.setTitle("PARQUEADERO UNICAUCA");
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        pnlTitulo = new javax.swing.JPanel();
        lblParqueadero = new javax.swing.JLabel();
        pnlIngreso = new javax.swing.JPanel();
        pnlUsuario = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        pnlUserField = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        pnlContrasena = new javax.swing.JPanel();
        lblPassword = new javax.swing.JLabel();
        pnlContrasenaField = new javax.swing.JPanel();
        PasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlLogin.setBackground(new java.awt.Color(204, 204, 255));
        pnlLogin.setLayout(new java.awt.BorderLayout());

        pnlBotones.setBackground(new java.awt.Color(255, 255, 255));
        pnlBotones.setLayout(new java.awt.GridLayout());

        btnIngresar.setBackground(new java.awt.Color(0, 153, 153));
        btnIngresar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iniciar-la-sesion (1).png"))); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(null);
        btnIngresar.setBorderPainted(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        pnlBotones.add(btnIngresar);

        btnCerrar.setBackground(new java.awt.Color(0, 153, 153));
        btnCerrar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/error (1).png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlBotones.add(btnCerrar);

        pnlLogin.add(pnlBotones, java.awt.BorderLayout.SOUTH);

        pnlTitulo.setBackground(new java.awt.Color(255, 255, 255));

        lblParqueadero.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblParqueadero.setForeground(new java.awt.Color(0, 153, 153));
        lblParqueadero.setText("INICIO DE SESION");
        pnlTitulo.add(lblParqueadero);

        pnlLogin.add(pnlTitulo, java.awt.BorderLayout.NORTH);

        pnlIngreso.setLayout(new java.awt.GridLayout(2, 4));

        pnlUsuario.setBackground(new java.awt.Color(255, 255, 255));

        lblUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 153, 153));
        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/usuario.png"))); // NOI18N
        lblUsuario.setText("Usuario");
        lblUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlUsuario.add(lblUsuario);

        pnlIngreso.add(pnlUsuario);

        pnlUserField.setLayout(new java.awt.GridLayout());
        pnlUserField.add(txtUsuario);

        pnlIngreso.add(pnlUserField);

        pnlContrasena.setBackground(new java.awt.Color(255, 255, 255));

        lblPassword.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 153, 153));
        lblPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/candado.png"))); // NOI18N
        lblPassword.setText("Contraseña");
        lblPassword.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        pnlContrasena.add(lblPassword);

        pnlIngreso.add(pnlContrasena);

        pnlContrasenaField.setLayout(new java.awt.GridLayout());
        pnlContrasenaField.add(PasswordField);

        pnlIngreso.add(pnlContrasenaField);

        pnlLogin.add(pnlIngreso, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlLogin, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

    }//GEN-LAST:event_btnIngresarActionPerformed
    //Lo que hay en este metodo deberia implementarlo en controlador
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
            java.util.logging.Logger.getLogger(GUIAutenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAutenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAutenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAutenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAutenticacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel lblParqueadero;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlContrasena;
    private javax.swing.JPanel pnlContrasenaField;
    private javax.swing.JPanel pnlIngreso;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JPanel pnlUserField;
    private javax.swing.JPanel pnlUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    public JButton getIngresar(){
        return this.btnIngresar;
    }
    public String getUsuer(){
        return txtUsuario.getText();
    }
    public String getPassword(){
        String password = "";
        for (int i = 0; i < PasswordField.getPassword().length; i++) {
            password = password+PasswordField.getPassword()[i];
        }
        return password;
    }
   
  
}
