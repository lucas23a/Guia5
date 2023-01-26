/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.java;

import java.util.Scanner;

/**
 *Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 * @author Cristian
 */
public class Ejer19 {
    public static void main (String[] args){
        int [][] matriz = new int [3][3];
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese los valores de la matriz");
        for (int i =0 ; i< 3; i++){
        for (int j=0 ; j <3 ; j++){
            System.out.print("Valor de la posicion " +i + " "+ j+ " ");
            matriz[i][j]= leer.nextInt();
            
        }
    }
        System.out.println(" ");
        
        for (int i =0 ; i< 3; i++){
        for (int j=0 ; j <3 ; j++){
            System.out.print("[" + matriz[i][j]+ "]");
          
            
        }
            System.out.println(" ");
    }
        boolean x= false;
        for (int i =0 ; i< 3; i++){
        for (int j=0 ; j <3 ; j++){
            if (matriz[i][j]== - matriz[j][i]){
                x= true;
            }
    }
        }   
        
         if (x== true){
            System.out.println("La matriz es antisimetrica");
        }else{
            System.out.println("La matriz NO es antisimetrica");
         }
        for (int i =0 ; i< 3; i++){
        for (int j=0 ; j <3 ; j++){
            System.out.print("[" + matriz[j][i]+ "]");
          
            
        }
            System.out.println(" ");
    }
        
        
         }  
        
    }

