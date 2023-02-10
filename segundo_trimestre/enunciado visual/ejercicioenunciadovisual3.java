package segundo_trimestre.numeros_aleatorios;

public class ejercicioenunciadovisual3 {
    public static void main(String[] args){
        int x = 7;
        int y = 5;
        int b = 0;
       long resultado[][] = new long[x][y];
       long anterior = 1;
       int  a = 0;
        for( a = 0;a < y; a++){
            for(b = 0;b < x; b++){
                resultado[b][a] = anterior;
                anterior *= 2;
            }
        }

        for(b = 0;b < x;b++){
            for(a = 0; a < y;a++){
                System.out.printf("%20s|",resultado[b][a]+" ");
            }
            a = 0;
            System.out.println();
        }
    } 
}