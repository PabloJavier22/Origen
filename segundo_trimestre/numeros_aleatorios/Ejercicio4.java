package numeros_aleatorios;

public class Ejercicio4 {
    public class Main {
        public static void main(String[] args) {
            for (int i = 0; i < 20; i++) {
                int num = (int) (Math.random() * 11);
                System.out.print(num + " ");
            }
        }
    }
}
