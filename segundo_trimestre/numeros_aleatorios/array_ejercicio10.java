package segundo_trimestre.numeros_aleatorios;

public class array_ejercicio10 {
    public static void main(String[] args){
        int i = 0;
        int numeros[] = new int[20];

        int aux1 = 0;
        int aux2 = 0;
        
        
        while(i < 20){
            numeros[i] = (int)(Math.random()*101);
            i++;
        }
        int par[] = new int[20];
        int impar[] = new int[20];
        i = 0;
        System.out.print("numeros iniciales: ");
        while(i < 20){
            System.out.print(numeros[i]+" ");
         i++;
        }
        System.out.println();
        i = 0;
        while(i < 20){
            if(numeros[i]%2 == 0){
                par[aux1++] = numeros[i];
            }
            else{
                impar[aux2++] = numeros[i];
            }
            i++;
        }
        System.out.print("numeros pares: ");
        i = 0;
        while(i < 20){
            System.out.print(par[i]+" ");
            i++;
        }
        System.out.println();
        System.out.print("numeros impares: ");
        i = 0;
        while(i < 20){
            System.out.print(impar[i]+" ");
            i++;
        }
        while(i < 20){

            System.out.print(impar[i]+" ");
        }
        System.out.println();
        i = 0;

        while(i < aux1){
            numeros[i] = par[i];
            i++;
        }
        for (i = aux1; i < 20; i++) {
            numeros[i] = impar[i - aux1];
          }
          System.out.print("array ordenado: ");
          for (i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
          }
    }
}