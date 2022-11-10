public class Ejercicio3_5 {
    //PabloJavier
    public static void main(String[] args){
        System.out.print("Escribe el primer numero: ");
        String lado = System.console().readLine();
        Double lado1 = Double.parseDouble(lado);
        System.out.print("Escrible el segundo numero: ");
        lado = System.console().readLine();
        Double lado2 = Double.parseDouble(lado);
        System.out.println("El area del cuadrado es: "+ (lado1 * lado1 * lado2 * lado2));

    }
}
