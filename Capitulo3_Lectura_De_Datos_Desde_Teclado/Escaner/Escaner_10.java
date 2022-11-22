package Escaner;

import java.util.Scanner;

public class Escaner_10 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("Cuantos KB quieres convertir: ");
        Double KB = es.nextDouble();
        Double MB = KB/1000;
        System.out.println(KB+" KB son "+MB+" MB");
    }
}
