package orientada_a_objetos.Ejercicio5;

public class Pizza {
    
    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    private String tamano;
    private String tipo;
    private String estado;

    public Pizza(String tipo, String tamano){
        this.tipo = tipo;
        this.tamano = tamano;
        this.estado = "pedida";
        Pizza.totalPedidas++;
    }

    public String toString(){
        return "pizza "+this.tipo+" "+this.tamano+", "+this.estado;
       }

    public static int getTotalPedidas(){
        return Pizza.totalPedidas;
    }

    public static int getTotalServidas(){
        return Pizza.totalServidas;
    }

    public void sirve(){
        if (this.estado.equals("pedidas")){
            this.estado = "servido";
            Pizza.totalServidas++;
        } else{
            System.out.println("el repartidor ya lo ha entregado");
        }
    }
}
