    import java.util.Scanner;
    
    public class Ejercicio3_8 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("cuantas horas has trabajado esta semana? ");
        int horas = es.nextInt();
        System.out.print("Esta semana vas a cobrar: "+horas*12+"€");
    }
}