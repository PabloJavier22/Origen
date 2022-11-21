package Escaner;

import java.util.Scanner;

public class Escaner_4 {
        //PabloJavier
        public static void main(String[] args){
            Scanner es = new Scanner(System.in);
            System.out.print("Escribe el primer numero: ");
            Double numero1 = es.nextDouble();
            System.out.print("Escribe el segundo numero: ");
            Double numero2 = es.nextDouble();
            System.out.println(numero1 + numero2);
            System.out.println(numero1 * numero2);
            System.out.println(numero1 / numero2);
        }
}
