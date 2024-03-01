package Ejercicios;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        cargarMan(matriz);
        mostrarMatriz(matriz);
        System.out.println(sumaDiagonales(matriz));
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
    //2.Diagonal principal de una matriz
    public static void  diagonalPrincipal(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (fila == columna) {
                    System.out.print(matriz[fila][columna] + " ");
                }
            }
        }

    }
    //4. Transposición de una matriz
    public static void transpuestaMatriz(int[][] matriz) {
        int[][] transpuesta = new int[matriz[0].length][matriz.length];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                transpuesta[columna][fila] = matriz[fila][columna];
            }
        }
        mostrarMatriz(transpuesta);
    }
    //6. Matriz identidad
    public static void matrizIdentidad(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (fila == columna) {
                    matriz[fila][columna] = 1;
                } else {
                    matriz[fila][columna] = 0;
                }
            }
        }
        mostrarMatriz(matriz);
    }
    //8. Verificar si una matriz es simétrica
    public static boolean verificarSimetrica(int[][] matriz){
        int[][] transpuesta = new int[matriz[0].length][matriz.length];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                transpuesta[columna][fila] = matriz[fila][columna];
            }
        }
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] != transpuesta[fila][columna]) {
                    return false;
                }
            }
        }
        return true;
    }
    //12. Encontrar el valor máximo en cada fila
    public static void maximoFila(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            int maximo = matriz[fila][0];
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] > maximo) {
                    maximo = matriz[fila][columna];
                }
            }
            System.out.println("El maximo de la fila " + fila + " es: " + maximo);
        }
    }
    //14. Intercambiar filas y columnas
    public static void intercambiarFilasColumnas(int[][] matriz) {
        int[][] intercambio = new int[matriz[0].length][matriz.length];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                intercambio[columna][fila] = matriz[fila][columna];
            }
        }
        mostrarMatriz(intercambio);
    }
    //20.20. Suma de diagonales excluyendo la principal y secundaria
    public static int sumaDiagonales(int[][] matriz) {
        int suma = 0;
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (fila != columna && fila + columna != matriz.length - 1) {
                    suma = suma + matriz[fila][columna];
                }
            }
        }
        return suma;
    }

}
