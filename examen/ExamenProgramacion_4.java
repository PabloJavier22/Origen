import java.util.Scanner;
public class ExamenProgramacion_4 {
    //PabloJavier
    public static void main(String[] args){
      Scanner es = new Scanner(System.in);
      System.out.print("Que dia naciste: ");
      int dia = es.nextInt();
      System.out.print("Que mes naciste: ");
      String mes = System.console().readLine();
      System.out.print("Que año naciste: ");
      int año = es.nextInt();
      System.out.print("Mi fecha de nacimiento es: "+dia+" de "+mes+" de "+año+".");
    }
}
