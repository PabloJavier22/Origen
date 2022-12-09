package Capitulo5_Bucles;

import java.util.Scanner;

public class Bucles_19 {
    public static void main(String[] args){
       Scanner es = new Scanner(System.in);
        System.out.print("caracter: "); 
        String hola = es.nextLine();

        System.out.print("altura: ");
        int altura = es.nextInt();

        int fila = 1;
        int columnas = 1;
        int espacio = columnas-1;

        while(fila <= altura){
            for (int i = 1; i <= espacio; i++){
                System.out.print(" ");
            }
            for (int n= 1; n <= columnas; n++){
                System.out.print(hola);
            }

            System.out.println();
            fila++;
            espacio--;
            columnas = columnas + 2;
            }
        }

    }
