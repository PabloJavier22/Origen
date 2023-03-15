package orientada_a_objetos.Ejercicio3;

public class Perro extends Mamifero {
    
    public Perro (Sexo s){
        super(s);
    }

    public Perro(){
        super(Sexo.HEMBRA);
    }

    public void ladra(){
        System.out.println("Guau Guau!!");
    }

    public void llora(){
        System.out.println("Llora por comida de los humanos");
    }

    public void caza(){
        System.out.println("Se acerca al cuenco y espera que humano le ponga de comer");
    }
}
