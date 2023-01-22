package    segundo_trimestre.numeros_aleatorios;

import java.util.Scanner;

public class array_ejercicio7 {

    public static void main(String[] args){
        int tam = 100;
        int[] listado = new int[tam];
        Scanner es = new Scanner(System.in);
        for(int i = 0; i < tam; i++){
            listado[i] = (int)(Math.random()*21);
            System.out.print(listado[i]+" ");
        }
        System.out.print("Introduce el numero a cambiar: ");
        int inter = es.nextInt();
        System.out.print("Introduce el sustituto: ");
        int sustituto = es.nextInt();
        System.out.print("\n");
        for(int i = 0;i < tam; i++){
            if(listado[i]== inter){
                listado[i]= sustituto;
                System.out.print("'"+listado[i]+"' ");
            }
            else{
                System.out.print(listado[i]+" ");
            }
        }
        }
}
