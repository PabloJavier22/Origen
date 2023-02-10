package segundo_trimestre.numeros_aleatorios;

import java.util.Scanner;

public class array_ejercicio3 {
    public static void main(String[] args){
        int i = 0;
        int[] orden = new int[10];
        Scanner es = new Scanner(System.in);
        while(i <= 9){
            System.out.print("numero de digitos introducidos "+i+" introduce el siguiente: ");
            orden[i] = es.nextInt();
            i++;
        }
        i = 9;
        System.out.print("Listado de numeros impresos en el sentido contrario al introducido: ");
        while(i>=0){
            System.out.print(" "+orden[i]);
            i--;
        }
    }
}
