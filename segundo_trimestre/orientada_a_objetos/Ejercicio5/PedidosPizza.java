package orientada_a_objetos.Ejercicio5;

public class PedidosPizza {
  public static void main(String[] args){
    Pizza p1 = new Pizza("con tonno", "mediana");
    Pizza p2 = new Pizza("prochuto", "pequeña");
    Pizza p3 = new Pizza("cuatro staccioni", "familiar");
    p1.sirve();
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    p2.sirve();
    System.out.println("en espera: "+Pizza.getTotalPedidas());
    System.out.println("servidas: "+ Pizza.getTotalServidas());
  }
}
