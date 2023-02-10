package segundo_trimestre.numeros_aleatorios;


public class arraybidimensional1{

    public static void main(String[] args) {
        int x = 3;
        int y = 6;

        int i = 0;
        int b = 0;
        int[][] tabla = new int[3][6];
        tabla[0][0] = 0;
        tabla[0][1] = 30;  
        tabla[0][2] = 2; 
        tabla[0][5] = 5;  
        tabla[1][0] = 75;  
        tabla[2][2] = -2;
        tabla[2][3] = 9;
        tabla[2][5] = 11;

        while(b < x){
            while(i < y){
                System.out.printf("|%3s",tabla[b][i]);
                i++;
            }
            b++;
            i = 0;
            System.out.print("\n");
        }
    }        
}
