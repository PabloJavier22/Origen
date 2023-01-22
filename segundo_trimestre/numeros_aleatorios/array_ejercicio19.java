package segundo_trimestre.numeros_aleatorios;

import java.util.Scanner;

public class array_ejercicio19 {
    public static void main(String arrgs[]){
    int[] numeros = new int[12];
    
    for (int i = 0; i < 12; i++) {
      numeros[i] = (int) (Math.random() * 201);
    }

    // Muestra el array original
    System.out.println("Array original:");
    
    System.out.print("\nÍndice ");
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("%4d ", i);
    }
    
    System.out.print("\nValor  ");
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("%4d ", numeros[i]);
    }
    
    // Pide el número y la posición donde colocarlo
    Scanner s = new Scanner(System.in);
    
    System.out.print("\nIntroduzca el número que quiere insertar: ");
    int numero = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduzca la posición donde lo quiere insertar (0 – 11): ");
    int posicion = Integer.parseInt(s.nextLine());
    
    // Inserta el número y desplaza el resto hacia la derecha
    for (int i = 11; i > posicion; i--) {
      numeros[i] = numeros[i - 1];
    }
    
    numeros[posicion] = numero;
    
    System.out.println("\nArray resultado:");
    
    System.out.print("\nÍndice ");
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("%4d ", i);
    }
    
    System.out.print("\nValor  ");
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("%4d ", numeros[i]);
    }
  }
}
