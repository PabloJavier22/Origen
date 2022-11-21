package Capitulo4_Condicional;

public class Capitulo4_4 {
    public static void main(String[] args){
   System.out.print("Introduzca el numero de horas trabajadas esta semana: ");
    String horas = System.console().readLine();
    int normales = Integer.parseInt( horas );
        if (normales <= 40){
            System.out.println("Sueldo semanal es: " + normales * 12 + " euros");
        }
        else{
           int extra = normales - 40;
            normales = normales - extra;
           System.out.println("sueldo semanal es: " + (normales *12 + extra * 16) + " euros");
        }
    }
}
