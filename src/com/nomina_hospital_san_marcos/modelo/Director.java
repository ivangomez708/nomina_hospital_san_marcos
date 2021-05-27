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
public class Director extends Trabajador implements Serializable{
    private int horasTrabajas;

    public Director(int horasTrabajas, String cedula, String nombre, boolean licencia) {
        super(cedula, nombre, licencia);
        this.horasTrabajas = horasTrabajas;
    }
    @Override
    public double calcularSalario(int horas, double valor) {
        return super.calcularSalario(horas, valor); //To change body of generated methods, choose Tools | Templates.
    }

    public int getHorasTrabajas() {
        return horasTrabajas;
    }

    public void setHorasTrabajas(int horasTrabajas) {
        this.horasTrabajas = horasTrabajas;
    }
        
    
}
