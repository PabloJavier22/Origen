package Capitulo5_Bucles;

import java.util.Scanner;

public class Bucles_39 {
    public static void main(String[] args){
    Scanner es = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    
    int numero = es.nextInt();
    int i = 0;
    int fact = 1;

    while(i < numero){
        i++;
        fact = fact*i;
        System.out.println(i+"! = "+fact);
    }
    }
}
