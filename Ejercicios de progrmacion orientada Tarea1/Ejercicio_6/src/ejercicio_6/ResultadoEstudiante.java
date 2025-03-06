/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_6;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class ResultadoEstudiante {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la nota del estudiante: ");
        double nota = scanner.nextDouble(); // Usamos double para permitir decimales

        String resultado;

        if (nota >= 70) { // Puedes ajustar el valor de corte para aprobar
            resultado = "Aprobado";
        } else {
            resultado = "Reprobado";
        }

        System.out.println("\n" + nombre);
        System.out.println(nota);
        System.out.println(resultado);

        scanner.close();
    }
}