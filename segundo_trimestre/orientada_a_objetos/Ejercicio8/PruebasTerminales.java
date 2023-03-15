package orientada_a_objetos.Ejercicio8;

public class PruebasTerminales {

    public static void main(String[] args) {
      Terminal t1 = new Terminal("668 54 12 01");
      Terminal t2 = new Terminal("669 55 13 02");
      Terminal t3 = new Terminal("670 56 14 03");
      Terminal t4 = new Terminal("671 57 15 04");
      t1.llama(t4, 50);
      t1.llama(t1, 200);
      t1.llama(t3, 100);
      t1.llama(t2, 150);
      System.out.println(t1);
      System.out.println(t2);
      System.out.println(t3);
      System.out.println(t4);
    }
  
  }