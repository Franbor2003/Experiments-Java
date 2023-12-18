package com.example;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe tu nota");
        double nota = entrada.nextDouble();

        if (nota<0 || nota>10){
            System.out.println("Nota errónea");
        }else if (nota<5){
            System.out.println("Insuficiente");
        }else if (nota>=5 && nota<6){
            System.out.println("Suficiente");
        }else if (nota>=6 && nota<7){
            System.out.println("Bien");
        }else if (nota>=7 && nota<9){
            System.out.println("Notable");
        }else if (nota>9 && nota<10){
            System.out.println("Sobresaliente");
        }else if (nota==10)
            System.out.println("Matrícula de honor");

            entrada.close();
    }
}
