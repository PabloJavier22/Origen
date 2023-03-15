package numeros_aleatorios;
import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        int numSecreto = (int) (Math.random() * 101);
        int oportunidades = 5;
        Scanner es = new Scanner(System.in);
        while (oportunidades > 0) {
            System.out.println("Introduce un número entre 0 y 100: ");
            int num = es.nextInt();
            if (num == numSecreto) {
                System.out.println("¡Felicidades!");
            }
        }
    }
}
    
