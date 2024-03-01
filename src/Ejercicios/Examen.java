package Ejercicios;

import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
       cargarManual(5);
    }
    //Ejercicio1
    public static void cargarManual(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese dato: ");
            vector[i] = scanner.nextInt();
        }
        mostarVec(vector); // Display the vector after loading the data
    }

    public static void mostarVec(int[] vector) {
        StringBuilder vectorForm = new StringBuilder("[");
        for (int i = 0; i < vector.length; i++) {
            vectorForm.append(vector[i]);
            if (i != vector.length - 1) {
                vectorForm.append(", ");
            }
        }
        vectorForm.append("]");
        System.out.println(vectorForm.toString());
    }
}
