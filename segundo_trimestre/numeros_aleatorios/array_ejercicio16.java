package segundo_trimestre.numeros_aleatorios;

import java.util.Scanner;

public class array_ejercicio16 {
    public static void main(String[] args){
        int numeros[] = new int[20];
        Scanner es = new Scanner(System.in);
        int respuesta = 0;
        
        for(int i = 0;i < 20; i++){
            numeros[i] = (int)(Math.random()*401);
            System.out.printf("%5s",numeros[i]);
        }
            System.out.println();
            System.out.print("Quieres marcar los multiplos de 7 (1) o de 5 (2): ");
        respuesta = es.nextInt();
        switch(respuesta){
            case 1:
            for(int i = -1;i < 19; i++){
                if(numeros[i+1]%7 == 0){
                    System.out.printf("[%3s]",numeros[i+1]);
                }
                else{
                    System.out.printf("%5s",numeros[i+1]+" ");
                }
            }
                break;
            case 2:
            for(int i = -1;i < 19; i++){
                if(numeros[i+1]%5 == 0){
                    System.out.printf("[%3s]",numeros[i+1]);
                }
                else{
                    System.out.printf("%5s",numeros[i+1]+" ");
                }
            } 
                break;
                    
        }
    }
}
