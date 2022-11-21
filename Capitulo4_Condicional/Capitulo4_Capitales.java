package Capitulo4_Condicional;

public class Capitulo4_Capitales {
    public static void main(String[] args){
        System.out.println("Capital de España: ");
        String respuesta1 = System.console().readLine();
        if ("madrid".equals(respuesta1.toLowerCase())){
            System.out.println("Primera respuesta correcta");
        }
        else{
            System.out.println("Primera respuesta incorrecta");
        }
    }
}
