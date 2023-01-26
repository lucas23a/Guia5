/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.java;

/**
 * Realizar un algoritmo que rellene un vector con los 100 primeros números
 * enteros y los muestre por pantalla en orden descendente.
 *
 * @author Cristian
 */
public class Ejer15 {

    public static void main(String[] args) {

        int[] vector = new int[100];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
        }

        for (int i = 0; i < vector.length / 2; i++) {
            int temp = vector[i];
            vector[i] = vector[vector.length - 1 - i];
            vector[vector.length - 1 - i] = temp;

        }

        for (int elemento : vector) {
            System.out.println("[" + elemento + "]");
        }

    }
}
