package com.example;

import java.util.Scanner;

public class ejercicio4 {
        public static void main(String[] args) {
                
     Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe el radio; ");
        Double radio = entrada.nextDouble();


        Double Longitud = 2*3.14*radio;
        Double Area = 3.14*radio*radio;

        System.out.println("la longitud de la circunferencia es: " + Longitud);
        System.out.println("El area de la circunferencia es: " + Area);
        
        entrada.close();
        }
}
