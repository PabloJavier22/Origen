package segundo_trimestre.Funciones.misFunciones;

public class Varios {
    public static double menor(double x, double y){
    if( x < y)
        return(x);
    else
        return(y);
    }

    public static double signo(double x){
    double y = 0;
    if (x < 0){
        y = -1;
        return (y);
        }
    if (x > 0){
        y = 1;
        return(y);
        }
    else{
        return(y);
    }
    }
}
