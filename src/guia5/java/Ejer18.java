/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.java;

import java.util.Scanner;

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 *
 * @author Cristian
 */
public class Ejer18 {
    public static void main (String[] args){
        int [][] matriz = new int [4][4];
        int [][] trans = new int [4][4];
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese los valores de la matriz");
        for (int i =0 ; i <4 ; i++){
            for (int j =0 ; j < 4 ; j++){
                matriz[i][j] = leer.nextInt();
            }
        }
        System.out.println("Matriz");
        for (int i =0 ; i <4 ; i++){
            for (int j =0 ; j < 4 ; j++){
                System.out.print(matriz[i][j]+ "\t");
            }
            System.out.println(" ");
        }
        System.out.println("Matriz transpuesta");
       for (int i =0 ; i <4 ; i++){
            for (int j =0 ; j < 4 ; j++){
                trans[j][i] = matriz[i][j];
            }
       }
        for (int i =0 ; i <4 ; i++){
            for (int j =0 ; j < 4 ; j++){
                System.out.print(trans[i][j]+ "\t");
            }
            System.out.println(" ");
       }
       
       
       
       
    }
}
