package segundo_trimestre.numeros_aleatorios;

import java.util.Scanner;

public class bidimensionales_repaso {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("numero de filas: ");
        int x = es.nextInt();
        System.out.print("numero de columnas: ");
        int y = es.nextInt();
        int tabla[][] = new int[x][y];
        int suma = 0;
        int aux1 = 0;
        for(int i = 0; i < x; i++){
            for(int b = 0; b < y; b++){
                tabla[i][b] = suma;
                suma += 2;
                if(aux1 < 1 && tabla[i][b]%7 == 0 && tabla[i][b] != 0){
                    System.out.printf(" \033[35m[%2s]\033[37m",tabla[i][b]);
                    aux1++;
                    }
                else{
                System.out.printf("%4d",tabla[i][b]);
                }
            }
            System.out.println();
        }
    }
}
