package Capitulo4_Condicional;

import java.util.Scanner;

public class Capitulo4_22 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("Escribe el dia de la semana: ");
        String dia = es.nextLine();
        System.out.print("Que hora es: ");
        int hora = es.nextInt();
        
            int lunes = 111 - hora;
            int martes = 87 - hora;
            int miercoles = 63 - hora;
            int jueves = 39 - hora;
            int viernes = 15 - hora;

              switch(dia.toLowerCase()){
                    case "lunes":
                        System.out.println("Quedan "+lunes+" horas");
                        break; 
                
                    case "martes":
                        System.out.println("Quedan "+martes+" horas");
                        break;

                    case "miercoles":
                        System.out.println("Quedan "+miercoles+" horas");
                        break;

                    case "jueves":
                        System.out.println("Quedan "+jueves+" horas");
                        break;

                    case "viernes":
                        System.out.println("Quedan "+viernes+" horas");
                        break;
            }
            if (viernes == 0)//EasterEGG
            System.out.print("Ya terminó por esta semana, que tenga un buen fin de semana.");
    }
}