package segundo_trimestre.numeros_aleatorios;

import java.util.Scanner;

public class array_ejercicio14 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        String palabras[] = new String[8];
        String colores[] = new String[8];
        String otros[] = new String[8];
        int i = 0;
        String aux = "";
        while(i < 8){
            palabras[i] = es.nextLine().toLowerCase();
            i++;
        }
        i = 0;
        while(i < 8){
            System.out.print(palabras[i]+" ");
            i++;
        }
        i = 0;
        while(i < 8){
            switch((palabras[i])){
                case "verde":
                 colores[i] = "verde";
                 break;

                case "rojo":
                 colores[i] = "rojo";
                 break;

                case "azul":
                colores[i] = "azul";
                 break;

                case "amarillo":
                 colores[i] = "amarillo";
                 break;

                case "naranja":
                 colores[i] = "naranja";
                 break;

                case "rosa":
                 colores[i] = "rosa";
                 break;

                case "negro":
                 colores[i] = "negro";
                 break;

                case "blanco":
                 colores[i] = "blanco";
                 break;

                case "morado":
                 colores[i] = "morado";

                 break;

                default:
                 aux = palabras[i];
                  if(aux != ""){
                    palabras[i] = aux;
                    aux = "";
                  }
                  System.out.print(palabras[i]);
                  }
            }
            i++;
        }

    }