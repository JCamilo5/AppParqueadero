/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.presentacion;
import com.unicauca.parqueadero.negocio.GestorConductor;
import com.unicauca.parqueadero.negocio.GestorUsuarios;
import com.unicauca.parqueadero.utilidades.Utilidades;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvcf.AActionController;
import mvcf.AModel;
import mvcf.AView;
/**
 *
 * @author JuanCamilo
 */
public class GUIConductorController implements ActionListener{
    private GUIBusquedaConductor vista;
    private GestorConductor modelo;
    private Utilidades utilidades;
    
    public GUIConductorController(GestorConductor modelo, GUIBusquedaConductor vista){
        this.vista  = vista;
        this.modelo = modelo;
        this.utilidades = new Utilidades();
        this.vista.getBtnConsultar().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
    
}
