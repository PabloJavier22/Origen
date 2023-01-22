package segundo_trimestre.numeros_aleatorios;

public class array_ejercicio2 {
    public static void main(String[] args){
        char i = 0;
        char[] num = new char[10];
        num[0] = 'a';
        num[1] = 'x';
        num[4] = '@';
        num[6] = ' ';
        num[7] = '+';
        num[8] = 'Q';
        
        while(i < 10){
            System.out.println(num[i]);
            i++;
        }
    }
}
