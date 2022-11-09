public class Ejercicio3_1 {
    public static void main(String[] args) {
    String linea;
    Double PrimerNumero;
    Double SegundoNumero;
    Double solucion;

    System.out.print("escriba el primer numero: ");
    linea = System.console().readLine();
    PrimerNumero = Double.parseDouble( linea );
    System.out.print("escriba el segundo numero: ");
    linea = System.console().readLine();
    SegundoNumero = Double.parseDouble( linea );
    solucion = PrimerNumero * SegundoNumero;
    System.out.println("la multiplicacion da "+ solucion);
    }
}
