package numeros_aleatorios;

public class Ejercicio2 {public class Main {

    public static void main(String[] args) {
        String[] palos = {"picas", "corazones", "diamantes", "tréboles"};
        String[] cartas = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int paloIndex = (int) (Math.random() * palos.length);
        int cartaIndex = (int) (Math.random() * cartas.length);
        String carta = cartas[cartaIndex];
        String palo = palos[paloIndex];
        System.out.println(carta + " de " + palo);
    }
}
}