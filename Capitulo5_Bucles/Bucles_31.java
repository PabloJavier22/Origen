package Capitulo5_Bucles;

import java.util.Scanner;

public class Bucles_31 {
    public static void main(String[] args){
    Scanner es = new Scanner(System.in);
    System.out.print("Seleccione la altura que quiere: ");
    int nivel = es.nextInt();
    String base = "* ";
    int contador = 2;
    while(contador <= nivel){
        System.out.println(base);
            if(contador == nivel){
                int contador2= 0;
                while(contador2 <= (nivel/2)){
                    System.out.print(base);
                    contador2++;
                }
            }
            contador++;
    }
    }
}
