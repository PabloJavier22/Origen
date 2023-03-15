package numeros_aleatorios;

public class Ejercicio5 {
    public class Main {
        public static void main(String[] args) {
            int min = 200;
            int max = 100;
            int sum = 0;
            for (int i = 0; i < 50; i++) {
                int num = (int) (Math.random() * 100) + 100;
                System.out.print(num + " ");
                min = Math.min(min, num);
                max = Math.max(max, num);
                sum += num;
            }
            double media = sum / 50.0;
            System.out.println("\nMínimo: " + min);
            System.out.println("Máximo: " + max);
            System.out.println("Media: " + media);
        }
    }
}
