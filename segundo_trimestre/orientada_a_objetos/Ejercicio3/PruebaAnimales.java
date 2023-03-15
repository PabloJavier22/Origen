package orientada_a_objetos.Ejercicio3;

public class PruebaAnimales {
   public static void main(String[] atgs){
    System.out.println("Pinguino");
    Pinguino kowalsky = new Pinguino(Sexo.MACHO);
    kowalsky.cuentateUnChiste();
    kowalsky.nada();
    kowalsky.vuela();
    System.out.println("");
    System.out.println("Perro");
    Perro chorizo = new Perro(Sexo.MACHO);
    chorizo.ladra();
    chorizo.llora();
    chorizo.caza();
    System.out.println("");
    System.out.println("Lagarto");
    Lagarto Marta = new Lagarto(Sexo.HEMBRA);
    Marta.tomaElSol();
    Marta.mudarLaPiel();
    Marta.soltarLaCola();
   } 
}
