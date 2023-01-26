/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.java;

import java.util.Scanner;

/**
 * 13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
 * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo
 * siguiente:
 *
 * @author Cristian
 */
public class Ejer13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado");
        int num = leer.nextInt();

        //linea superior
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println("");

        //medio
        for (int i = 0; i < num - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < num - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        //linea inferior
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println("");

    }

}
