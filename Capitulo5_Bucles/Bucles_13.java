package Capitulo5_Bucles;

public class Bucles_13 {
    public static void main(String[] args){
        System.out.println("Introduzca 10 numeros: ");
        int n = 0;
        int p = 0;

        for (int i = 0; i< 10; i++){
            if (Integer.parseInt(System.console().readLine()) < 0){
                n++;
            }
            else{
                p++;
            }
        }
        System.out.println(p+" positivos y "+n+" negativos.");
    }
}
