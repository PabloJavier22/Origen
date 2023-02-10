package segundo_trimestre.numeros_aleatorios;

import java.util.Scanner;
public class array_ejercicio13 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        int numeros[] = new int[100];
        int i = 1;
        int contador = 0;
        int respuesta = 0;
        
        numeros[0] =  (int)(Math.random()*501);
        int max = numeros[0];
        int min = numeros[0];

        while(i < 100){
            numeros[i] = (int)(Math.random()*501);            
            if(max < numeros[i]){
                max = numeros[i];
            }
            if(min > numeros[i]){
                min = numeros[i];
            }
            i++;

        }
        i = 0;
        while(i <100){
            System.out.printf("%5s",numeros[i]);
            i++;
            contador++;
            if(contador == 10){
                contador  = 0;
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.print("Que quieres destacar: maximo('1') min('2'): ");
        respuesta = es.nextInt();
        i = 0;

        switch(respuesta){
            case 1:
            while(i <100){
                System.out.printf("%5s",numeros[i]);
                if(numeros[i] == max){
                    System.out.print("**");
                    }   
                i++;
                contador++;
                if(contador == 10){
                    contador  = 0;
                    System.out.println("");
                    }
                }
                break;
                case 2:
                while(i <100){
                    System.out.printf("%5s",numeros[i]);
                    if(numeros[i] == min){
                        System.out.print("**");
                    }
                    i++;
                    contador++;
                    if(contador == 10){
                        contador  = 0;
                        System.out.println("");
                    }
                }
                break;
            }
        }
    }
