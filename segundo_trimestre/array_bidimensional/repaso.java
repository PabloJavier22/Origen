package segundo_trimestre.numeros_aleatorios;

import java.util.Scanner;

public class repaso {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("tamaño de la fila: ");
        int n = es.nextInt();
        int fila[] = new int[n];
        fila[0] = (int)(Math.random()*11+50);
        int maximo = fila[0];
        int pares[] = new int[n];
        int aux = 1;

        for(int i = 1; i < n; i++){
            fila[i] = (int)(Math.random()*11+50);

                if(maximo < fila[i]){
                    maximo = fila[i];
                }
                if(fila[i]%2 == 0){
                    pares[n-aux] = fila[i];
                    aux++;
                }
        }
        for(int i = 0; i < n; i++){
            if(fila[i] == maximo){
            System.out.printf("\033[35m[%2s]\033[37m",fila[i]);
            }
            else{
            System.out.printf(" %2s ",fila[i]);
            }
        }
        System.out.println();
        System.out.println("numeros pares: ");
        for(int i = 0; i < n; i++){
            System.out.printf(" %2s ",pares[i]);
            }
        }
    }
