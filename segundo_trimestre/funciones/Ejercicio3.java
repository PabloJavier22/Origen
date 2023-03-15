package segundo_trimestre.Funciones;
import Funciones.misFunciones.Varios;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("primer numero: ");
        double a = es.nextInt();
        System.out.print("segundo numero: ");
        double b = es.nextInt();
    System.out.print("menor:"+Varios.menor(a,b));
}
}
