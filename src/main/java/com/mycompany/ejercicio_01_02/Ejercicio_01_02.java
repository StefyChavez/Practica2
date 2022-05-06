/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_01_02;

/**
 *
 * @author admin
 */
public class Ejercicio_01_02 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        var empleado1 = new Empleado();
         empleado1.nombre="Juan";
         empleado1.horasTrabajadas=100;
         empleado1.costoHora=6d;
         empleado1.añoIngreso=2010;
         
         System.out.println("El empleado " + empleado1.nombre + " tiene "
         + empleado1.calcularAño(2022) + " años de antigüedad en la empresa.");
         System.out.println("El ingreso basico del empleado "+empleado1.nombre +  
                            " " + empleado1.calcularIngresos(2022,2010));
         System.out.println("El bono para el empleado es de: " + empleado1.calcularBono());
         System.out.println("El Impuesto es de:" + empleado1.calcularImpuesto(500, 1000, 2000));
         double calcularIngresos = empleado1.calcularIngresos(2022,2010);
         double calcularImpuesto = empleado1.calcularImpuesto(500,1000,2000);
         double calcularBono1 = empleado1.calcularBono();
         System.out.println("El Pago Total es de:" + empleado1.calcularPago(calcularIngresos, calcularImpuesto,calcularBono1));
         
         
         
         
         var empleado2= new Empleado();
         empleado2.nombre="Mariana";
         empleado2.horasTrabajadas=200;
         empleado2.costoHora=5d;
         empleado2.añoIngreso=2020;
         
         System.out.println("La empleada: " + empleado2.nombre + " tiene "
         + empleado2.calcularAño(2022) + " anos de antiguedad en la empresa.");
         System.out.println("El ingreso basico del empleado "+empleado2.nombre + 
                            " " + empleado2.calcularIngresos(2022,2020));
         System.out.println("El bono para el empleado es de: " + empleado2.calcularBono());
         System.out.println("El Impuesto es de:" + empleado2.calcularImpuesto(500, 1000, 2000));
         double calcularIngresos1 = empleado2.calcularIngresos(2022,2020);
         double calcularImpuesto1 = empleado2.calcularImpuesto(500,1000,2000);
         double calcularBono2 = empleado2.calcularBono();
         System.out.println("El Pago Total es de:" + empleado2.calcularPago(calcularIngresos1, calcularImpuesto1,calcularBono2));
         
         
         
         
         
         var empleado3 = new Empleado();
         empleado3.nombre="Carlos";
         empleado3.horasTrabajadas=150;
         empleado3.costoHora=8d;
         empleado3.añoIngreso=2018;
                
                
         System.out.println("El empleado " + empleado3.nombre + " tiene "
         + empleado3.calcularAño(2022) + " anos de antiguedad en la empresa.");
         System.out.println("El ingreso basico del empleado "+empleado3.nombre +
                            " " + empleado3.calcularIngresos(2022,2018));
         System.out.println("El bono para el empleado es de: " + empleado3.calcularBono());
         System.out.println("El Impuesto es de:" + empleado3.calcularImpuesto(500, 1000, 2000));
         double calcularIngresos2 = empleado3.calcularIngresos(2022,2018);
         double calcularImpuesto2 = empleado3.calcularImpuesto(500,1000,2000);
         double calcularBono3 = empleado3.calcularBono();
         System.out.println("El Pago Total es de:" + empleado3.calcularPago(calcularIngresos2, calcularImpuesto2,calcularBono3));
    }
}
