package Escaner;

import java.util.Scanner;

public class Escaner_1{
    //PabloJavier
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Introduce los numeros separados por un espacio: ");
        Double numero1 = e.nextDouble();
        Double numero2 = e.nextDouble();
        System.out.println ("la multiplicación da: "+numero1 * numero2);
        }
        
}