package segundo_trimestre.funciones;

import java.util.Scanner;

public class funciones_1 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("Introduce el numero: ");
        int n = es.nextInt();        
        System.out.print("Introduce el exponente: ");
        int m = es.nextInt();
        System.out.print("potencia: "+potencia(n, m));
        System.out.print("\nvoltea: "+voltea(n));
        System.out.print("\nIntroduce que posición quieres que imprimamos del numero: ");
        int d = es.nextInt();
        System.out.print("la posicion "+d+" la ocupa el valor: "+digitoD(n, d));
        System.out.println("Si al 400 se le quitan por detrás 4 dígitos, se queda como " + quitaPorDetras(400, 4));
        System.out.println("Si al 3000 se le quita por detrás 2 dígito, se queda como " + quitaPorDetras(3000, 2));
        System.out.println("Si al 500000 se le quitan por delante 3 dígitos, se queda como " + quitaPorDelante(50000, 3));
        System.out.println("Si al 100 se le quitan por delante 2 dígitos, se queda como " + quitaPorDelante(100, 2));
        System.out.println("Si al 567 se le pega por detrás el 1 da el ");
        System.out.print(pegaPorDetras(567, 1));
        System.out.println("Si al 500 se le pega por delate el 2 da el " + pegaPorDelante(500, 2));
        System.out.println("Al 100 le cojo el trozo que va de la posición 0 a la 2: " + trozoDeNumero(100, 0, 2));
        System.out.println("Juntando el 10 y el 33 da el " + juntaNumeros(10, 33));
    }
    
    public static boolean esCapicua(int n){
        return n == voltea(n);
    }
    
    public static boolean esPrimo(int n){
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0) {
              return false;
            }
          }
          return true;
    }
    
    public static int siguinetePrimo(int n){
        while (!esPrimo(++n)) {};

        return n;
    }

    /**@param n es el numero que hace de base
     *@param m es el numero que hace de exponente
     *@return n, m devuelve el resulado de la operación
     */
    public static int potencia(int n, int m){
        for(int i = 1; i < m; i++){
            n = n*n;
            }
        return n;
    }

    public static int voltea(int n){
        int reves = 0;
        int numero = n;
        while(numero > 0){
            reves = (reves*10) + (numero%10);
            numero = numero/10;
        }
        return(reves);
    }

    public static int digitoD(int n,int d){
        int resultado = 0;
        int aux = 1;
        int aux2 = n;
        int aux3 = n;
        while(aux2 > 0){
            ++aux;
            aux2 = aux2/10;
        }
        for(int i = 0; i < aux-d; i++){
            aux3 = aux3/10;
        }
        resultado = aux3%10;
        return(resultado);
    }
    
    public static long quitaPorDetras(long x, int n) {
        return x / (long)potencia(10, n);
    }

    public static int quitaPorDelante(int x, int n) {
        return (int)quitaPorDelante(x, n);
      }    
    public static long pegaPorDetras((long) x, int d) {
        return juntaNumeros(x, d);
    }

    public static int pegaPorDetras(int x, int d){
        return (int)pegaPorDetras(x, d);
      }
    public static long pegaPorDelante(int x, int d) {
        return juntaNumeros(d, x);
      }

    public static long trozoDeNumero(int x, int inicio, int fin) {
        int longitud = digitos(x);
        x = quitaPorDelante(x, inicio);
        x = quitaPorDetras(x, longitud - fin - 1);
        return x;
        }
    public static int trozoDeNumero(int x, int inicio, int fin) {
         return trozoDeNumero(x, inicio, fin);
        }

    public static int juntaNumeros(int x, int y) {
        return (int)(juntaNumeros(x, y));
      }
      public static int digitos(int x) {
        return digitos(x);
      }
     
    }

