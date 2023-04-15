package Tercer_Trimestre.Tema14;
//Realiza un programa que pida 6 números por teclado y nos diga cuál es el
//máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
//entero) el programa debe indicarlo y debe pedir de nuevo el número.
import java.util.Scanner;

public class Parte2 {           
    
    public static void main(String[] args){    
        Scanner es = new Scanner(System.in);
        Double maximo = Double.MIN_VALUE;
        Double numero = 0.00;
        
        for(int x = 0; x < 5; x++){
           try {
           System.out.println(x+"º numero");
           numero = es.nextDouble(); 
                 
           if (maximo < numero){
            maximo = numero;
           } 
            } catch (Exception e) {
                System.out.println("numero no valido");
                x--;
            }           
          
        }  
        System.out.println("maximo: "+maximo);
    }
}
