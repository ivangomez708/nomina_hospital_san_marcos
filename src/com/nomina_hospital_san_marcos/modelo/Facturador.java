/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nomina_hospital_san_marcos.modelo;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Facturador extends Trabajador implements Serializable{

    public Facturador(String cedula, String nombre, double salario, boolean licencia) {
        super(cedula, nombre, salario, licencia);
    }
    @Override
    public double calcularSalario(int horas, double valor) {
        if(horas <8)
        {
            setSalario(getSalario() + getSalario()*0.05);
            return getSalario();
        }
        {
            setSalario(getSalario() + getSalario()*0.1);
            return getSalario();
        }
        
             
}
                
    }   
    

