package Capitulo4_Condicional;

import java.util.Scanner;

public class Capitulo4_5 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("Inserte valor de a: ");
        Double a = es.nextDouble();
        System.out.print("Inserte valor de b: ");
        Double b = es.nextDouble();

        if (a == 0)
        System.out.print("Error");
        else
        System.out.println("el resultado de ax + b = 0");
        Double x = (-b)/a;
        System.out.println("x = "+x);
    }
}
