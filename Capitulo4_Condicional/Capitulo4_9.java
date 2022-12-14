package Capitulo4_Condicional;

import java.util.Scanner;

public class Capitulo4_9 {
    public static void main(String[] args){
        int solucion1;
        int solucion2;
        Scanner es = new Scanner(System.in);
        System.out.print("Introduce a: ");
        int a = es.nextInt();
        System.out.print("Introduce b: ");
        int b = es.nextInt();
        System.out.print("Introduce c: ");
        int c = es.nextInt();

        if ((a == 0) && (b == 0) && (c == 0)){
            System.out.println("soluciones infinitas");
        }
        if ((a == 0) && (b == 0) && (c != 0)){
            System.out.println("no tiene solución");
        }
        if((a != 0) && (b != 0) && (c == 0)){
            System.out.println("x1 = 0");
            System.out.println("x2 = "+(-b/a));
        }
        if((a == 0) && (b != 0) && (c != 0)){
            System.out.println("x1 = x2 = "+(-c/b));
        }
        if ((a != 0) && (b != 0) && (c != 0)){
            int discriminar = b*b - (4*a*c);
            if(discriminar < 0){
                System.out.println("no existe solucion");
            }
            else{
                System.out.println("x1 =" + (-b + Math.sqrt(discriminar))/(2 * a));
                System.out.println("x2 =" + (+b + Math.sqrt(discriminar))/(2 * a));
            }
        }
    }
}
