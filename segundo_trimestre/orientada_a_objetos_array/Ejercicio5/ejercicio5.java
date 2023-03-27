package orientada_a_objetos_array.Ejercicio5;

public class ejercicio5 {

    public static void main(String[] args){
    System.out.print("Maximo de productos que vas a añadir: ");
    int n =  Integer.parseInt(System.console().readLine());
    Producto almacen[] = new Producto[n];     
        
        int x = 0;
        int ultimo = 0;

        while(x != 7){
            System.out.println("\n1. Listado\n2. Dar de alta\n3. Dar de baja \n4. Modificación\n5. Entrada de mercancía\n6. Salida de mercancía\n7. Salir");
            x = Integer.parseInt(System.console().readLine());

            if(x == 1){
                
                System.out.println();
                System.out.printf("%29s", "+---------------------------------------------------------+\n");
                System.out.printf("|%30s ", "LISTA");
                System.out.printf("%27s"," |");
                System.out.printf("%28s", "\n+---------------------------------------------------------+\n");
  
                for(int i = 0;i < n; i++){
                    if(almacen[i] != null){
                    System.out.printf("| %3s %15s %-22s %3.2f$ %5s|",almacen[i].getID(),almacen[i].getNombre(),almacen[i].getDescripcion(),almacen[i].getPrecio(),almacen[i].getCantidad());
                    }else{}
                }
                System.out.printf("%28s", "\n+---------------------------------------------------------+");
                System.out.println();
            }
            if(x == 2){
                ultimo = 0;
                for(int i = 0;almacen[i] != null; i++){
                    ultimo++;
                }
                System.out.println("ID: "+ultimo);
                int ID = ultimo;
                System.out.print("nombre: ");
                String nombre = System.console().readLine();
                System.out.print("descripción: ");
                String descripcion = System.console().readLine();
                System.out.print("precio: ");
                double precio = Double.parseDouble(System.console().readLine());
                System.out.print("cantidad: ");
                int cantidad = Integer.parseInt(System.console().readLine());
                almacen[ultimo] = new Producto(ID, nombre, descripcion, precio, cantidad);
                }
                
            if(x == 3){
                System.out.print("Cual quieres borrar introduce ID: ");
                int i = Integer.parseInt(System.console().readLine());
                almacen[i] = null;
            }

            if(x == 4){
                System.out.println("Que articulo quireres modificar introduce la ID: ");
                    int i = Integer.parseInt(System.console().readLine()); 
                    
                    System.out.println("\n1.nombre \n2.descripción \n3.precio");
                    int caso = Integer.parseInt(System.console().readLine());

                        switch (caso) {
                            case 1:
                                System.out.println("Introduce el nuevo nombre: ");
                                almacen[i].setNombre(System.console().readLine());
                                break;
                            case 2:
                                System.out.println("Introduce la nueva descripción: ");
                                almacen[i].setDescripcion((System.console().readLine()));
                                break;
                            case 3:
                                System.out.println("Introduce el nuevo precio: ");
                                almacen[i].setPrecio(Double.parseDouble(System.console().readLine()));
                                break;
                        
                            default:
                                break;
                        }
                    }
            if(x == 5){
                System.out.println("Que articulo ha llegado (ID): ");
                int i = Integer.parseInt(System.console().readLine()); 
                System.out.println("Cuanto de este producto ha llegado: ");
                int nuevo =  Integer.parseInt(System.console().readLine());
                int guardado = almacen[i].getCantidad();
                int suma = nuevo + guardado;
                almacen[i].setCantidad(suma);
                System.out.println("Su operacion se ha realizado con exito!!");
            }
            if(x == 6){
                System.out.println("Que articulo ha salido (ID): ");
                int i = Integer.parseInt(System.console().readLine()); 
                System.out.println("Cuanto de este producto se ha enviado: ");
                int enviado =  Integer.parseInt(System.console().readLine());
                int guardado = almacen[i].getCantidad();
                int suma = guardado - enviado;
                almacen[i].setCantidad(suma);
                System.out.println("Su operacion se ha realizado con exito!!");
            }

        }
        System.out.println("Adios!!!");
    }
    }

