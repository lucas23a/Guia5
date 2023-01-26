/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.java;

import java.util.Scanner;

/**
 *Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 * @author Cristian
 */
public class Ejer17 {
    public static void main (String [] args){
        int [] vector = new int [6];
        Scanner leer = new Scanner (System.in);
        int und = 0;
        int dosd= 0;
        int tresd= 0;
        int cuad=0;
        int cincd= 0;
        
        System.out.println("Ingrese los valores del vector");
        for (int i = 0 ; i< vector.length ; i++) {
            vector[i]= leer.nextInt();
            if (vector [i] < 10){
                und++;
            }else if (vector[i] < 100){
            dosd++;
        }else if ((vector[i]> 99) && (vector[i]<1000)){
            tresd++;
        }else if ((vector[i]> 999) && (vector[i] < 10000)){
            cuad++;
        }else if ((vector[i]> 9999) && (vector[i] < 100000)){
            cincd++;
        }
            
        }
        
        System.out.println("Los numeros de un digito son " + und);
         System.out.println("Los numeros de dos digitos son " + dosd);
         System.out.println("Los numeros de tres digitos son " + tresd);
        System.out.println("Los numeros de cuatro digitos son " + cuad);
        System.out.println("Los numeros de cinco digitos son " + cincd);
        
        
        
    }
}
