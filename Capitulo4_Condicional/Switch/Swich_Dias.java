package Capitulo4_Condicional.Switch;

import java.util.Scanner;

public class Swich_Dias {
    public static void main(String[] args){
    Scanner es = new Scanner(System.in);
    System.out.print("Que dia de la semana es del 1-7: ");
    int dia = es.nextInt();
    String nombre;
        switch (dia){
            case 1:
                nombre = "lunes";
                break;

            case 2:
                nombre = "martes";
                break;

            case 3:
                nombre = "miercoles";
                break;

            case 4:
                nombre = "jueves";
                break;

            case 5:
                nombre = "viernes";
                break;

            case 6:
                nombre = "sabado";
                break;

            case 7:
                nombre = "domingo";
                break;

            default:
                nombre = "no existe";
        }
        System.out.print(nombre);
    }
}
