package For;

public class For_4 {
//PabloJavier
    public static void main(String[] args){
    
    int par = 0;
    int impar = 0;
        
    for (int contador = 100; contador <= 200;contador++){
            if((contador%2) == 0)
                par = par + contador;
            else
                impar = impar + contador;
        }    
    System.out.print("Suma de los pares: "+par+"\n");
    System.out.print("suma de los impares: "+impar);
    }

}
