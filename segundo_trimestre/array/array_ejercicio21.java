package segundo_trimestre.numeros_aleatorios;

public class array_ejercicio21 {
    public static void main(String[] args) {
        int[] numero = new int[15];
    
        for (int i = 0; i < 15; i++) {
          numero[i] = (int)(Math.random() * 501);
        }
    
        System.out.print("Antes: ");
    
        for (int i = 0; i < 15; i++) {
          System.out.print(numero[i] + "  ");
        }
    
        for (int i = 0; i < 15; i++) {
          while (numero[i] % 5 != 0) {
            numero[i]++;
          };
        }
        System.out.println();
        System.out.print("despues: ");
    
        for (int i = 0; i < 15; i++) {
          System.out.print(numero[i] + "  ");
        }
      }
    
}
