/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

/**
 *
 * @author ingen
 */
public class Carro {
 public String placa;
 public String color;
 public String marca;
 public String transmision; 
    
 
   public static void main(String[] args) {
      
           Carro auto1= new Carro();
           auto1.color= "rojo";
           auto1.marca="amarillo";
           
           Carro auto2= new Carro();
           auto2.color= "rojo";
           auto2.marca="amarillo";
           
           System.out.println("El color del carro es: " +auto1.color);
    }
}
