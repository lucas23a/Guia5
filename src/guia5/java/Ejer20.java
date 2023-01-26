/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.java;

import java.util.Scanner;

/**
 *Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 * @author Cristian
 */
public class Ejer20 {
    public static void main (String[] args){
        Scanner leer = new Scanner (System.in);
        int [][] cubo = new int [3][3];
        boolean x = true;
        System.out.println("Ingrese valores del cubo");
        for (int i =0 ; i< 3; i++){
        for (int j=0 ; j <3 ; j++){
           cubo[i][j]= leer.nextInt();
            if ((cubo[i][j]> 9) || (cubo[i][j]< 0)){
            x= false;
            }
        }
    }
        if (x== true){
            //sumar filas
            int sumaf1= 0;
            int sumaf2=0;
            int sumaf3=0;
            
            for (int j=0 ; j <3 ; j++){
            sumaf1 = sumaf1 + cubo[0][j];
            sumaf2 = sumaf2 + cubo[1][j];
            sumaf3 = sumaf3 + cubo[2][j];
            }
            
            //sumar columnas
            int sc1=0;
            int sc2=0;
            int sc3=0;
            
            for (int i =0 ; i< 3; i++){
            sc1= sc1 + cubo[i][0];
            sc2= sc2 + cubo[i][1];
            sc3= sc3 + cubo[i][2];
            }
            
            //sumar diagonal 1
            int sd1=0;
            for (int i =0 ; i< 3; i++){
            sd1= sd1 + cubo [i][i];
            }
            
            //sumar diagonal 2
            int sd2=0;
            int i2=2;
            for (int i =0 ; i< 3; i++){
            sd2= sd2 + cubo[i][i2];
            i2--;
            }
            
            if ((sumaf1== 15) && (sumaf2==15) && (sumaf3==15) && (sc1==15) && (sc2==15) && (sc3==15)&& (sd1==15)&& (sd2==15)){
                System.out.println("Es un cubo magico");
            }else{
                System.out.println("No es magico");
            }
            
            
            
        }else{
            System.out.println("Hay valores fuera del rango 1-9");
        }
        
       
         for (int i =0 ; i< 3; i++){
        for (int j=0 ; j <3 ; j++){
            System.out.print("[" + cubo[i][j]+ "]");
        }
            System.out.println(" ");
    }
        
        
        
   
        
        
        
        
        
    }
    
}
