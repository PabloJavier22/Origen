package Escaner;

import java.util.Scanner;

public class Escaner_6 {
    //PabloJavier
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("Escribe valor de la base: ");
        Double base = es.nextDouble();
        System.out.print("Escrible el valor de la altura: ");
        Double altura = es.nextDouble();
        System.out.println("El area del triangulo es: "+ ((base * altura)/ 2 ));
    }
}
