package Ejercicios;

import java.util.Scanner;

public class Vector {

    //------METODOS AUXILIARES PARA CARGAR EL VECTOR------//

    //Cargar Vector Manualmente Poniendo Datos
    public void cargarVecMan(int[] vector) {
        Scanner datoEntrada = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite un valor: " + " ");
            vector[i] = datoEntrada.nextInt();
        }
    }

    //Cargar Vector Randomicamente
    public void cargarVecRan(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) ((Math.random() * 20) - 1);
        }
    }

    //Metodo Para Mostar un Vector
    public void mostarVec(int[] vector) {
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

    //2.Calcular la suma de elementos
    public int sumarEleVec(int[] vector) {
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];
        }
        return suma;
    }


    //4. Encontrar el número de ocurrencias
    public int numeroOcurrenciasVec(int[] vector, int numero) {
        int contOcurrencias = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numero) {
                contOcurrencias++;
            }
        }
        return contOcurrencias;
    }

    //6. 6. Verificar si el vector está ordenado
    public boolean verifOrdenadoVec(int[] vector) {
        for (int i = 0; i < vector.length - 1; i++) {
            if (vector[i] > vector[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //8. Eliminar duplicados
    public static void eliminarDuplicados(int[] vector) {

    }

}
