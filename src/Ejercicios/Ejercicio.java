package Ejercicios;

public class Ejercicio {
    public static void main(String[] args) {
        ejer10Sumatoria(15);
    }
    /*EJERCICIOS DE NUMEROS*/ //--> 10

    /*
        2. Serie Fibonacci
        Ejercicio: Genera los primeros N números de la serie Fibonacci.
        Ejemplo: Si N=5, la serie es 0, 1, 1, 2, 3.
     */
    public void ejer1(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " "); //estetica
            int suma = a + b;
            a = b;
            b = suma;
        }
    }


    /*
        6. Invertir un número
        Ejercicio: Escribe un programa que invierta los dígitos de un número N.
        Ejemplo: Si N=123, el número invertido es 321.
    */
    public int ejer3(int numero) {
        int numeroInvertido = 0;
        while (numero != 0) {
            int auxMod = numero % 10;
            numero = numero / 10;
            numeroInvertido = numeroInvertido * 10 + auxMod;
        }
        return numeroInvertido;
    }

    /*
        8. Máximo común divisor (MCD)
        Ejercicio: Encuentra el MCD de dos números A y B.
        Ejemplo: Si A=60 y B=48, entonces el MCD es 12.
     */

    public static int ejer4(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    /*SERIES*/
    /*
        6. 1, 4, 9, 16, 25 …
    */
    public void ejer6Serie(int numero) {
        for (int i = 1; i <= numero; i++) {
            System.out.print(i * i + " ");
        }
    }

    /*
        8. 1, 0, 1, 0, 1, 0, 1, 0, 1 …
    */
    public void ejer8Serie(int numero) {
        for (int i = 1; i <= numero; i++) {
            System.out.print(i % 2 + " ");
        }
    }

    /*SUMATORIA*/
    public void ejer2Sumatoria(int numero) {// muestra la sumatoria en formato de serie
        int a = 1, b = 4;
        for (int i = 0; i < numero; i++) {
            System.out.print(a + " ");
            int suma = a + b;
            a = b;
            b = suma;
        }
    }

    public static void ejer2SumatoriaSuma(int numero) {// muestra sumatoria y la suma total de esa sumatoria
        int a = 1, b = 4, suma = 0;
        for (int i = 1; i <= numero; i++) {
            System.out.print(a + " ");
            suma = suma + a;
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println("suma es : " + suma);
    }

    public static void ejer14Sumatoria(int numero) {
        int suma = 0;
        for (int i = 6; i <= numero; i *= 2) {
            suma += i;
        }
        System.out.println("La suma es: " + suma);
    }

    /*EJECICIOS DE CADENAS*/ //--> 10
    public void ejer2Cadenas(String cadena) {//invertir cadena
        String nuevaCad = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            nuevaCad = nuevaCad + cadena.charAt(i);
        }
        System.out.println(nuevaCad);
    }

    public void ejer4Cadenas(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isLetter(cadena.charAt(i))) {
                cadena = cadena.toUpperCase();
            }
        }
        System.out.println(cadena);
    }

    public String ejer6Cadenas(String cad1, String cad2) {
        return cad1 + cad2;
    }

    public String ejer8Cadenas(String cad, char oldCarac, char newCarac) {
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) == oldCarac) {
                cad = cad.replace(cad.charAt(i), newCarac);
            }
        }
        return cad;
    }

    public static char eje10Cadenas(String cadena) { // yapa
        char charFrecuente = ' ';
        int maxVeces = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char charActual = cadena.charAt(i);
            int cantVeces = 0;
            for (int j = 0; j < cadena.length(); j++) {
                if (cadena.charAt(j) == charActual) {
                    cantVeces++;
                }
            }
            if (cantVeces > maxVeces) {
                charFrecuente = charActual;
                maxVeces = cantVeces;
            }
        }
        return charFrecuente;
    }

    /*6 EJERCICIOS MAS DE NUMEROS*/
    public static void ejer12Series(int numero) {
        for (int i = 1; i <= numero; i += 3) {
            System.out.print(i + " ");
        }
    }

    public static void ejer14Series(int numero) {
        for (int i = 1; i <= numero; i++) {
            System.out.print((int) Math.pow(3, i) + " ");
        }
    }
    public static void ejer16Series(int numero) {
        int numDecreciente = numero;
        int numCreciente = 1;
        while (numDecreciente >= numCreciente) {
            System.out.print(numDecreciente + " ");
            if (numDecreciente > numCreciente) {
                System.out.print(numCreciente + " ");
            }
            numDecreciente--;
            numCreciente++;
        }
    }

    public static void ejer4Sumatoria(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero; i += 2) {
            int producto = i * (i + 1);
            System.out.print(i + " x " + (i + 1));
            if (i < numero - 1) {
                System.out.print(" + ");
            }
            suma += producto;
        }
        System.out.println("La suma total es: " + suma);
    }
    public static void ejer6Sumatoria(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            int producto = i * (2 * i - 1);
            System.out.print(i + " x " + (2 * i - 1));
            if (i < numero) {
                System.out.print(" + ");
            }
            suma += producto;
        }
        System.out.println("La suma total es: " + suma);
    }
    public static void ejer8Sumatoria(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero; i += 2) {
            int cuadrado = i * i;
            System.out.print(i + "^2");
            if (i < numero - 1) {
                System.out.print(" + ");
            }
            suma += cuadrado;
        }
        System.out.println("\nLa suma total es: " + suma);
    }

    //ejercicio que faltaba
    public static void ejer10Sumatoria(int terminos) {
        int maximoActual = 1;
        int numeroActual = 1;

        for (int i = 0; i < terminos; i++) {
            System.out.print(numeroActual + " ");
            if (numeroActual == maximoActual) {
                numeroActual = 1;
                maximoActual++;
            } else {
                numeroActual++;
            }
        }
    }
}
