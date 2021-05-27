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
public class Usuario implements Serializable{
    private String correo;
    private String Contraseña;
    private Rol rol;

    public Usuario(String correo, String Contraseña, Rol rol) {
        this.correo = correo;
        this.Contraseña = Contraseña;
        this.rol = rol;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "correo=" + correo + ", Contrase\u00f1a=" + Contraseña + ", rol=" + rol + '}';
    }        
    
}
