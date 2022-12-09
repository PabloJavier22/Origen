package Capitulo5_Bucles;

public class Bucles_17 {
    public static void main(String[] args) {
    
        int numero = 0;
        
        do {
          System.out.print("Introduzca un número entero positivo: ");
          numero = Integer.parseInt(System.console().readLine());
          
          if(numero < 0) {
            System.out.print("El número introducido no es correcto,");
            System.out.println(" debe introducir un número positivo.");
          }
        } while (numero < 0);
        
        int suma = 0;
        
        for(int i = numero; i < numero + 100; i++) {
          suma += i;
        }
    
        System.out.print("La suma de los 100 números siguientes a ");
        System.out.println(numero + " es " + suma );
      }
}
