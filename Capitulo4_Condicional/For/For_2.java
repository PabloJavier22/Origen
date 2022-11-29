package For;

public class For_2 {
    //PabloJavier
    public static void main(String[] args){
        System.out.print("Escribe el numero hasta el que quieres llegar: ");
        String lectura = System.console().readLine();
        int numero = Integer.parseInt(lectura);
        for(int contador = 0;contador <= numero;contador++){
            System.out.print(" "+contador);
        }
    }
}
