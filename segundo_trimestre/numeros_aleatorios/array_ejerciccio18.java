package segundo_trimestre.numeros_aleatorios;

public class array_ejerciccio18 {

    public static void main(String[] args) {
      int[] numeros = new int[10];
      int[] menores = new int[10];
      int[] mayores = new int[10];
      int aux1 = 0;
      int aux2 = 0;
      
     
      for (int i = 0; i < 10; i++) {
        numeros[i] = (int) (Math.random() * 201);
        
        if (numeros[i] <= 100) {
          menores[aux2++] = numeros[i];
        } else {
          mayores[aux1++] = numeros[i];
        }
      }
  
      
      System.out.println("\nArray original:");
      System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
      System.out.print("│ Índice ");
      for (int i = 0; i < 10; i++) {
        System.out.printf("│%4d ", i);
      }
      System.out.println("│");
      System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
      System.out.print("│ Valor  ");
      for (int i = 0; i < 10; i++) {
        System.out.printf("│%4d ", numeros[i]);
      }
      System.out.println("│");
      System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
  
      int[] resultado = new int[10];
      int cambio1 = 0;
      int cambio2 = 0;
      
      int j = 0;
      do {
        
        if (cambio1 < aux2) {
          resultado[j++] = menores[cambio1++];
        }
        
        if (cambio2 < aux1) {
          resultado[j++] = mayores[cambio2++];
        }
        
      } while (j < 10);
  
  
      // Muestra el resultado.
      System.out.println("\nArray resultado:");
      System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
      System.out.print("│ Índice ");
      for (int i = 0; i < 10; i++) {
        System.out.printf("│%4d ", i);
      }
      System.out.println("│");
      System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
      System.out.print("│ Valor  ");
      for (int i = 0; i < 10; i++) {
        System.out.printf("│%4d ", resultado[i]);
      }
      System.out.println("│");
      System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    }
  
  }