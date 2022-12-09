package Capitulo5_Bucles;

import java.util.Scanner;

public class Bucles_18 {
    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
        System.out.print("introduzca el primer numero");
        int numero1 = es.nextInt();
        System.out.print("introduzca el segundo numero");
        int numero2 = es.nextInt();
        int menor = 0;
        int mayor = 0;

        while (numero1 == numero2) {
            System.out.print("los numeros no son distintos");
        }

        if (numero1 < numero2)
            menor = numero1;
            mayor = numero2;

        if (numero1 > numero2)
            menor = numero2;
            mayor = numero1;

        if (numero1 != numero2) {

            while (menor <= mayor) {
                System.out.println(menor);
                menor = menor+7;
            }
        }
    }
}
