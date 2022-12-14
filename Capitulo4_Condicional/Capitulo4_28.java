package Capitulo4_Condicional;

import java.util.Scanner;

public class Capitulo4_28 {
    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
        
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String jugada1 = es.nextLine();
        
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String jugada2 = es.nextLine();
        
        if (jugada1.equals(jugada2)) {
          System.out.println("Empate");
        } else {
          int ganador = 2;
          switch(jugada1) {
            case "piedra":
              if (jugada2.equals("tijera")) {
                ganador = 1;
              }
              break;
            case "papel":
              if (jugada2.equals("piedra")) {
                ganador = 1;
              }
              break;
            case "tijera":
              if (jugada2.equals("papel")) {
                ganador = 1;
              }
              break;
            default:
          }
          System.out.println("Gana el jugador " + ganador);
        }
      }
      
}
