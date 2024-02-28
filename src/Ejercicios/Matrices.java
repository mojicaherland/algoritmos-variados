package Ejercicios;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        cargarRan(matriz);
        mostrarMatriz(matriz);
        System.out.println(sumarEleMatriz(matriz));
    }

    //METODOS AUXILIARES

    //Cargar matriz manualmente
    public static void cargarMan(int[][] matriz) {
        Scanner datoEntrada = new Scanner(System.in);
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print("Ingrese valor: ");
                matriz[fila][columna] = datoEntrada.nextInt();
            }
        }
    }


    //Cargar matriz randomicamente
    public static void cargarRan(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = (int) ((Math.random() * 20) - 1);
            }
        }
    }

    //Mostar matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            System.out.print("|");
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(" " + matriz[fila][columna] + " ");
            }
            System.out.println("|");
        }
    }

    //1.Sumar elementos de una matriz
    public static int sumarEleMatriz(int[][] matriz) {
        int suma = 0;
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                suma = suma + matriz[fila][columna];
            }
        }
        return suma;
    }
}
