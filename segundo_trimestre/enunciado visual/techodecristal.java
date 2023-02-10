package segundo_trimestre.numeros_aleatorios;

import java.util.Scanner;
public class techodecristal {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        int h = 0;
        int m = 0;
        int respuesta = 0;
        int aux = 0;
        int sh = 0;
        int sm = 0;
        System.out.print("Cuantos empleados vas a registrar: ");
        int n = es.nextInt();
        int numero[][] = new int[2][n];
        for(int b = 0; b < n; b++){
            for(int i = 0; i < 2 ; i++){
                System.out.print("genero(1.hombre 2.mujer): ");
                respuesta = (int)(Math.random()*2+1);
                numero[i][b] = respuesta;
                i++;
                    if(respuesta == 1){
                        h++;
                        System.out.print("sueldo: ");
                        aux = (int)(Math.random()*2000+1000);
                        numero[i][b] = aux;
                        sh += aux;
                    }
                    if(respuesta == 2){
                        m++;
                        System.out.print("sueldo: ");
                        aux = (int)(Math.random()*2001+1000);
                        sm += aux;
                        numero[i][b] = aux;
                    }
                    System.out.println();
                }
            }
            for(int i = 0; i < 2; i++){
                for(int b = 0; b < n ; b++){
                    System.out.printf("%6s|",numero[i][b]);
                        }    
            System.out.println();  
        }
        System.out.println("\nsuelo medio de la mujer: "+sm/m);
        System.out.println("suelo medio de la hombre: "+sh/h);
    }
}