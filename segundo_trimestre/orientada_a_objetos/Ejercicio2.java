package orientada_a_objetos;

import java.util.Scanner;

class Vehiculo {
    private static int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;
    private int kilometrosRecorridos = 0;
    
    public Vehiculo() {
        vehiculosCreados++;
    }
    
    public void recorrer(int km) {
        this.kilometrosRecorridos += km;
        kilometrosTotales += km;
    }
    
    public int getKilometrosRecorridos() {
        return this.kilometrosRecorridos;
    }
    
    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }
    
    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }
}

class Bicicleta extends Vehiculo {
    public void montarLaBiciEnElFurgon(){
        
        System.out.println("¡Has recorrido 10km mientras estabas en el coche!");
    }
}

class Coche extends Vehiculo {
    public void hacerDrift() {
        System.out.println("¡Has recorrido 15km mientras practicabas drift!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bicicleta bicicleta = new Bicicleta();
        Coche coche = new Coche();
        
        int opcion = 0;
        while (opcion != 8) {
            System.out.println("\nVEHÍCULOS");
            System.out.println("=========");
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Hacer drift con el coche");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Montar la bici en el furgón");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.print("Elige una opción (1-8): ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    bicicleta.recorrer(10);
                    System.out.println("Has recorrido 10 kilómetros con la bicicleta.");
                    break;
                case 2:
                    coche.recorrer(15);
                    coche.hacerDrift();
                    break;
                case 3:
                    coche.recorrer(20);
                    System.out.println("Has recorrido 20 kilómetros con el coche.");
                    break;
                case 4:
                    bicicleta.montarLaBiciEnElFurgon();
                    coche.recorrer(10);
                    bicicleta.recorrer(10);
                    break;
                case 5:
                    System.out.println("La bicicleta ha recorrido " + bicicleta.getKilometrosRecorridos() + " kilómetros.");
                    break;
                case 6:
                    System.out.println("El coche ha recorrido " + coche.getKilometrosRecorridos() + " kilómetros.");
                    break;
                    case 7:
                    System.out.println("Se han recorrido un total de " + Vehiculo.getKilometrosTotales() + " kilómetros entre todos los vehículos.");
                    break;
                case 8:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
        
        scanner.close();
    }
}