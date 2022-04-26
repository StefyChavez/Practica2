/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

/**
 *
 * @author ingen
 */
public class casaca {
    public String color;
    public String tela;
    public int talla;
    public String marca;
    
    
      public static void main(String[] args) {
      
           casaca chaqueta1= new casaca();
           chaqueta1.color="verde";
           chaqueta1.talla=38;
           
           casaca chaqueta2= new casaca();
           chaqueta2.tela="algodon";
           chaqueta2.marca= "GAP";
           
           System.out.println("El color de la casaca es: " + chaqueta1.color);
           
    }
}
