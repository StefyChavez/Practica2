/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_02;

/**
 *
 * @author admin
 */
public class Empleado {
    
    String nombre;
    int horasTrabajadas;
    double costoHora;
    int añoIngreso;
    
    public int calcularAño (int calcularAño){
        var retorno=10000;
                retorno=calcularAño-this.añoIngreso;
        return retorno;
    }
    
    public double calcularIngresos (int calcularAño,int añoIngreso){
        var retorno=1000000d;
        retorno=((0.02)*(calcularAño-añoIngreso)*(costoHora*horasTrabajadas)+(costoHora*horasTrabajadas));
        return retorno;
    }
    
    public double calcularBono (){
        var retorno =100000d;
        retorno=(horasTrabajadas-100)*(2*costoHora);
        return retorno;
    }
    
  
    int limite1 = 500;
    int limite2 = 1000;
    int limite3 = 2000;
    public double calcularImpuesto(int limite1, int limite2, int limite3){
        
        
        double ingresoBasico = costoHora*horasTrabajadas;
        if (ingresoBasico <= limite1){
            ingresoBasico = 0;
        }
        else{
            if(ingresoBasico>=limite1 && ingresoBasico<limite2){
                double Incremento1 = ingresoBasico*0.05;
                ingresoBasico = Incremento1;
            }
            else{
                if(ingresoBasico>=limite2 && ingresoBasico<limite3){
                    double Incremento2 = ingresoBasico*0.12;
                    ingresoBasico = Incremento2;
                }else{
                    double Incremento3 = ingresoBasico*0.25;
                    ingresoBasico = Incremento3;
                }
            }
        }
        return ingresoBasico;
        
    }
    
    public double calcularPago ( double calcularIngresos, double calcularImpuesto, double calcularBono){
        double Pago = (calcularIngresos + calcularBono) - calcularImpuesto;
        return Pago;
    }

}
