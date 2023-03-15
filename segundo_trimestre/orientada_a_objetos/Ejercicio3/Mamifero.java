package orientada_a_objetos.Ejercicio3;

public abstract class Mamifero extends Animal{
    
    public Mamifero(){
        super();
    }

    public Mamifero (Sexo s){
        super(s);
    }

    public void amamanta(){
        if(this.getSexo() == Sexo.MACHO){
            System.out.println("Soy macho, no puedo amantar");
        }else{
            System.out.println("Si, puedo amamantar");
        }
    }

    public void cuidarCrias(){
        System.out.println("Estoy cuidando mis crias");
    }

    public void anda(){
        System.out.println("Estoy andando");
    }
}
