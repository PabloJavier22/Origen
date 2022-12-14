package Capitulo5_Bucles;

import java.util.Scanner;

public class Bucles_37 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int numero = es.nextInt();

        int i = numero;
        int caracter = 0;
        int reves = 0;

        while (i > 0){
            reves = reves*10 + i%10;
            i = i/10;
            caracter++;
        }

        int valor = 0;

        for(int n = 0; n < caracter; n++){
            valor = reves%10;
            reves = reves/10;
                for(int j = 0; j < valor; j++){
                    System.out.print("|");
                }
                if(i < caracter-1){
                    System.out.print("-");
                }
        }
    }
}
