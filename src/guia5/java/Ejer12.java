/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.java;

import java.util.Scanner;

/**
 *Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 * @author Cristian
 */
public class Ejer12 {
    public static void main (String[] args){
    Scanner leer = new Scanner (System.in);
    String cadena;
    String cadena2 = "&&&&&";
    int cont1= 0;
    int cont2=0;
     do {
         System.out.println("Ingrese el codigo");
         cadena= leer.next();
         if(cadena.equalsIgnoreCase("&&&&&")){
         break;
         }

    if (cadena.length() > 4){
        
        String primera = cadena.substring(0,1);
        String ultima = cadena.substring(4);
    
        
        if ((primera.equalsIgnoreCase("x")) && (ultima.equalsIgnoreCase("o"))){
        cont1++;
        
        }else{
        cont2++;
        }        
       
        
    }else{
    cont2++;
    }
    
    
    
     }while (cont1< 1000000);
        
    
        System.out.println("Lecturas correctas: " + cont1);
        System.out.println("Lecturas incorrectas: " + cont2);
    
    }
    
}
