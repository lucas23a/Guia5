/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.java;

import java.util.Scanner;

/**
 *Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 * @author Cristian
 */
public class Ejer10 {
    public static void main (String [] args){
      Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero para el limite");
        int num1 = leer.nextInt();
        int suma = 0 ;
        
        while (num1 > suma){
            System.out.println("Ingrese un numero para sumar");
            int num = leer.nextInt();
            suma= suma + num;
        }
    
        System.out.println(suma);
    
    
    }
    
}
