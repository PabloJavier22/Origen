import java.util.Scanner;

public class ExamenProgramacion_3 {
  //PabloJavier
  public static void main(String[] args){
    Scanner es = new Scanner(System.in);
    System.out.print("Escribe tu nombre: ");
    String nombre = System.console().readLine();
    System.out.print("Escribe tu edad: ");
    int edad = es.nextInt();
    System.out.println("Mi nombre es: "+nombre+" y tengo "+edad);
  }
}