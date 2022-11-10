public class LeeNumero {
    //PabloJavier
    public static void main(String[] args) {
        String linea;//Creamos una variable linea con las propiedades  de String
        System.out.print("Por favor, introduce un número: ");//imprime por pantalla "Por favor, introduce un número: "
        linea = System.console().readLine();//le decimos al ordenador que le pida al usuario que escriba el valor de la variable linea
        int primerNumero;//Creamos una variable de valor entero
        primerNumero = Integer.parseInt( linea );//le traspasamos el valor recogido en linea a primerNumero
        System.out.print("introduce otro, por favor: ");//reescribrimos el valor linea
        linea = System.console().readLine();
        int segundoNumero;//creamos otra variable
        segundoNumero = Integer.parseInt( linea );//recogemos el nuevo valor en la nueva variable
        int total;//creamos una variable total
        total = (2 * primerNumero) + segundoNumero;//hacemos los calculos y los guardamos en la variable total
        System.out.print("El primer número introducido es " + primerNumero);//imprimimos resultados
        System.out.println(" y el segundo es " + segundoNumero);
        System.out.print("El doble del primer número más el segundo es ");
        System.out.print(total);
     }
}
