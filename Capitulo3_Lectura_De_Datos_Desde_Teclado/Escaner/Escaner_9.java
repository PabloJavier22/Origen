package Escaner;

import java.util.Scanner;

public class Escaner_9 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("Cual es la altura del cono: ");
        Double altura = es.nextDouble();
        System.out.print("Cual es el radio de la base: ");
        Double radio = es.nextDouble();
        Double pi = 3.14;
        Double tercio = 0.33;
        System.out.println("el volumen es de: "+(tercio*pi*radio*radio*altura));
    }
}
