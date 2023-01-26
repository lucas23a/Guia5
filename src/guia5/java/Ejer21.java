/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.java;

import java.util.Random;
import java.util.Scanner;

/**
 * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la
 * matriz P de 3x3, se solicita escribir un programa en el cual se compruebe si
 * la matriz P está contenida dentro de la matriz M. Para ello se debe verificar
 * si entre todas las submatrices de 3x3 que se pueden formar en la matriz M,
 * desplazándose por filas o columnas, existe al menos una que coincida con la
 * matriz P. En ese caso, el programa debe indicar la fila y la columna de la
 * matriz M en la cual empieza el primer elemento de la submatriz P.
 *
 * @author Cristian
 */
public class Ejer21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[10][10];
        int[][] cubo = new int[3][3];
        Random aleatorio = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = aleatorio.nextInt(99 - 1 + 1);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cubo[i][j] = leer.nextInt();
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (cubo[0][0] == matriz[i][j]) {

                    for (int x = i; x < i + 3; x++) {
                        for (int y = j; y < j + 3; y++) {
                            for (int r = 0; r < 3; r++) {
                                for (int t = 0; t < 3; t++) {
                                    if (cubo[r][t] == matriz[x][y]) {
                                        System.out.println("el elemento se encuentra en la posicion " + (x) + (y));

                                    }

                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
