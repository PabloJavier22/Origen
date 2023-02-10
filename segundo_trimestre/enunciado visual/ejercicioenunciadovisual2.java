package segundo_trimestre.numeros_aleatorios;

public class ejercicioenunciadovisual2 {
    public static void main(String[] args){
        int x = 11;
        int y = 11;
        int tabla[][] = new int[x][y];
        int suma = 0;
        int suma2 = 0;
    
        for(int b = 0;b < x;b++){
            for(int a = 0;a < y;a++){
                tabla[b][a] = suma*suma2;
                System.out.printf("|%6s",tabla[b][a]);
                suma++;
            } 
            System.out.println("|");
            suma = 0;
            suma2++;
        }
    }
}
