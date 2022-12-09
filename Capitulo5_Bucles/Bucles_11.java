package Capitulo5_Bucles;

import java.util.Scanner;

public class Bucles_11 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        int numero = es.nextInt();
        System.out.println("grado 1 | grado 2 | grado 3");
        System.out.println("---------------------------");
        for (int n = numero; n < numero + 5; n++){
            System.out.println("   "+n+"    |    "+n*n+"   |   "+n*n*n+" ");  
        }
    }
}
