package Tercer_Trimestre.Tema14;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProbarExcepciones {
    public static void main(String[] args) {
        try{
        Scanner es = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.printf("| %-50s |", "Menú de opciones");
            System.out.println();
            System.out.printf("| %-50s |", "1. Provocar StackOverFlowError");
            System.out.println();
            System.out.printf("| %-50s |", "2. Provocar NumberFormatException");
            System.out.println();
            System.out.printf("| %-50s |", "3. Provocar ArrayIndexOutOfBoundsException");
            System.out.println();
            System.out.printf("| %-50s |", "4. Provocar FileNotFoundExcepction");
            System.out.println();
            System.out.printf("| %-50s |", "5. Provocar AritmethciException");
            System.out.println();
            System.out.printf("| %-50s |", "6. Salir");
            System.out.println();

            System.out.println("Introduzca su opcion: ");
            opcion = es.nextInt();
            switch (opcion) {
                case 1:
                    ProvocarStackOverFlowError();
                    break;
                case 2:
                    ProvocarNumberFormatException();
                    break;
                case 3:
                    ProvocarArrayIndexOutOfBoundsException();
                    break;
                case 4:
                    ProvocarFileNotFoundExcepction();
                    break;
                case 5:
                    ProvocarAritmethciException();
                case 6:
                    System.out.println("Adios!!!");
                    break;
                default:
                    System.out.println("Opcion no valida!");
                    break;
            }
        } while (opcion != 6);
    }catch (Exception e){
        System.out.println("Ha ocurrido una excepcion no controlada: "+ e.getMessage());
    }
    }

    public static void ProvocarStackOverFlowError(){
        ProvocarStackOverFlowError();
    }

    public static void ProvocarNumberFormatException(){
        String error = "error";
        int i = Integer.parseInt(error);
    }

    public static void ProvocarArrayIndexOutOfBoundsException(){
        int[] error = new int[2];
        error[2] = 22;
    }

    public static void ProvocarFileNotFoundExcepction(){
        try {
            java.io.FileReader fr = new java.io.FileReader("error.txt");
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        }
    }

    public static void ProvocarAritmethciException(){
        int a = 10;
        int b = 0;
        int c = a/b;
    }
}
