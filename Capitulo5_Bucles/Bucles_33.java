package Capitulo5_Bucles;

import java.util.Scanner;
public class Bucles_33 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        int tamaño = es.nextInt();
        int contador = 2;
        while (tamaño > contador-1){
            System.out.print("* ");
            int i ;
            for(i = 1; i < tamaño; i++){
                System.out.print("   ");
            }
            System.out.println(" *");
            contador++;
        }
            System.out.print("  ");
            int i ;
            for(i = 1; i < tamaño-1; i++){
                System.out.print(" * ");
            }
            System.out.println("  ");
            contador++;
        }
    }
