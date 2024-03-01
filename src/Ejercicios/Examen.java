package Ejercicios;

import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
       //cargarManual(5);
        cargarMan(matriz);
        mostrarMatriz(matriz);
        System.out.println("La suma de las orillas es: " + sumarOrillas(matriz));
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

    /*Matriz*/
    public static void cargarMan(int[][] matriz) {
        Scanner datoEntrada = new Scanner(System.in);
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print("Ingrese valor: ");
                matriz[fila][columna] = datoEntrada.nextInt();
            }
        }
    }
    public static void mostrarMatriz(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            System.out.print("|");
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(" " + matriz[fila][columna] + " ");
            }
            System.out.println("|");
        }
    }
    //Ejercicio 2. Sumar orillas de una matriz y retornar la suma
    public static int sumarOrillas(int[][] matriz) {
        int suma = 0;
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (fila == 0 || fila == matriz.length - 1 || columna == 0 || columna == matriz[fila].length - 1) {
                    suma = suma + matriz[fila][columna];
                }
            }
        }
        return suma;
    }
}
