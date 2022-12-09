package Capitulo5_Bucles;

import java.util.Scanner;

public class Bucles_15 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("Introduzca la base: ");
        int base = es.nextInt();
        System.out.print("Introduce el exponente: ");
        int exponente = es.nextInt();
        int potencia = 1;

        if (exponente == 0){
            potencia = 1;
        }

        if (exponente > 0){
            for (int i = 0; i < exponente; i++){
                potencia *= base;
            }
        }

        if (exponente < 0){
            for (int i = 0; i < -exponente; i++){
                potencia *= base;
            }
            potencia = 1/potencia;
        }
        System.out.println(base+"^"+exponente+" = "+potencia);
    }
    
}
