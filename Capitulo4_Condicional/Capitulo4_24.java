package Capitulo4_Condicional;

import java.util.Scanner;

public class Capitulo4_24 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("1. - Progamador junior\n2. - Progamador senior\n3. - Jefe de proyecto\n");
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        int cargo = es.nextInt();
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        int dias = es.nextInt();
        System.out.print("Introduzca su estado civil ( 1 - Soltero, 2 - Casado): ");
        int estado = es.nextInt();
        double robo = 0;

        int sueldo = 0;
        switch(cargo){
            case 1:
                sueldo = 950;
                break;
            case 2:
                sueldo = 1200;
                break;
            case 3:
                sueldo = 1600;
                break;
            default:
                System.out.print("error");
                break;
        }
        
        int dieta = 30 * dias;
        
        
        if(estado == 1){
            robo = 0.25;
        }
        else{
            robo = 0.20;
        }

        System.out.println("Suelod base: "+sueldo);
        System.out.println("Dietas ( "+dias+" ): "+dieta);
        System.out.println("Sueldo bruto: "+(sueldo+dieta));
        System.out.println("Retención IRPF ("+robo*100+"%): "+(-robo*sueldo));
        System.out.println("Sueldo bruto: "+(sueldo-robo*sueldo));

    }
}
