package Escaner;

import java.util.Scanner;

public class Escaner_12 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        Double primeranota = es.nextDouble() * 0.4;
        System.out.print("¿Que nota quieres sacar en el trimestre? ");
        Double notadeseada = es.nextDouble();
        Double notafinal = (primeranota/notadeseada*0.6);
        System.out.print("Para tener un "+notadeseada+" en el trimestre necesitas sacar un "+notafinal+" en el segundo examen.");
        
    }
}
