import Ejercicios.Ejercicio;

public class Main {
    public static void main(String[] args) {
        /*Numeros*/
        Ejercicio n = new Ejercicio();
        //n.ejer1(4);
        //n.ejer2(10);
        //System.out.println(n.ejer3(123));
//        System.out.println(n.ejer4(60,48));

        /*CADENAS*/
        n.ejer2Cadenas("hola");
        n.ejer4Cadenas("hola");
        System.out.println(n.ejer6Cadenas("hola","mundo"));
        System.out.println(n.ejer8Cadenas("hola",'a','e'));
        System.out.println(n.eje10Cadenas("hola"));

    }
}