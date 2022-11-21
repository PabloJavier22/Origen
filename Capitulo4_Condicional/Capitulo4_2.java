package Capitulo4_Condicional;

public class Capitulo4_2 {
    public static void main(String[] args){
        int hora = 4;
        if (hora >= 6 && hora <= 12)
         System.out.print("Buenos dias");
        if (hora >= 13 && hora <= 20)
        System.out.print("Buenas tardes");
        if (hora >= 21 || hora <= 5)
        System.out.print("Buenas noches");
    }
}
