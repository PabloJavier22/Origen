package Capitulo5_Bucles;

import java.util.Scanner;

public class Bucles_8 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("Esctibe el numero del cual quieres ver la tabla: ");
        int hola = es.nextInt();
        int multiplicador = 0;
        while(multiplicador < 11){
            System.out.println(hola+" * "+multiplicador+" = "+hola*multiplicador);
            multiplicador++;
        }
    }
}
