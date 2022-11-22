package Escaner;

import java.util.Scanner;

public class Escaner_11 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("Cuantos MB quieres convertir: ");
        Double MB = es.nextDouble();
        Double KB = MB*1000;
        System.out.println(MB+" MB son "+KB+" KB");
    }
}
