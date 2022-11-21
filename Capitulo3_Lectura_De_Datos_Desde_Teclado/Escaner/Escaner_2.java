package Escaner;

import java.util.Scanner;

public class Escaner_2 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Introduce el dinero que quieras convertir: ");
        Double pesetas = e.nextDouble();
        System.out.println(pesetas +" pesetas son: " + pesetas / 166.386);
        }
}
