package Capitulo4_Condicional;

import java.util.Scanner;

public class Capitulo4_11 {
    public static void main(String[] args){
    Scanner es = new Scanner(System.in);
    System.out.print("Introduce la hora: ");
    int hora = es.nextInt();
    System.out.print("Introduce la minutos: ");
    int minutos = es.nextInt();

    int segundos = hora*3600 + minutos*60;
    int segundosfaltantes = 24*3600 - segundos;

    System.out.printf("faltan"+hora+" horas, "+minutos+" minutos, "+segundosfaltantes+" segundos, hasta medianoche");
    }
}
