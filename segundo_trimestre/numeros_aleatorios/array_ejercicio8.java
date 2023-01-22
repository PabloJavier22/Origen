package segundo_trimestre.numeros_aleatorios;

import java.util.Scanner;
public class array_ejercicio8 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        String[] mes= {
            "enero", "febrero", "marzo", "abril", "mayo", "junio", "julo", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
            };
        int temperatura[] = new int[12];
        int i = 0;
        int x = 0;
        System.out.print("Introduzca la temperatura media de cada mes: ");
        while(i < 12){
            System.out.print("Introduzca la temperatura media de "+mes[i]+":");
            temperatura[i] = Integer.parseInt(System.console().readLine());
            i++;
        }
        System.out.print("\n");
        i = 0;
        while(i < 12){
            System.out.printf("%13s| ",mes[i]);
            while(x < temperatura[i]){
                System.out.print("+");
                x++;
            }
            System.out.println(" "+temperatura[i]+"ºC");
            i++;
            x = 0;
        }
    }
}
