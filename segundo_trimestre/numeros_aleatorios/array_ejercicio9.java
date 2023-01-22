package segundo_trimestre.numeros_aleatorios;

import java.util.Scanner;

public class array_ejercicio9 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        int num[] = new int[8];
        int i = 0;

        System.out.println("Introduce 8 numeros enteros");
        while(i < 8){
            num[i] = es.nextInt();
            i++;
        }
        i = 0;
        System.out.println("-------------------");
        while(i < 8){
            System.out.print(num[i]);
            if(num[i]%2 == 0){
                System.out.println(" par");
            }
            if(num[i]%2 != 0){
                System.out.println(" impar");
            }
            i++;
        }
    
    }
}
