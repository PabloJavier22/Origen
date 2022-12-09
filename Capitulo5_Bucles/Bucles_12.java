package Capitulo5_Bucles;

import java.util.Scanner;

public class Bucles_12 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("Introduzca n: ");
        int n = es.nextInt();

        switch(n){
            case 1:
                System.out.print("0");
                break;
            case 2:
                System.out.print("0 1");
                break;
            default:
                System.out.print("0 1");
                int f1 = 0;
                int f2 = 1;
                int f3;
                while(n > 2){
                    f3 = f1;
                    f1 = f2;
                    f2 = f3 + f2;
                    System.out.print(" "+f2);
                    n--;
                }
            }
            System.out.println();
        }
    }

 