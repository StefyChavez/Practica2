/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

/**
 *
 * @author ingen
 */
public class Celulares {
    public String marca;
    public String procesador;
    public int precio; 
    public String camara; 
    
    
    
       public static void main(String[] args) {
      
           Celulares celular1= new Celulares();
           celular1.marca="APPLE";
           celular1.precio= 990;
           
           Celulares celular2= new Celulares();
           celular2.camara="SONY";
           celular2.precio= 990;
           
           System.out.println("El precio del celular1 es: " + celular1.precio);
    }
}
