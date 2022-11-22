package Escaner;

import java.util.Scanner;

public class Escaner_8 {
    public static void main(String[] args){
    Scanner es = new Scanner(System.in);
    System.out.print("Cuantas horas has trabajado esta semana: ");
    int horas = es.nextInt();
    System.out.print("vas a cobrar esta semana: "+horas*12);
    }
}
