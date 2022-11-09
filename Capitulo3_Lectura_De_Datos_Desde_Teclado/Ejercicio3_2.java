public class Ejercicio3_2{
    public static void main(String[] args){
        String line;
        Double euros;
        Double pesetas;

        
        System.out.print("euros a convertir: ");
        line = System.console().readLine();
        euros = Double.parseDouble( line );
        pesetas = euros * 166.386;

        System.out.println(euros + " euros son " + pesetas + " pesetas.");
    }
}