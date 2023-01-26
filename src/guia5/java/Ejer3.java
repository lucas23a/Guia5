/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.java;

import java.util.Scanner;

/**Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 *
 * @author Cristian
 */
public class Ejer3 {
  public static void main (String [] args){
  
      Scanner leer = new Scanner (System.in);
      System.out.println("Ingrese una frase");
      String frase = leer.nextLine();
      String may;
      String min;
              
      // se cambia todo a mayusculas
     // frase = frase.toUpperCase();
      
     may= frase.toUpperCase();
     min= frase.toLowerCase();
     
       System.out.println(may);
      System.out.println(min);
     
  
  }    
    
    
    
}
