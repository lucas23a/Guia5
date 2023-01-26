/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.java;

import java.util.Scanner;

/**
 * Escriba un programa que pida una frase o palabra y valide si la primera letra
 * de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
 * imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se
 * deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y
 * equals() de Java.
 *
 * @author Cristian
 */
public class Ejer9 {

    public static void main(String[] args) {
        System.out.println("Ingrese una palabra o frase que empieze con A ");
        Scanner leer = new Scanner(System.in);
        String cadena = leer.nextLine();
        String letra = cadena.substring(0, 1);

        if (letra.equalsIgnoreCase("a")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

    }

}
