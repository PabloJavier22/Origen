package Capitulo4_Condicional;

import java.util.Scanner;

public class Capitulo4_20 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("Escribe tu numero de hasta 5 cifras: ");
        String numero = es.nextLine();
        int largo = numero.length();
        
        if (largo == 1){
            String a = numero.substring(0,1);
            System.out.println("El numero"+numero+"es capicua");
        }
        if (largo == 2){
            String a = numero.substring(0,1);
            String b = numero.substring(1,2);
            
            if(a.equals(b))
            System.out.println("El numero "+numero+" es capicua");
            else
            System.out.println("El numero "+numero+" no es capicua");

        }
        if (largo == 3){
            String a = numero.substring(0,1);
            String c = numero.substring(2,3);
            if(a.equals(c))
            System.out.println("El numero "+numero+" es capicua");
            else
            System.out.println("El numero "+numero+" no es capicua");
        }
        if (largo == 4){
            String a = numero.substring(0,1);
            String b = numero.substring(1,2);
            String c = numero.substring(2,3);
            String d = numero.substring(3,4);
            
            if(a.equals(d) && b.equals(c))
            System.out.println("El numero "+numero+" es capicua");
            else
            System.out.println("El numero "+numero+" no es capicua");
        }
        if (largo == 5){
            String a = numero.substring(0,1);
            String b = numero.substring(1,2);
            String c = numero.substring(2,3);
            String d = numero.substring(3,4);
            String e = numero.substring(4,5);
            if(a.equals(e) && b.equals(d))
            System.out.println("El numero "+numero+" es capicua");
            else
            System.out.println("El numero "+numero+" no es capicua");
        }
    }
}
