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
public class Trabajador implements Serializable {
        private String cedula; 
        private String nombre;
        private double salario;
        private boolean licencia;

    public Trabajador(String cedula, String nombre, boolean licencia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public Trabajador(String cedula, String nombre, double salario, boolean licencia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.salario = salario;
        this.licencia = licencia;
    }

    
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isLicencia() {
        return licencia;
    }

    public void setLicencia(boolean licencia) {
        this.licencia = licencia;
    }
    
        
        public double calcularSalario()
        {
            return salario;
        }
        
    public double calcularSalario(int horas, double valor)
    
    {
            salario=horas * valor; 
            return salario; 
    }
    
}
