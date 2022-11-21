package Escaner;

import java.util.Scanner;

public class Escaner_7 {
    //PabloJavier
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("Introduzca la base imponible: ");
        double baseImponible = es.nextDouble();
        System.out.printf("Total: " +(baseImponible * 1.21));
    }
}
