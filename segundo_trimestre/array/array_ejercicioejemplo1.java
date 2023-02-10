package segundo_trimestre.numeros_aleatorios;

import java.util.Scanner;
public class array_ejercicioejemplo1 {
    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
        int suma = 0;
        int[] num = new int[10];
        num[0] = 1;
        num[1] = 33;
        num[2] = 200*200;
        num[3] = 150*150*150;
        num[4] = 11*11*11*11;
        num[5] = 88*88*88*88*88;
        num[6] = num[2] * 10;
        num[7] = num[2] / 10;
        num[8] = num[0] + num[1] + num[2];
        num[9] = num[8];
        System.out.println("El array num contiene los siguientes elementos:");
        for (int i = 0; i < 10; i++) {
        System.out.println("En la posicion "+i+" tenemos el valor: "+num[i]);
        }
        System.out.print("¿Que posicion del array quiere mostrar?: ");
        int peticion = es.nextInt();
        System.out.println(num[peticion]);
        System.out.println("contenedores pares: ");
        for ( int i = 0; i < 10; i = i+2){
            System.out.println(num[i]);
            suma = suma + num[i];
        }
        System.out.println("La suma de todos los datos en las posiciones pares da: ");
        System.out.println(suma);
    }
}