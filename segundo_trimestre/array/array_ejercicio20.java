package segundo_trimestre.numeros_aleatorios;

import java.util.Scanner;

public class array_ejercicio20 {
    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
        System.out.print("Cuantos reyes son: ");
        int nombres = Integer.parseInt(es.nextLine());
    
        String[] reyes = new String[nombres];
        
        System.out.println("Introduzca los nombres");
        
        for (int i = 0; i < nombres; i++) {
          reyes[i] = es.nextLine();
        }
        System.out.print("Reyes ordenados: ");
        for (int i = 0; i < nombres; i++) {
          int orden = 1;
          
          for (int aux = 0; aux < i; aux++) {
            if (reyes[i].equals(reyes[aux])) {
              orden++;
            }
          }
          System.out.print(reyes[i] + " " + orden + "º"+"  ");
        }
      }
}
