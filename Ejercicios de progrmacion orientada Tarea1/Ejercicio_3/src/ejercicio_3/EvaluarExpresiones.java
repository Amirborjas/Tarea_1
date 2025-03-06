/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

/**
 *
 * @author Usuario
 */
public class EvaluarExpresiones {
    public static void main(String[] args) {
        int M = 6;
        int T = 1;
        int K = -10;

        // Evaluar las expresiones y mostrar los resultados
        System.out.println("M > T: " + (M > T));
        System.out.println("T / K == -5: " + (T / K == -5));
        System.out.println("(M+T == 7) || (M-T == 5): " + ((M+T == 7) || (M-T == 5)));
    }
}
