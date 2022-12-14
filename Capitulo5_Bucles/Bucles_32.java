package Capitulo5_Bucles;

import java.util.Scanner;

public class Bucles_32 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        int numero = es.nextInt();
        int reverso = 0;
        int resto = 0;
        int aux = 0;
        int largo = 0;
        int normal= 0;
        int suma = 0;
        while(numero > 0){
            resto = numero%10;
            aux = reverso*10;
            reverso = aux + resto;
            numero = numero/10;
            largo++;
        }
        System.out.print("Digitos pares: ");
        for (int i = 0; i < largo; i++){
            normal = reverso%10;
            if(normal%2 == 0){
            System.out.print(normal+" ");
            suma = suma + normal;
            }
            reverso = reverso/10;
        }        
            System.out.println("\nLa suma da: "+suma);
        }

    }
