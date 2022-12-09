package Capitulo5_Bucles;

import java.util.Scanner;

public class Bucles_10 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        int positivo = 0;
        int negativo = 1;
        int media = 0;
            while(negativo == 1){
                System.out.print("Introduce el numero: ");
                int numero = es.nextInt();
                if(numero >= 0){
                    positivo++;
                    media = media + numero;
                }
                else
                    negativo++;
            }
        System.out.println("La media es "+media/positivo);
    }
}
