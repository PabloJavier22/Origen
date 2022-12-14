package Capitulo5_Bucles;

import java.util.Scanner;

public class Bucles_21 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("introduce el primer numero");
        int numero = es.nextInt();
        int contador = 0;
        int alto = 0;
        int med = 0;
        int contador2 = 0;
        int  inpar = 0;

        while(numero >= 0){
            contador++;
        if(numero%2 == 0){

            if(alto < numero){
                alto = numero;
            }
        }
        else{
            inpar = inpar + numero;
            contador2++;
            med = inpar/contador2;
        }
        System.out.print("introduce un numero");
        numero = es.nextInt();
        }
        System.out.println("el numero par mas alto ingrsado es "+alto+" la media de los impares es "+med);
    }
}
