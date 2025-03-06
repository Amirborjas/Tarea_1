/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;

public class DatosCompañeros {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        // Número de compañeros
        System.out.print("Ingrese el número de compañeros: ");
        int numCompañeros = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        // Declaración del arreglo multidimensional
        String[][] datosCompañeros = new String[numCompañeros][4];

        // Ingreso de datos
        for (int i = 0; i < numCompañeros; i++) {
            System.out.println("\nIngrese los datos del compañero " + (i + 1) + ":");

            System.out.print("Nombre: ");
            datosCompañeros[i][0] = scanner.nextLine();

            System.out.print("Apellido: ");
            datosCompañeros[i][1] = scanner.nextLine();

            System.out.print("Carrera: ");
            datosCompañeros[i][2] = scanner.nextLine();

            System.out.print("Lugar de Trabajo: ");
            datosCompañeros[i][3] = scanner.nextLine();
        }

        // Mostrar datos
        System.out.println("\nDatos de los compañeros:");
        for (int i = 0; i < numCompañeros; i++) {
            System.out.println("\nCompañero " + (i + 1) + ":");
            System.out.println("Nombre: " + datosCompañeros[i][0]);
            System.out.println("Apellido: " + datosCompañeros[i][1]);
            System.out.println("Carrera: " + datosCompañeros[i][2]);
            System.out.println("Lugar de Trabajo: " + datosCompañeros[i][3]);
        }

        scanner.close();
    }
}