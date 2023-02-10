package segundo_trimestre.numeros_aleatorios;
import java.util.Scanner;
public class examen {
    public static void main(String[] args){
        //Pablo Javier Muñoz García, 26 de enero del 23, turno de tarde.            public static void main (String[] args) {
          Scanner es = new Scanner(System.in);
          int numero = 1;
          String mes[] = new String[13];
          mes[0] = "No has introducido un mes correcto";
          mes[1] = "Enero";
          mes[2] = "Febrero";
          mes[3] = "Marzo";
          mes[4] = "Abril";
          mes[5] = "Mayo";
          mes[6] = "Junio";
          mes[7] = "Julio";
          mes[8] = "Agosto";
          mes[9] = "Septiembre";
          mes[10] = "Octubre";
          mes[11] = "Noviembre";
          mes[12] = "Diciembre";
          int tdias = 0;
          int dias[][] = new int[5][7];
          System.out.println("Indique el mes \n1-Enero 2-Febrero 3-Marzo 4-Abril 5-Mayo 6-Junio 7-Julio \n8-Agosto 9-Septiembre 10-Octubre 11-Noviembre 12-Diciembre");
          int m = es.nextInt();
          System.out.print("Indique el dia de la semana en la que empieza");
          int d = es.nextInt();
          d = d-1;
          if(m%2 != 0)
            tdias = 31;
          if(m%2 == 0)
            tdias = 30;
          
          System.out.println("mes:"+mes[m]);
          System.out.printf("%3s%3s%3s%3s%3s%3s%3s\n","L","M","X","J","V","S","D");
          int y = 0;
          int aux = 0;
          int aux2 = 0;
          for(int x = 0; x < 5; x++){
            while(aux < 1){
              for(y = d; y < 7; y++){
                dias[x][y] = numero;
                numero++;
                aux++;
              }
              x++;
            }
            for(y = 0; y < 7; y++){
              dias[x][y] = numero;
                //if(aux2 < tdias){
                numero++;
                //}
                //aux2++;
            }  
          }
            for(int  x = 0; x < 5; x++){
                for( y = 0; y < 7; y++){
                  System.out.printf("%3s",dias[x][y]);
                }
              System.out.println();
            }  
          }
}