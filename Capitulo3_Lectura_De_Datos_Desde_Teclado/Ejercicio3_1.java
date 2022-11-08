public class Ejercicio3_1 {
    public static void main(String[] args) {
    String linea;
    int PrimerNumero;
    int SegundoNumero;
    int solucion;

    System.out.print("escriba el primer numero: ");
    linea = System.console().readLine();
    PrimerNumero = Integer.parseInt( linea );
    System.out.print("escriba el segundo numero: ");
    linea = System.console().readLine();
    SegundoNumero = Integer.parseInt( linea );
    solucion = PrimerNumero * SegundoNumero;
    System.out.println("la multiplicacion da "+ solucion);

    }
}
