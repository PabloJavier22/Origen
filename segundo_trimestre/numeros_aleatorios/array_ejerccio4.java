package segundo_trimestre.numeros_aleatorios;

public class array_ejerccio4 {
    public static void main(String[] args){
        int i = 0;
        int b = 0;
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        while(i<=19){
            numero[i] = (int)(Math.random()*101);
            cuadrado[i] = numero[i]*numero[i];
            cubo[i] = numero[i]*numero[i]*numero[i];
            i++;
        }
        while(b<=19){
        System.out.printf("|%10s|%10s|%10s|",numero[b],cuadrado[b],cubo[b]);
        System.out.println(" ");
        b++;
        }
    }
}
