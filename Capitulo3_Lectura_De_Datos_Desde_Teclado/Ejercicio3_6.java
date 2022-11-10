public class Ejercicio3_6{
    //PabloJavier
    public static void main(String[] args){
        System.out.print("Escribe valor de la base: ");
        String lado = System.console().readLine();
        Double base = Double.parseDouble(lado);
        System.out.print("Escrible el valor de la altura: ");
        lado = System.console().readLine();
        Double altura = Double.parseDouble(lado);
        System.out.println("El area del triangulo es: "+ ((base * altura)/ 2 ));

    }
}