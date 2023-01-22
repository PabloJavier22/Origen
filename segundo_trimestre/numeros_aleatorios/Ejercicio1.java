package segundo_trimestre.numeros_aleatorios;

public class Ejercicio1 {
    //Pablo Javier Muñoz García
    public static void main(String[] args){
        int dice_1 = (int)(Math.random()*6+1);
        System.out.print("Primera tirada: "+dice_1+"\n");
        int dice_2 = (int)(Math.random()*6+1);
        System.out.print("Segunda tirada: "+dice_2+"\n");
        int dice_3 = (int)(Math.random()*6+1);
        System.out.print("Tercera tirada: "+dice_3+"\n");
        System.out.print("Suma total: "+(dice_1+dice_2+dice_3));
    }
}
