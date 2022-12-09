package Capitulo5_Bucles;

import java.util.Scanner;

public class Bucles_9 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("Escirbe un numero: ");
        int numero = es.nextInt();
        int maximo = 1;
        int digitos = 0;
        while(maximo <= numero){
            digitos++;
            maximo = maximo * 10;
        }
        System.out.println("El numero tiene "+digitos+" dígitos");
    }
}
