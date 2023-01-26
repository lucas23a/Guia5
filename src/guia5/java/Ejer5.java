/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.java;

import java.util.Scanner;

/**
 *Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 * @author Cristian
 */
public class Ejer5 {
    public static void main (String [] args){
    
        System.out.println("Ingrese un numero entero");
        Scanner leer = new Scanner (System.in);
        int num= leer.nextInt();
        int doble = num * 2;
        int triple = num *3 ;
        double raiz = Math.sqrt(num);
        System.out.println("El doble del numero ingresado es " + doble);
        System.out.println("El triple del numero ingresado es " + triple);
        System.out.println("La raiz cuadrada del numero ingresado es " + raiz);
        
        
    }
    
}
