package Capitulo4_Condicional.Switch;

import java.util.Scanner;

public class Swich_Estaciones {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        int mes = es.nextInt();
        String estacion;
            switch(mes){
                case 12,1,2:
                 estacion = "Invierno";
                 break;

                case 3,4,5:
                 estacion = "Primavera";
                 break;

                case 6,7,8:
                 estacion = "Verano";
                 break;

                case 9,10,11:
                 estacion = "Otoño";
                 break;
                
                default:
                 estacion = "No existe"; 
            }
        System.out.print(estacion);
    }
    
}
