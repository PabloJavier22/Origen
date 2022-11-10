public class Ejercicio3_7 {
    //PabloJavier
    public static void main(String[] args){
        System.out.print("Introduzca la base imponible: ");
        double baseImponible = Double.parseDouble(System.console().readLine());
        System.out.printf("Total: " +(baseImponible * 1.21));
    }
}