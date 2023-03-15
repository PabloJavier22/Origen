package orientada_a_objetos.Ejercicio3;

public class Lagarto extends Animal {
    public Lagarto() {}

    public Lagarto(Sexo s){
        super(s);
    }

    public void tomaElSol(){
        System.out.println("Estoy tomando el Sol");
    }

    public void mudarLaPiel(){
        System.out.println("Estroy mudando la piel");
    }

    public void soltarLaCola(){
        System.out.println("Me defiendo dejando mi cola atras");
    }
}
