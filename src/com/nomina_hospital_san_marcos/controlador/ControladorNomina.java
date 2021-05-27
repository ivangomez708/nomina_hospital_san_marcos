/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nomina_hospital_san_marcos.controlador;

import com.nomina_hospital_san_marcos.modelo.Director;
import com.nomina_hospital_san_marcos.modelo.Facturador;
import com.nomina_hospital_san_marcos.modelo.TecSistemas;
import com.nomina_hospital_san_marcos.modelo.Trabajador;

/**
 *
 * @author Usuario
 */
public class ControladorNomina {
    public static  final int NUMERO_TRABADORES=5;
    public static  final double VALOR_HORA_DIRECTOR=25000;
    private Trabajador[] trabadores;
    private int contTrabador=0;
    
    public ControladorNomina() {
        trabadores= new Trabajador[NUMERO_TRABADORES];
       
        inicializarTrabajadores();
    }
    private void inicializarTrabajadores()
    {
        trabadores[0]= new TecSistemas("1193032582", "Ivan Gomez", 3000000, false);
    }
    
    public String adicionarTrajador(Trabajador trab)
    {
        if(contTrabador<NUMERO_TRABADORES)
        {
            trabadores[contTrabador]=trab;
            contTrabador++;
            return "Trabajador adicionado";
        }
        else
        {
          return "No puede adicionar mas trabadores";
        }   
    }
    public double calcularNomina()
    {
        double sumaSalarios=0;
        int totalHorasDirectores = this.sumarHorasTrabajadasDirectores();
        for(Trabajador trab : this.trabadores)
        { 
          double salarioCalculado=0;
          if( trab instanceof Director)
          {
              trab.calcularSalario(((Director) trab).getHorasTrabajas(), VALOR_HORA_DIRECTOR);
          }
          else if ( trab instanceof TecSistemas)
          {
              salarioCalculado = trab.getSalario();
          }
          else 
          {
            salarioCalculado = trab.calcularSalario(totalHorasDirectores, trab.getSalario());
          }
            if(!trab.isLicencia())
            {
                sumaSalarios = sumaSalarios + salarioCalculado;
            }
        }
        return sumaSalarios;
    }
    
    public int sumarHorasTrabajadasDirectores()
    {
        int totalHorasDirectores=0;
        for(Trabajador trab: this.trabadores)
        {
            if( trab instanceof Director)
            {
                totalHorasDirectores = totalHorasDirectores + ((Director) trab).getHorasTrabajas();
            }
        }
        
        return totalHorasDirectores;
    }

    public Trabajador[] getTrabadores() {
        return trabadores;
    }

    public int getContTrabador() {
        return contTrabador;
    }

    
}
