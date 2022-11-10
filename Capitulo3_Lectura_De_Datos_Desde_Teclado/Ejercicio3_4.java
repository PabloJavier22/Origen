public class Ejercicio3_4 {
    //PabloJavier
    public static void main(String[] args){
        System.out.print("Escribe el primer numero: ");
        String numero = System.console().readLine();
        Double numero1 = Double.parseDouble(numero);
        System.out.print("Escribe el segundo numero: ");
        numero = System.console().readLine();
        Double numero2 = Double.parseDouble(numero);
        System.out.println(numero1 + numero2);
        System.out.println(numero1 * numero2);
        System.out.println(numero1 / numero2);
    }
}
