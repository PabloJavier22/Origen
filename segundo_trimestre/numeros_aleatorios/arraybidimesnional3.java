package segundo_trimestre.numeros_aleatorios;

import java.util.Scanner;

public class arraybidimesnional3 {
    
    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
        int x = 4;
        int y = 5;
        int suma = 0;
        int sumat = 0;
        int sumac1 = 0;
        int sumac2 = 0;
        int sumac3 = 0;
        int sumac4 = 0;
        int sumac5 = 0;
        int sumatotal = 0;

        int i = 0;
        int b = 0;
        int[][] tabla = new int[x][y];

        System.out.print("Escribe 20 numeros: ");
        while(b < x){
            while(i < y){
                tabla[b][i] = es.nextInt();
                i++;
            }
            b++;
            i = 0;
            
            System.out.print("\n");
        }
        b = 0;
        i = 0;

        while(b < x){
            while(i < y){
                if(i == 0){
                    sumac1 = sumac1+tabla[b][i]; 
                }
                if(i == 1){
                    sumac2 = sumac2+tabla[b][i]; 
                }
                if(i == 2){
                    sumac3 = sumac3+tabla[b][i]; 
                }
                if(i == 3){
                    sumac4 = sumac4+tabla[b][i]; 
                }
                if(i == 4){
                    sumac5 = sumac5+tabla[b][i]; 
                }
                i++;
            }
            i = 0;
            b++;
        }
        b = 0;
        i = 0;

        while(b < x){
            while(i < y){
                System.out.printf("|%6s",tabla[b][i]);
                suma = suma+tabla[b][i];
                i++;
            }
            sumat = sumat + suma;
            b++;
            i = 0;
            System.out.printf("|%6s",suma);
            System.out.print("\n");
            suma = 0;
        }    
        i = 0;
        sumatotal = sumat+sumac1+sumac2+sumac3+sumac4+sumac5;
        System.out.printf("|%6s|%6s|%6s|%6s|%6s",sumac1,sumac2,sumac3,sumac4,sumac5);  
        System.out.printf("|%6s",sumatotal); 
        
    }     
}
