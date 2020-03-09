/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;

/**
 *
 * @author JuanCamilo
 */
public class EstrategiaFactory {

    public EstrategiaParqueadero getEstrategia(String criterio) {
        switch (criterio) {
            case "Entrada":
                return new EstrategiaEntrada();
            case "Salida":
                return new EstrategiaSalida();

            default:
                return new EstrategiaEntrada();
        }
    }
}
