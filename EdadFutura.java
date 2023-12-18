package com.example;

import java.util.Scanner;

public class EdadFutura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edadactual = scanner.nextInt();

        int edadfutura = edadactual + 5;

        System.out.println(nombre + " dentro de 5 años tendrás " + edadfutura + " años.");

        scanner.close();
    }
}
