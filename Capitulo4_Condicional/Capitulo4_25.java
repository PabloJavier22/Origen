package Capitulo4_Condicional;

import java.util.Scanner;

public class Capitulo4_25 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("Introduzca la altura de la bandera en cm: ");
        int altura = es.nextInt();
        System.out.print("Introduzca la anchura: ");
        int anchura = es.nextInt();
        System.out.print("escudo (si/no");
        String escudo = es.nextLine();
        String Cadena;
        Double precioes;

        if (escudo == "si") {
          Cadena = "Con escudo";
          precioes = 2.50;
        } else {
          Cadena = "Sin escudo";
          precioes = 0.00;
        }
    

        System.out.printf("Bandera %5d cm2: %5.2f €\n", anchura * altura, (float)anchura * altura / 100);
        System.out.printf("%s:           %5.2f €\n", Cadena, precioes);
        System.out.printf("Gastos envío:      %5.2f €\n", 3.25);
        System.out.printf("Total:                %5.2f €\n", (float)anchura * altura / 100 + precioes + 3.25);
      }

    }
