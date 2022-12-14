package Capitulo4_Condicional;

import java.util.Scanner;

public class Capitulo4_1 {
    public static void main(String[] args){
    Scanner es = new Scanner(System.in);
    System.out.print("Introduce el dia: ");
    String dia = es.nextLine();

    switch(dia.toLowerCase()){
        case "lunes":
        System.out.print("Sistemas");
        break;

        case "martes":
        System.out.print("Programacion");
        break;

        case "miercoles":
        System.out.print("Sistemas");
        break;

        case "jueves":
        System.out.print("Programacion");
        break;

        case "viernes":
        System.out.print("Programacion");
        break;

        case "sabado":
        System.out.print("No hay clase");
        break;

        case "domingos":
        System.out.print("No hay clase");
        break;
    }
    }
}
