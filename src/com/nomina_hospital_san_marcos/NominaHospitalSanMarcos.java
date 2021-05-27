/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nomina_hospital_san_marcos;

import com.nomina_hospital_san_marcos.controlador.ControladorNomina;
import com.nomina_hospital_san_marcos.modelo.Director;
import com.nomina_hospital_san_marcos.modelo.Facturador;
import com.nomina_hospital_san_marcos.modelo.TecSistemas;

/**
 *
 * @author Usuario
 */
public class NominaHospitalSanMarcos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ControladorNomina control = new ControladorNomina();
        control.adicionarTrajador(new TecSistemas("1193032582", "Ivan Gomez",3000000, false));
        control.adicionarTrajador(new Director(10, "235487", "Ramon Roma", false));
        control.adicionarTrajador(new Director(15, "15477", "Julanito Detal", false));
        control.adicionarTrajador(new Facturador("235487", "Pero Perez",2500000, false));
        
        System.out.println("control = " + control.calcularNomina());
      
       
        
        
    }
    
}
