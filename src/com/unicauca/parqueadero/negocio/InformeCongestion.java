/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author JuanCamilo
 */
public class InformeCongestion extends JFrame{
    private Parqueadero gestor;
    private DefaultCategoryDataset dataset;
    private JFreeChart chart;
    
    public InformeCongestion() {
        gestor = new Parqueadero();
        dataset = new DefaultCategoryDataset();
        asignarDatos();
        configChart();
        
    }
    private void configChart(){
        chart = ChartFactory.createBarChart("INGRESO DE VEHUCULOS POR HORAS", 
                "INTERVALO", "CANTIDAD DE ENTRADAS", dataset,PlotOrientation.VERTICAL,
                true,true,false);
        
        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);
    }
    private  void asignarDatos(){
        ArrayList<IntervaloCongestion> arreglo = gestor.obtnerHCongestion();
        for (int i = 0; i < arreglo.size(); i++) {
            dataset.addValue(Integer.parseInt(arreglo.get(i).getCantidad()), "Cantidad de Vehiculos", arreglo.get(i).getIntervalo());
        }
        
    }
    public static void iniciarInforme() throws InterruptedException, InvocationTargetException{
        SwingUtilities.invokeAndWait(()->{
        InformeCongestion informe = new InformeCongestion();
        informe.setSize(500, 500);
        informe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        informe.setVisible(true);
                });
    }
}
