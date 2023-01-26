/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.java;

import java.util.Scanner;

/**
 *Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 * @author Cristian
 */
public class ejer8 {
    public static void main (String[] args){
        System.out.println("Ingrese palabra o frase de 8 caracteres");
     Scanner leer = new Scanner (System.in);
    String ochoc = leer.nextLine();
    
    if (8 == ochoc.length()){
        System.out.println("CORRECTO");
    }else{
        System.out.println("INCORRECTO");
    }

    
    
    
    
    
    }
    
}
