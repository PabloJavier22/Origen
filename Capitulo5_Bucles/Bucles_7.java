package Capitulo5_Bucles;

import java.util.Scanner;

public class Bucles_7 {
    public static void main(String[] args){
    Scanner es = new Scanner(System.in);
    int contrasena = 2222;
    int intentos = 0;
    int respuesta = 0;
    int fin = 0;
    do {
        System.out.print("Introduzca la contraseña: ");
        respuesta = es.nextInt();
            if (contrasena != respuesta){
            System.out.println("respuesta incorrecta");
            intentos++;

            }
            else{
            System.out.print("Contraseña correcta");
            fin++;
            }

    }
    while(intentos < 4  && fin == 0);

if (intentos == 4){
    System.out.println("Errores maximos superados");
}
}
}
