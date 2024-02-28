package Ejercicios;

import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {
        Vector n = new Vector();
        int[] vector = new int[5];
        n.cargarVecMan(vector);
        n.mostarVec(vector);
        System.out.println(n.palindromo(vector));
    }

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
    public void eliminarDuplicados(int[] vector) {
        int n = vector.length;//longitud del vector
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (vector[i] == vector[j]) {
                    int k = j;
                    while (k < n - 1) {
                        vector[k] = vector[k + 1];
                        k++;
                    }
                    n--;
                    j--;
                }
            }
        }
        //Crea un nuevo vector con la longitud correcta
        int[] nuevoVector = new int[n];
        for (int i = 0; i < n; i++) {
            nuevoVector[i] = vector[i];
        }
        mostarVec(nuevoVector);
    }

    //10. Unir dos vectores
    public void unirVectores(int[] vec1, int[] vec2) {
        int[] nuevoVec = new int[vec1.length + vec2.length];
        int i = 0;
        //copiando elementos del vec1 al nuevoVec
        for (i = 0; i < vec1.length; i++) {
            nuevoVec[i] = vec1[i];
        }
        //copiando elementos del vec2 al nuevoVec desde el indice i que se quedo
        for (int j = 0; j < vec2.length; j++, i++) {
            nuevoVec[i] = vec2[j];
        }
        mostarVec(nuevoVec);
    }

    //12.Diferencia de vectores
    public void diferenciaVectores(int[] vec1, int[] vec2) {
        int[] vec3 = new int[vec1.length];
        int k = 0;
        for (int i = 0; i < vec1.length; i++) {
            boolean found = false;
            for (int j = 0; j < vec2.length; j++) {
                if (vec1[i] == vec2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                vec3[k] = vec1[i];
                k++;
            }
        }
        // Crear un nuevo array con la longitud correcta
        int[] resultado = new int[k];
        System.arraycopy(vec3, 0, resultado, 0, k);
        mostarVec(resultado);
    }

    //14.Mayor diferencia entre elemenos adyacentes

    //16.Multiplicar elementos del vector
    public int multiElementos(int[] vector) {
        int mult = 1;
        for (int i = 0; i < vector.length; i++) {
            mult = mult * vector[i];
        }
        return mult;
    }

    //18.Determinar si un vector es palindromo

    //funcion auxiliar --> invertir un vector
    public int[] invertirVec(int[] vector) {
        int[] vecAux = new int[vector.length];
        int j = 0;
        for (int i = vector.length - 1; i >= 0; i--) {
            vecAux[j] = vector[i];
            j++;
        }
        return vecAux;
    }

    public boolean palindromo(int[] vector) {
        int[] vecInvertido = invertirVec(vector);
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != vecInvertido[i]) {
                return false;
            }
        }
        return true;
    }

    //20. Determinar si un vector contiene un subconjunto que sume un valor dado
    public boolean subconjuntoVec(int[] vector,int numero){
        //FALTA COMPLETAR
        return true;
    }
}
