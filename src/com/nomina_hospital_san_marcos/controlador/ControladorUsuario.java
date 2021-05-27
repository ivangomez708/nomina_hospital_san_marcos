/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nomina_hospital_san_marcos.controlador;

import com.nomina_hospital_san_marcos.modelo.Rol;
import com.nomina_hospital_san_marcos.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorUsuario {
    private Rol[] roles;
    private List<Usuario> usuarios;

    public ControladorUsuario() {
            inicializarColecciones();
    }
    
    private void inicializarColecciones()
    {
        roles = new Rol[2];
        roles[0]= new Rol((byte)1, "Administrador");
        roles[1]= new Rol((byte)2, "Consulta");
        
        usuarios = new ArrayList<>();
        
        usuarios.add(new Usuario("idgomez90447@umanizales.edu.co", "123456", roles[0]));
        usuarios.add(new Usuario("ivangomez@umanizales.edu.co", "123456", roles[1]));
    }
    
    public boolean verificarUsuario(String correo, String Contrasenia)
    {
        for(Usuario usu: usuarios)
        {
            if(usu.getCorreo().equals(correo) && usu.getContraseña().equals(Contrasenia))
                    {
                        return true;
                    }
        }
        return false;
    }
    
    
}
