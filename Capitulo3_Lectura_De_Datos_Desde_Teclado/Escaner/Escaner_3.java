package Escaner;

import java.util.Scanner;

public class Escaner_3 {
      //PabloJavier
      public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
        System.out.print("introduzca la cantidad de pesetas que cambiar: ");
        int pesetas = Integer.parseInt(es.nextLine());
    
        double euros = pesetas / 166.386;
    
        System.out.printf(pesetas+" pesetas son "+ euros +" euros");
      }
}
