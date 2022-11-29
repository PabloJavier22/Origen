package Capitulo4_Condicional;

import java.util.Scanner;

public class Capitulo4_23 {
    public static void main(String[] args){
        Scanner es = new Scanner(System.in);
        System.out.print("Introduce la base imponible del producto: ");
        int coste = es.nextInt();
        System.out.println("Introduce el tipo de IVA (general, reducido o superreducido) que le corresponde al producto: ");
        String iva = es.nextLine();
        int ivaselec = 0;
        int promoselec = 0;
        String promoname = "x";
        int afterpromo = 0;
        
            switch(iva.toLowerCase())
            {
                case "general":
                    ivaselec = 21/100;
                    break;

                case "reducido":
                    ivaselec = 10/100;
                    break;

                case "superreducido":
                    ivaselec = 4/100;
                    break;
            }

        System.out.println("introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String promo = es.nextLine();

        switch(promo.toLowerCase())
        {
                case "nopro":
                    promoname = "nopro";
                    afterpromo = coste;
                    break;

                case "mitad":
                    promoselec = 1/2;
                    promoname = "mitad";
                    afterpromo = promoselec*coste;
                    break;

                case "menos5":
                    promoselec = -5;
                    promoname = "menos5";
                    afterpromo = promoselec+coste;
                    break;

                case "5porc":
                    promoselec = 5/100;
                    promoname = "5porc";
                    afterpromo = promoselec*coste;
                    break;
        }
            System.out.println("Base imponible: "+coste);
            System.out.println("IVA ("+ivaselec+"%): "+coste*ivaselec);
            System.out.println("Precio con IVA: "+(coste*ivaselec+coste));
            System.out.println("Cód. promo. ("+promoname+"): "+afterpromo);
            System.out.println("TOTAL"+(coste-afterpromo+coste*ivaselec));
    }
}
