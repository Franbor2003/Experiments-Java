package com.example;

import java.util.Scanner;

public class ejemplo3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Ingrese su nombre: ");
      String nombre = scanner.nextLine();

      System.out.print("Ingrese su apellido: ");
      String apellido = scanner.nextLine();

      System.out.print("Ingrese su edad: ");
      int edad = scanner.nextInt();

      String tipoedad;
      if (edad >= 18) {
        tipoedad = "mayor de edad";
      } else {
        tipoedad = "menor de edad";
      }

      System.out.println("Hola " + nombre + " " + apellido + ", eres " + tipoedad + ".");

      scanner.close();
    }
}
