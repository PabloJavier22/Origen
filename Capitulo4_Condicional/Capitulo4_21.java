package Capitulo4_Condicional;

import java.util.Scanner;
public class Capitulo4_21 {
    public  static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("Que nota sacaste en el primer examen: ");
        Double nota1 = es.nextDouble();
        System.out.print("Que nota sacaste en el segundo examen: ");
        Double nota2 = es.nextDouble();
        Double notafinal = (nota1+nota2)/2;
            if (notafinal >= 5)
                System.out.printf("APTO con una nota de: %.2f",notafinal);
            else{
                System.out.print("Que nota sacaste en la recuperacion: ");
                Double recuperacion = es.nextDouble();
                if (recuperacion >= 5)
                System.out.printf("APTO con una nota de: %.2f",recuperacion);
                else
                System.out.printf("NO APTO con una nota de: %.2f",notafinal);
            }

    }
}
