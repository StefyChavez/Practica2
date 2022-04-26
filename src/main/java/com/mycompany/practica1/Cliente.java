/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

/**
 *
 * @author ingen
 */
public class Cliente {
    public String nombre;
    public String apellido;
    public int cedula;
    public int edad; 
     
    public static void main(String[] args) {
        
    Cliente cliente1=new Cliente ();   
    cliente1.nombre="Paula";
    cliente1.apellido="Pilataxi";
    
    
    Cliente cliente2= new Cliente();   
    cliente2.cedula=0105545065;
    cliente2.edad=21;
    System.out.println("El apellido del cliente 1 es: " +cliente1.apellido);
    
    }    
}





