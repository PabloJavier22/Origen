package orientada_a_objetos_array.Ejercicio5;

public class ejercicio5 {

    public static void main(String[] args){
    System.out.print("Maximo de productos que vas a añadir: ");
    int n =  Integer.parseInt(System.console().readLine());
    Producto almacen[] = new Producto[n];     
        
        int x = 0;

        while(x != 7){
            System.out.println("1. Listado\n2. Dar de alta\n3. Dar de baja \n4. Modificación\n5. Entrada de mercancía\n6. Salida de mercancía\n7. Salir");
            x = Integer.parseInt(System.console().readLine());

            if(x == 1){
                
                System.out.println();
                System.out.printf("|%25s", "LISTA");
                System.out.printf("%20s","|");
                System.out.println();
                for(int i = 0;i < n; i++){
                    if(almacen[i] != null){
                    System.out.println(almacen[i].getID()+" ,"+almacen[i].getNombre()+" ,"+almacen[i].getDescripcion()+", "+almacen[i].getPrecio()+"$, "+almacen[i].getCantidad());
                    }else{}
                }
            }
            if(x == 2){
                for(int i = 0; i < n; i++){
                System.out.print("ID: ");
                int ID = Integer.parseInt(System.console().readLine());
                System.out.print("nombre: ");
                String nombre = System.console().readLine();
                System.out.print("descripción: ");
                String descripcion = System.console().readLine();
                System.out.print("precio: ");
                double precio = Double.parseDouble(System.console().readLine());
                System.out.print("cantidad: ");
                int cantidad = Integer.parseInt(System.console().readLine());
                almacen[i] = new Producto(ID, nombre, descripcion, precio, cantidad);
                }
            }
        }
        System.out.println("Adios!!!");
    }
}