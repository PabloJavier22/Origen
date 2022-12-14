package Capitulo4_Condicional;

import java.util.Scanner;

public class Capitulo4_13 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        int numero1 = es.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int numero2 = es.nextInt();
        System.out.print("Introduce el tercer numero: ");
        int numero3 = es.nextInt();

        int primero = 0;
        int segundo = 0;
        int tercero = 0;

        if(numero1 < numero2){
            if (numero2 < numero3){
                primero = numero1;
                segundo = numero2;
                tercero = numero3;
                System.out.print(primero+" "+segundo+" "+tercero);
            }
        }

        if(numero1 > numero2){
            if (numero2 < numero3){
                primero = numero2;
                segundo = numero1;
                tercero = numero3;
                System.out.print(primero+" "+segundo+" "+tercero);
            }
        }
        if(numero3 < numero1){
            if (numero2 < numero1){
                primero = numero3;
                segundo = numero2;
                tercero = numero1;
                System.out.print(primero+" "+segundo+" "+tercero);
            }
        }
    }
}
