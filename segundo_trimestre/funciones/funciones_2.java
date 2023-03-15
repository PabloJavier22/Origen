package segundo_trimestre.Funciones;

import java.util.Scanner;

public class funciones_2 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("Introduce el valor n: ");
        int n = es.nextInt();
        System.out.print("Indica el min para el rango: ");
        int min = es.nextInt();
        System.out.print("Indica el max para el rango: ");
        int max = es.nextInt();
        int miArray[] = generarArrayInt(n, min, max);
        
        for(int i = 0; i < n; i++){
            System.out.print(miArray[i]+" ");
            }
    }

    public static int[] generarArrayInt(int x,int y,int z){
        int miArray[] = new int[x];
        for(int i = 0; i < x; i++){
        miArray[i] = (int)(Math.random()*(z-y+1)+y);
        }
        return miArray;
    }
}
