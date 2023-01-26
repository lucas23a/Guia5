/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.java;

import java.util.Scanner;

/**
 *Crear un programa que dado un numero determine si es par o impar.
 * @author Cristian
 */
public class Ejer6 {
    public static void main (String[] args){
        System.out.println("Ingrese un numero");
        Scanner leer = new Scanner (System.in);
        int num = leer.nextInt();
        
        if (num%2 ==0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
           
    
    }
}
