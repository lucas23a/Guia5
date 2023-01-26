/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.java;

import java.util.Scanner;

/**
 *Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 * @author Cristian
 */
public class Ejer14 {
    public static void main (String[] args){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de euros");
        int euros = leer.nextInt();
        System.out.println("A que moneda desea cambiarlos?");
        System.out.println("dolar - yen - libra");
        String moneda = leer.next();
        
        
        exchange(euros,moneda);
        
    }
    
    public static void exchange(int euros, String moneda){
        double total=0 ;
        boolean x = true;
                
                switch (moneda){
            case "yen":
                total = euros * 129.8522;
                break;
            case "dolar":
                total = euros * 1.28611;
                break;
            case "libra": 
                total= euros* 0.86;
                break;
                
            default: 
                x= false;
                System.out.println("Opcion no valida");
        }
            if(x == true){
           System.out.println("El total a cambiar es de " + total);  
            }
    }
    
}
