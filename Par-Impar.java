package com.example;

import java.util.Scanner;

public class Par-Impar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         System.out.println("Escribe un numero entero");
        int num = entrada.nextInt();

        if (num%2 == 0){
            System.out.println("¡El numero es par!");
        }else{
            System.out.println("¡El numero es impar!");
            
            entrada.close();
        }
    }
}    
