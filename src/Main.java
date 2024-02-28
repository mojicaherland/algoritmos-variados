import Ejercicios.Ejercicio;
import Ejercicios.Matrices;
import Ejercicios.Vector;

public class Main {
    public static void main(String[] args) {
//        /*Numeros*/
//        Ejercicio n = new Ejercicio();
//        n.ejer1(4);
//        System.out.println(n.ejer3(123));
//        System.out.println(n.ejer4(60, 48));
//        n.ejer6Serie(5);
//        n.ejer8Serie(5);
//        n.ejer2Sumatoria(6);
//        n.ejer2SumatoriaSuma(6);
//        n.ejer14Sumatoria(5);
//
//        /*CADENAS*/
//        n.ejer2Cadenas("hola");
//        n.ejer4Cadenas("hola");
//        System.out.println(n.ejer6Cadenas("hola", "mundo"));
//        System.out.println(n.ejer8Cadenas("hola", 'a', 'e'));
//        System.out.println(n.eje10Cadenas("hola"));
//
//        /*MAS EJERCICIOS DE NUMEROS*/
//        n.ejer12Series(5);
//        n.ejer14Series(5);
//        n.ejer16Series(6);
//        n.ejer4Sumatoria(8);
//        n.ejer6Sumatoria(5);
//        n.ejer8Sumatoria(8);
//        n.ejer10Sumatoria(9);

        /*VECTORES*/
        Vector n = new Vector();
        int[] vector = new int[3];
        int[] vector2 = new int[2];
        n.cargarVecMan(vector);
        n.cargarVecMan(vector2);
        n.mostarVec(vector);
        n.mostarVec(vector2);
        n.unirVectores(vector,vector2);

        /*MATRICES*/
        Matrices matrices = new Matrices();
        int[][] matriz = new int[3][3];

    }
}