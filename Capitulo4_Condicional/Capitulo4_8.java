package Capitulo4_Condicional;

import java.util.Scanner;

public class Capitulo4_8 {
    public static void main(String[] args){
        int suma = 0;
        Scanner es = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++){
            System.out.print("introduce tu nota: ");
            int numero = es.nextInt();
            suma = suma + numero;
        }
        int media = suma/3;

        switch(media){
            case 1,2,3,4:
            System.out.print("Insuficiente");
            break;

            case 5:
            System.out.print("Suficiente");
            break;

            case 6:
            System.out.print("Bien");
            break;

            case 7,8:
            System.out.print("Notable");
            break;

            case 9,10:
            System.out.print("Sobresaliente");
            break;
        }
    }
}
