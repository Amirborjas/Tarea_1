/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class ListaCompañeros {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String[] nombres = new String[10];

        System.out.println("Ingrese los nombres de los compañeros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Compañero " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        System.out.println("\nNombres de mis compañeros:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Compañero " + (i + 1) + ": " + nombres[i]);
        }

        scanner.close();
    }
}