public class Ejercicio3_3 {
  //PabloJavier
    public static void main(String[] args) {
        System.out.print("introduzca la cantidad de pesetas que cambiar: ");
        int pesetas = Integer.parseInt(System.console().readLine());
    
        double euros = pesetas / 166.386;
    
        System.out.printf(pesetas+" pesetas son "+ euros +" euros");
      }
}
