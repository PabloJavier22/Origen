package Capitulo5_Bucles;

import java.util.Scanner;

public class Bucles_41 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("introduce un numero positivo: ");
        long numero = es.nextLong();
        int par = 0;
        int inpar = 0;
        long memoria = numero;

        while (numero > 0){
            if ((numero%10)%2 == 0){
                par++;
            }
            else{
                inpar++;
            }
            numero = numero/10;
        }   
        System.out.print("el "+memoria+" contiene "+par+" pares "+inpar+" inpar");
    }
}