/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.java;

import java.util.Scanner;

/**
 *Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 * @author Cristian
 */
public class ejer2 {
    public static void main (String[] args){
    Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa tu nomre");
    String nombre = leer.nextLine();
        System.out.println("[" + nombre + "]" );
    
    }
    
}
