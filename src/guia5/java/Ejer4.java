/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.java;

import java.util.Scanner;

/**
 *Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author Cristian
 */
public class Ejer4 {
    public static void main (String[] args){
        System.out.println("Ingrese la temperatura del dia en °C");
     Scanner leer = new Scanner (System.in);
     double temp = leer.nextInt();
     double farh = 32 + (9* temp / 5);
     
        System.out.println("La temperatura en grados Fahrenheit es " + farh);
    }
}
