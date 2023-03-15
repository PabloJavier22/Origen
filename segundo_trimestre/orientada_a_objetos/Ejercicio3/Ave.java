package orientada_a_objetos.Ejercicio3;

public class Ave extends Animal{
    

    public Ave(){
        super(Sexo.HEMBRA);
    }

    public Ave(Sexo s){
        super(s);
    }

    public void mudarPlumas(){
        System.out.println();
    }
    
    
    public void volar(){
        System.out.print("El pajaro salió volando");
    }

    public void piar(){
        System.out.print("Pío Pío");
    }

    public void seAsusta(){
        System.out.println("!!!!!!");
    }
}
