package Tercer_Trimestre.Tema14.Ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    
        public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
            try {
            
        
          TarjetaRegalo t1 = new TarjetaRegalo(100);
          TarjetaRegalo t2 = new TarjetaRegalo(120);
          System.out.println(t1);
          System.out.println(t2);
          t1.gasta(es.nextDouble());
          t2.gasta(5);
          t2.gasta(200);
          t1.gasta(3.55);
          System.out.println(t1);
          System.out.println(t2);
          TarjetaRegalo t3 = t1.fusionaCon(t2);
          System.out.println(t1);
          System.out.println(t2);
          System.out.println(t3);
             } catch (Exception e) {
                System.out.println("Excepción: " + e.getClass());
                System.out.println("Error: " + e.getMessage());  
            }
        }
}
