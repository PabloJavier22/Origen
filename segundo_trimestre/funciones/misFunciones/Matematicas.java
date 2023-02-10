package Funciones.misFunciones;

public class Matematicas {
    public static double mutiplica(double x, double y){
        double r = x*y;
        return(r);
    }

    public static double perimetroCuatro(double x, double y){
        double r = x*2+y*2;
        return (r);
    }
    
    public static double areaCuatro(double x, double y){
        double r = x*y;
        return (r);
    }
    
    public static int sumaelrango(int x){
        int r = 1;
        for(int i = 1; i <= x;i++)
            r = r+i;
        return(r);
    }

    public static int productodelrango(int x){
        int r = 1;
        for(int i = 1; i <= x;i++)
            r = r*i;
        return(r);
    }

    public static int valorintermedio(int x){
        int r = (1+x)/2;
        return(r);
    }
}

