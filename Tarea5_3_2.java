public class Tarea5_3_2 {
    public static void main(String[] args){
        int entero1=5;
        int entero2=7;

        //a
        if((entero1>5)&&(entero2 + 3 < 10)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        if((10 != entero1+5)||(20>(entero2+5)*entero1+2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        int respuesta = entero1*entero2+10+4/2-2*4+2;
            System.out.println(respuesta);

        if((10/2-1==entero1)&&(20>entero2+13)){
            System.out.println("True");
        }
        else
            System.out.println("False");

        if((5-2>4 != 5-2 > 4) && !(5 == 25/5)){
            System.out.println("True");
        }
        else
            System.out.println("False");

        if("J"=="j" || "S"=="s"){
            System.out.println("True");
        }
        else
            System.out.println("False");

        if(4*2 <= 8 || 2*2 < 5 && 4>3+1){
            System.out.println("True");
        }
        else
            System.out.println("False");

        if(10+4<15-3 || 2*5+1>14-2*2){
            System.out.println("True");
        }
        else
            System.out.println("False");
        }
}
