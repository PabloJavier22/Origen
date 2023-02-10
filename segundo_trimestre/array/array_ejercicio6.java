package segundo_trimestre.numeros_aleatorios;

import java.util.Scanner;

public class array_ejercicio6 {
    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
        int i = 0;
        int[] numero = new int[15];
        System.out.println("Escribe 15 numeros: ");
        while(i < 15){
            numero[i] = es.nextInt();
            i++;
        }
        int ultimo = numero[14];
        i= 14;

        while(i > 0){
            numero[i] = numero[i-1];
            i--;
        }

        numero[0] = ultimo;    
        i = 0;
    while(i < 15){
        System.out.print(numero[i]+" ");
        i++;
    }

    }
}
