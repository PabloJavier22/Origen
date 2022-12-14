package Capitulo5_Bucles;

import java.util.Scanner;

public class Bucles_34 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("longroduce el primer numero: ");
        long numero1= es.nextLong();
        System.out.print("longroduce el segundo numero: ");
        long numero2 = es.nextLong();

        long numero = numero1;
        long reverso1 = 0;
        int largo = 0;

        if (numero == 0){
            largo = 1;
        }
        
        while (numero > 0){
            reverso1  = reverso1*10 + numero%10;
            numero = numero/10;
            largo++;
        }

        numero = numero2;

        long pares = 0;
        long impares = 0;
        long reverso2 = 0;

        while (numero > 0){
            reverso2 = reverso2*10 + numero%10;
            numero = numero/10;
        }

        for ( int i = 0; i < largo; i++){
            long unidad = reverso1%10;

            if (unidad%2 == 0){
                pares = pares*10 + unidad;
            }
            else{
                impares = impares*10 + unidad;
            }

            reverso1 = reverso1/10;
            reverso2 = reverso2/10;
        }
        System.out.println("numero formado por pares: "+pares);
        System.out.println("numero formado por pares: "+impares);
    }
}