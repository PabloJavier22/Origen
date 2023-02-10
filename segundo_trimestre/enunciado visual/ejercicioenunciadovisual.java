package segundo_trimestre.numeros_aleatorios;

public class ejercicioenunciadovisual {
    public static void main(String[] args){
        int x = 5;
        int y = 10;
        int tabla[][] = new int[x][y];
        int suma = 0;
        int suma2 = 0;
    
        for(int b = 0;b < x;b++){
            for(int a = 0;a < y;a++){
                tabla[b][a] = suma+suma2;
                System.out.printf("|%6s",tabla[b][a]);
                suma += 10;
            } 
            System.out.println("|");
            suma = 0;
            suma2 += 2;
        }
    }
}
