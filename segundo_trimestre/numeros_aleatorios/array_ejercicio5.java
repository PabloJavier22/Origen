package segundo_trimestre.numeros_aleatorios;

import java.util.Scanner;

public class array_ejercicio5 {
    
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        int i = 0;
        int[] numero = new int[10];
        System.out.println("Introduce 10 numeros: ");
        numero[0] = es.nextInt();
        int maximo = numero[0];
        int minimo = numero[0];
        i++;
        while(i<=9){
            numero[i] = es.nextInt();
            if(numero[i] > maximo){
                maximo = numero[i];
            }
            if(numero[i] < minimo){
                minimo = numero[i];
            }
            i++;
        }
        System.out.print("\n");
        i = 0;
        System.out.println("Listado final:");
        while(i <= 9){
            System.out.print(numero[i]);
            if(numero[i] == maximo){
                System.out.print(" maximo");
            }
            if(numero[i] == minimo){
                System.out.print(" minimo");
            }
            System.out.print("\n");
            i++;
        }
    }
}
