/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

/**
 *
 * @author ingen
 */
public class Zapatos {
    public String talla;
    public String modelo;
    public String color;
    public int precio ;
  
    
     public static void main(String[] args) {
     
         Zapatos zapatoDeportivo= new Zapatos();
         zapatoDeportivo.modelo="escalada";
         zapatoDeportivo.color="negro";
           
         Zapatos zapatoCasual= new Zapatos(); 
         zapatoCasual.modelo="tacones";
         zapatoCasual.color="rojo";
         
         
         System.out.println("El color del zapato es: " + zapatoDeportivo.color);
    }
}
