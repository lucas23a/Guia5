/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.java;

import java.util.Scanner;

/**
 *Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 * @author Cristian
 */
public class Ejer11 {
    public static void main (String [] args){
     Scanner leer = new Scanner (System.in);
         System.out.println("Ingrese dos numeros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int resultado= 0;
        String resp= "n";
                
                
        do {        
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija opcion");
        
       int opc = leer.nextInt();
        
        switch (opc) {
            case 1: 
                resultado= num1 + num2;
                System.out.println("El resultado de la suma es " + resultado);
                break;
                
            case 2:
                resultado= num1 - num2;
                System.out.println("La resta de los numeros es igual a " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("La multiplicacion de los numero es igual a " + resultado);
                   break;
            case 4:
                resultado = num1 / num2 ;
                System.out.println("La division de los numeros es igual a " + resultado);
                break;
                
            case 5:    
                  System.out.println("¿Está seguro que\n" +
                   "desea salir del programa (S/N)?");
                  resp= leer.next();
                  if (resp.equalsIgnoreCase("S")){
                  break;
                  }
        }
        }while (resp.equalsIgnoreCase("n"));        
                  
        }
        
        
        
        
    }
    

