package Capitulo4_Condicional;

import java.util.Scanner;

public class Capitulo4_7 {
    public static void main(String[] args){
        int suma = 0;
        Scanner es = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++){
            System.out.print("introduce tu nota: ");
            int numero = es.nextInt();
            suma = suma + numero;
        }
        System.out.print("la media es: "+suma/3);
    }
}
