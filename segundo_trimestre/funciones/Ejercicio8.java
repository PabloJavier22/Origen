package Funciones;
import java.util.Scanner;
import Funciones.misFunciones.Matematicas;

public class Ejercicio8 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("Introduce el numero: ");
        int x = es.nextInt();
        System.out.print("Sumatoria de rango 1 a n: "+Matematicas.sumaelrango(x));
        System.out.print("\nMultiplicación de los numeros de rango 1 a n: "+Matematicas.productodelrango(x));
        System.out.print("\nValor intermedio entre 1 y n: "+Matematicas.valorintermedio(x));
    }
}
