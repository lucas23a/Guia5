/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.java;

import java.util.Scanner;

/**Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 *
 * @author Cristian
 */
public class ejer1 {
    public static void main (String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero");    
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = leer.nextInt();
        int suma= num1 + num2;
        System.out.println("La suma de los numeros ingresados es igual a " + suma);
    
    }
    
}
