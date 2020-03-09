/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.presentacion;

import com.unicauca.parqueadero.negocio.EstrategiaParqueadero;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 *
 * @author JuanCamilo
 */
public class GUIParqueadero extends javax.swing.JFrame  implements Observer{

    private ArrayList<JToggleButton> tmp;
    private EstrategiaParqueadero estrategia;
    private GUIParqueaderoController miController;
    
    /**
     * Creates new form GUIParqueaderoSur
     */
    public GUIParqueadero() {
        initComponents();
        guardarBotones();
    }

    public void habilitar(int i) {

        tmp.get(i).setBackground(new Color(240, 240, 240));
        tmp.get(i).setSelected(false);
        tmp.get(i).setEnabled(true);

    }
    public void setController(GUIParqueaderoController controler){
        this.miController = controler;
    }
    public void setEstrategia(EstrategiaParqueadero est){
        this.estrategia = est;
    }
    public void habilitarSalida(int i) {
        tmp.get(i).setEnabled(true);
    }
    public void cambiarColorSalida(int i){
        tmp.get(i).setBackground(new Color(240, 240, 240));
        tmp.get(i).setSelected(false);
        tmp.get(i).setEnabled(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlParqueadero = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        pnlZonaMotos = new javax.swing.JPanel();
        btn31 = new javax.swing.JToggleButton();
        btn32 = new javax.swing.JToggleButton();
        btn33 = new javax.swing.JToggleButton();
        btn35 = new javax.swing.JToggleButton();
        btn36 = new javax.swing.JToggleButton();
        btn37 = new javax.swing.JToggleButton();
        btn38 = new javax.swing.JToggleButton();
        btn34 = new javax.swing.JToggleButton();
        btn39 = new javax.swing.JToggleButton();
        btn40 = new javax.swing.JToggleButton();
        pnlIpet = new javax.swing.JPanel();
        btn25 = new javax.swing.JToggleButton();
        btn26 = new javax.swing.JToggleButton();
        btn27 = new javax.swing.JToggleButton();
        btn28 = new javax.swing.JToggleButton();
        btn30 = new javax.swing.JToggleButton();
        btn29 = new javax.swing.JToggleButton();
        pnlFic = new javax.swing.JPanel();
        btn16 = new javax.swing.JToggleButton();
        btn18 = new javax.swing.JToggleButton();
        btn20 = new javax.swing.JToggleButton();
        btn21 = new javax.swing.JToggleButton();
        btn22 = new javax.swing.JToggleButton();
        btn23 = new javax.swing.JToggleButton();
        btn24 = new javax.swing.JToggleButton();
        btn17 = new javax.swing.JToggleButton();
        btn19 = new javax.swing.JToggleButton();
        pnlFiet = new javax.swing.JPanel();
        btn2 = new javax.swing.JToggleButton();
        btn5 = new javax.swing.JToggleButton();
        btn6 = new javax.swing.JToggleButton();
        btn7 = new javax.swing.JToggleButton();
        btn8 = new javax.swing.JToggleButton();
        btn9 = new javax.swing.JToggleButton();
        btn10 = new javax.swing.JToggleButton();
        btn11 = new javax.swing.JToggleButton();
        btn12 = new javax.swing.JToggleButton();
        btn13 = new javax.swing.JToggleButton();
        btn14 = new javax.swing.JToggleButton();
        btn15 = new javax.swing.JToggleButton();
        btn3 = new javax.swing.JToggleButton();
        btn4 = new javax.swing.JToggleButton();
        btn1 = new javax.swing.JToggleButton();
        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlOcupado = new javax.swing.JPanel();
        btnOcupado = new javax.swing.JButton();
        lblOcupado = new javax.swing.JLabel();
        lblEspacioVacio = new javax.swing.JLabel();
        pnlLibre = new javax.swing.JPanel();
        btlnLibre = new javax.swing.JButton();
        lblLibre = new javax.swing.JLabel();

        pnlParqueadero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Laboratorios"));
        pnlParqueadero.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 80, 220));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("IPET"));
        pnlParqueadero.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 110, 40));

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("FIET"));
        pnlParqueadero.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 90, 280));

        pnlZonaMotos.setBackground(new java.awt.Color(153, 153, 153));
        pnlZonaMotos.setBorder(javax.swing.BorderFactory.createTitledBorder("Zona Motos"));
        pnlZonaMotos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn31.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn31.setForeground(new java.awt.Color(240, 240, 240));
        btn31.setText("31");
        pnlZonaMotos.add(btn31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 20, 20));

        btn32.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn32.setForeground(new java.awt.Color(240, 240, 240));
        btn32.setText("32");
        pnlZonaMotos.add(btn32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 20, 20));

        btn33.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn33.setForeground(new java.awt.Color(240, 240, 240));
        btn33.setText("33");
        pnlZonaMotos.add(btn33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 20, 20));

        btn35.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn35.setForeground(new java.awt.Color(240, 240, 240));
        btn35.setText("35");
        pnlZonaMotos.add(btn35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 20, 20));

        btn36.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn36.setForeground(new java.awt.Color(240, 240, 240));
        btn36.setText("36");
        pnlZonaMotos.add(btn36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 20, 20));

        btn37.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn37.setForeground(new java.awt.Color(240, 240, 240));
        btn37.setText("37");
        pnlZonaMotos.add(btn37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 20, 20));

        btn38.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn38.setForeground(new java.awt.Color(240, 240, 240));
        btn38.setText("38");
        pnlZonaMotos.add(btn38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 20, 20));

        btn34.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn34.setForeground(new java.awt.Color(240, 240, 240));
        btn34.setText("34");
        pnlZonaMotos.add(btn34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 20, 20));

        btn39.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn39.setForeground(new java.awt.Color(240, 240, 240));
        btn39.setText("39");
        pnlZonaMotos.add(btn39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 20, 20));

        btn40.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn40.setForeground(new java.awt.Color(240, 240, 240));
        btn40.setText("40");
        pnlZonaMotos.add(btn40, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 20, 20));

        pnlParqueadero.add(pnlZonaMotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 80, 190));

        pnlIpet.setBackground(new java.awt.Color(153, 153, 153));
        pnlIpet.setBorder(javax.swing.BorderFactory.createTitledBorder("Zona IPET"));
        pnlIpet.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn25.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn25.setForeground(new java.awt.Color(240, 240, 240));
        btn25.setText("25");
        pnlIpet.add(btn25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        btn26.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn26.setForeground(new java.awt.Color(240, 240, 240));
        btn26.setText("26");
        pnlIpet.add(btn26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 20, 20));

        btn27.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn27.setForeground(new java.awt.Color(240, 240, 240));
        btn27.setText("27");
        pnlIpet.add(btn27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 20, 20));

        btn28.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn28.setForeground(new java.awt.Color(240, 240, 240));
        btn28.setText("28");
        pnlIpet.add(btn28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 20, 20));

        btn30.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn30.setForeground(new java.awt.Color(240, 240, 240));
        btn30.setText("30");
        pnlIpet.add(btn30, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 20, 20));

        btn29.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn29.setForeground(new java.awt.Color(240, 240, 240));
        btn29.setText("29");
        pnlIpet.add(btn29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 20, 20));

        pnlParqueadero.add(pnlIpet, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 100, 70));

        pnlFic.setBackground(new java.awt.Color(153, 153, 153));
        pnlFic.setBorder(javax.swing.BorderFactory.createTitledBorder("Zona FIC"));
        pnlFic.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn16.setForeground(new java.awt.Color(240, 240, 240));
        btn16.setText("16");
        pnlFic.add(btn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        btn18.setForeground(new java.awt.Color(240, 240, 240));
        btn18.setText("18");
        pnlFic.add(btn18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 20, 20));

        btn20.setForeground(new java.awt.Color(240, 240, 240));
        btn20.setText("20");
        pnlFic.add(btn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 20, 20));

        btn21.setForeground(new java.awt.Color(240, 240, 240));
        btn21.setText("21");
        pnlFic.add(btn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 20, 20));

        btn22.setForeground(new java.awt.Color(240, 240, 240));
        btn22.setText("22");
        pnlFic.add(btn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 20, 20));

        btn23.setForeground(new java.awt.Color(240, 240, 240));
        btn23.setText("23");
        pnlFic.add(btn23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 20, 20));

        btn24.setForeground(new java.awt.Color(240, 240, 240));
        btn24.setText("24");
        pnlFic.add(btn24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 20, 20));

        btn17.setForeground(new java.awt.Color(240, 240, 240));
        btn17.setText("17");
        pnlFic.add(btn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 20, 20));

        btn19.setForeground(new java.awt.Color(240, 240, 240));
        btn19.setText("19");
        pnlFic.add(btn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 20, 20));

        pnlParqueadero.add(pnlFic, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 100, 100));

        pnlFiet.setBackground(new java.awt.Color(153, 153, 153));
        pnlFiet.setBorder(javax.swing.BorderFactory.createTitledBorder("Zona Fiet"));
        pnlFiet.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn2.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        btn2.setForeground(new java.awt.Color(240, 240, 240));
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 8))); // NOI18N
        pnlFiet.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 20, 20));

        btn5.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn5.setForeground(new java.awt.Color(240, 240, 240));
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "5", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 8))); // NOI18N
        pnlFiet.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 20, 20));

        btn6.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn6.setForeground(new java.awt.Color(240, 240, 240));
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "6", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 8))); // NOI18N
        pnlFiet.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 20, 20));

        btn7.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn7.setForeground(new java.awt.Color(240, 240, 240));
        btn7.setText("7");
        pnlFiet.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 20, 20));

        btn8.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn8.setForeground(new java.awt.Color(240, 240, 240));
        btn8.setText("8");
        pnlFiet.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 20, 20));

        btn9.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn9.setForeground(new java.awt.Color(240, 240, 240));
        btn9.setText("9");
        pnlFiet.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 20, 20));

        btn10.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn10.setForeground(new java.awt.Color(240, 240, 240));
        btn10.setText("10");
        pnlFiet.add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 20, 20));

        btn11.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn11.setForeground(new java.awt.Color(240, 240, 240));
        btn11.setText("11");
        pnlFiet.add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 20, 20));

        btn12.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn12.setForeground(new java.awt.Color(240, 240, 240));
        btn12.setText("12");
        pnlFiet.add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 20, 20));

        btn13.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn13.setForeground(new java.awt.Color(240, 240, 240));
        btn13.setText("13");
        pnlFiet.add(btn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 20, 20));

        btn14.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn14.setForeground(new java.awt.Color(240, 240, 240));
        btn14.setText("14");
        pnlFiet.add(btn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 20, 20));

        btn15.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn15.setForeground(new java.awt.Color(240, 240, 240));
        btn15.setText("15");
        pnlFiet.add(btn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 20, 20));

        btn3.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn3.setForeground(new java.awt.Color(240, 240, 240));
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "3", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 8))); // NOI18N
        pnlFiet.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 20, 20));

        btn4.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btn4.setForeground(new java.awt.Color(240, 240, 240));
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "4", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 8))); // NOI18N
        pnlFiet.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 20, 20));

        btn1.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        btn1.setForeground(new java.awt.Color(240, 240, 240));
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 8))); // NOI18N
        pnlFiet.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 20, 20));

        pnlParqueadero.add(pnlFiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 220));

        getContentPane().add(pnlParqueadero, java.awt.BorderLayout.CENTER);

        pnlTitulo.setLayout(new java.awt.GridLayout(2, 2));

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo.setText("PARQUEADERO UNICAUCA");
        pnlTitulo.add(lblTitulo);

        pnlOcupado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOcupado.setBackground(new java.awt.Color(51, 153, 0));
        pnlOcupado.add(btnOcupado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 20, 20));

        lblOcupado.setText("OCUPADO");
        pnlOcupado.add(lblOcupado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 283, 20));

        pnlTitulo.add(pnlOcupado);
        pnlTitulo.add(lblEspacioVacio);

        pnlLibre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btlnLibre.setBackground(new java.awt.Color(255, 255, 255));
        pnlLibre.add(btlnLibre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 20, 20));

        lblLibre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLibre.setText("LIBRE");
        pnlLibre.add(lblLibre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlTitulo.add(pnlLibre);

        getContentPane().add(pnlTitulo, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents
    public void cambiarColor(int indice) {
        tmp.get(indice).setBackground(Color.green);
        tmp.get(indice).setSelected(false);
        tmp.get(indice).setEnabled(false);
    }
    
    public void pintarTodos(){
        for (int i = 0; i < tmp.size(); i++) {
            tmp.get(i).setBackground(new Color(240, 240, 240));
            tmp.get(i).setSelected(false);
        }
    }
    public ArrayList<JToggleButton> getBotones(){
        return tmp;
    }

    private void guardarBotones() {
        this.tmp = new ArrayList<>();
        tmp.add(btn1);
        tmp.add(btn2);
        tmp.add(btn3);
        tmp.add(btn4);
        tmp.add(btn5);
        tmp.add(btn6);
        tmp.add(btn7);
        tmp.add(btn8);
        tmp.add(btn9);
        tmp.add(btn10);
        tmp.add(btn11);
        tmp.add(btn12);
        tmp.add(btn13);
        tmp.add(btn14);
        tmp.add(btn15);
        tmp.add(btn16);
        tmp.add(btn17);
        tmp.add(btn18);
        tmp.add(btn19);
        tmp.add(btn20);
        tmp.add(btn21);
        tmp.add(btn22);
        tmp.add(btn23);
        tmp.add(btn24);
        tmp.add(btn25);
        tmp.add(btn26);
        tmp.add(btn27);
        tmp.add(btn28);
        tmp.add(btn29);
        tmp.add(btn30);
        tmp.add(btn31);
        tmp.add(btn32);
        tmp.add(btn33);
        tmp.add(btn34);
        tmp.add(btn35);
        tmp.add(btn36);
        tmp.add(btn37);
        tmp.add(btn38);
        tmp.add(btn39);
        tmp.add(btn40);
        
    }

    public JPanel getFiet() {
        return pnlFiet;
    }

    public JPanel getFic() {
        return pnlFic;
    }

    public JPanel getIpet() {
        return pnlIpet;
    }

    public JPanel getMotos() {
        return pnlZonaMotos;
    }

    public ArrayList<JPanel> getZonas() {
        ArrayList<JPanel> aux = new ArrayList<>();
        aux.add(pnlFiet);
        aux.add(pnlFic);
        aux.add(pnlIpet);
        aux.add(pnlZonaMotos);
        return aux;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btlnLibre;
    private javax.swing.JToggleButton btn1;
    private javax.swing.JToggleButton btn10;
    private javax.swing.JToggleButton btn11;
    private javax.swing.JToggleButton btn12;
    private javax.swing.JToggleButton btn13;
    private javax.swing.JToggleButton btn14;
    private javax.swing.JToggleButton btn15;
    private javax.swing.JToggleButton btn16;
    private javax.swing.JToggleButton btn17;
    private javax.swing.JToggleButton btn18;
    private javax.swing.JToggleButton btn19;
    private javax.swing.JToggleButton btn2;
    private javax.swing.JToggleButton btn20;
    private javax.swing.JToggleButton btn21;
    private javax.swing.JToggleButton btn22;
    private javax.swing.JToggleButton btn23;
    private javax.swing.JToggleButton btn24;
    private javax.swing.JToggleButton btn25;
    private javax.swing.JToggleButton btn26;
    private javax.swing.JToggleButton btn27;
    private javax.swing.JToggleButton btn28;
    private javax.swing.JToggleButton btn29;
    private javax.swing.JToggleButton btn3;
    private javax.swing.JToggleButton btn30;
    private javax.swing.JToggleButton btn31;
    private javax.swing.JToggleButton btn32;
    private javax.swing.JToggleButton btn33;
    private javax.swing.JToggleButton btn34;
    private javax.swing.JToggleButton btn35;
    private javax.swing.JToggleButton btn36;
    private javax.swing.JToggleButton btn37;
    private javax.swing.JToggleButton btn38;
    private javax.swing.JToggleButton btn39;
    private javax.swing.JToggleButton btn4;
    private javax.swing.JToggleButton btn40;
    private javax.swing.JToggleButton btn5;
    private javax.swing.JToggleButton btn6;
    private javax.swing.JToggleButton btn7;
    private javax.swing.JToggleButton btn8;
    private javax.swing.JToggleButton btn9;
    private javax.swing.JButton btnOcupado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblEspacioVacio;
    private javax.swing.JLabel lblLibre;
    private javax.swing.JLabel lblOcupado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlFic;
    private javax.swing.JPanel pnlFiet;
    private javax.swing.JPanel pnlIpet;
    private javax.swing.JPanel pnlLibre;
    private javax.swing.JPanel pnlOcupado;
    private javax.swing.JPanel pnlParqueadero;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JPanel pnlZonaMotos;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        estrategia.cargarPuesto(miController.getGestor(), this, miController);
    }

}
