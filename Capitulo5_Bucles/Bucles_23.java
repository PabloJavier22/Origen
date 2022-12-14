package Capitulo5_Bucles;

import java.util.Scanner;

public class Bucles_23 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;
        while(suma < 10000){
            System.out.print("Introduzca un numero");
            numero = es.nextInt();
            suma = suma + numero;
            contador++;
        }
        System.out.println("total acumulado = "+suma);
        System.out.println("contador de numeros = "+contador);
        System.out.println("media = "+suma/contador);
    }
}
