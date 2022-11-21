package Escaner;

import java.util.Scanner;

public class Escaner_5 {
      //PabloJavier
      public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("Escribe el primer numero: ");
        Double lado1 = es.nextDouble();
        System.out.print("Escrible el segundo numero: ");
        Double lado2 = es.nextDouble();
        System.out.println("El area del cuadrado es: "+ (lado1 * lado1 * lado2 * lado2));  
    }
}
