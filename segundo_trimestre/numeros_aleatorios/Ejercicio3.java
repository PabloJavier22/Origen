package numeros_aleatorios;

public class Ejercicio3 {
    public class Main {
        public static void main(String[] args) {
            String[] palos = {"oros", "copas", "espadas", "bastos"};
            String[] cartas = {"2", "3", "4", "5", "6", "7", "sota", "caballo", "rey", "as"};
            int paloIndex = (int) (Math.random() * palos.length);
            int cartaIndex = (int) (Math.random() * cartas.length);
            String carta = cartas[cartaIndex];
            String palo = palos[paloIndex];
            System.out.println(carta + " de " + palo);
        }
    }
}
