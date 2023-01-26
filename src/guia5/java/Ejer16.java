/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.java;

import java.util.Scanner;

/**
 *Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 * @author Cristian
 */
public class Ejer16 {
    public static void main (String[] args){
         Scanner leer = new Scanner (System.in);
        int [] vector = new int[6];
        boolean x = false;
        System.out.println("Ingrese los numeros del vector");
        for (int i = 0 ; i< vector.length; i++){
            vector[i]= leer.nextInt();
        }
        System.out.println("Que elemento desea buscar");
           int num = leer.nextInt();
           
        for (int i = 0 ; i< vector.length; i++){
            if (num == vector[i]) {
                x= true;
                System.out.println("El numero se encuentra en la posicion " + i + " del vector");
            }
        }
       if ( x == false) {
           System.out.println("El elemento no se encuentra en el vector"); 
       }
        
    }
}
