package segundo_trimestre.Funciones;
import Funciones.misFunciones.Matematicas;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("primer numero: ");
        double a = es.nextInt();
        System.out.print("segundo numero: ");
        double b = es.nextInt();
        System.out.println("multplicación: "+Matematicas.mutiplica(a,b));
    }
}
