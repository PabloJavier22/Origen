package segundo_trimestre.numeros_aleatorios;

public class array_arraybidimensionales_5 {
    public static void main(String[] args){
        int y = 10;
        int x = 6;
        int numeros[][] = new int[x][y];
        int maximo = Integer.MAX_VALUE;
        int filaMinimo = 0;
        int columnaMinimo = 0;
        int minimo = Integer.MIN_VALUE;
        int filaMaximo = 0;
        int columnaMaximo = 0;

        for(int b = 0; b < x; b++){
            for(int a = 0; a < y; a++){
                numeros[b][a] = (int)(Math.random()*1001);
                System.out.printf("%5s|",numeros[b][a]);
                if(maximo < numeros[b][a]){
                    maximo = numeros[b][a];
                    filaMaximo = b;
                    columnaMaximo = a;
                }
                if(minimo > numeros[b][a]){
                    minimo = numeros[b][a];
                    filaMinimo = b;
                    columnaMinimo = a;
                }
            }
        System.out.println();
        }       
        System.out.println();
        System.out.print("maximo: numero["+filaMaximo+"]["+columnaMaximo+"]");
        System.out.println();
        System.out.print("minimo: numero["+filaMinimo+"]["+columnaMinimo+"]");
    }    
}
