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
public class TecSistemas extends Trabajador implements Serializable{

    public TecSistemas(String cedula, String nombre, double salario, boolean licencia) {
        super(cedula, nombre, salario, licencia);
    }      
}
