package orientada_a_objetos.Ejercicio3;

public class Pinguino extends Ave{
    
    public Pinguino(){}

    public Pinguino(Sexo s){
        super(s);
    }

    public void vuela(){
        System.out.println("Jajajaja, que gracioso eres...");
    }

    public void cuentateUnChiste(){
        System.out.println("¿Porque los pinguinos no tienen amigos? Porque no saben romper el hielo");
    }

    public void nada(){
        System.out.println("Que fría esta el agua");
    }
}
