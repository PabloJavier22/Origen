package Capitulo5_Bucles;

import java.util.Scanner;

public class Bucles_25 {
    public static void main(String[] args){
    Scanner es = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int numero = es.nextInt();
    int reves = 0;
    while(numero > 0){
        reves = (reves*10) + (numero%10);
        numero = numero/10;
    }
    System.out.print(reves);
    }
}
