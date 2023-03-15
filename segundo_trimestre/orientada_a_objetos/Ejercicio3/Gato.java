package orientada_a_objetos.Ejercicio3;

public class Gato extends Mamifero {
    private String raza;

    public Gato( Sexo s, String r){
        super(s);
        this.raza = r;
    }

    public Gato (Sexo s){
        super(s);
        this.raza = "siamés";
    }

    public Gato (String r){
        super(Sexo.HEMBRA);
        this.raza = r;
    }

    public Gato (){
        super(Sexo.HEMBRA);
        raza = "siamés";
    }

    public void maulla(){
        System.out.println("miauuu");
    }

    public void ronronea(){
        System.out.println("mrrrrrr");
    }

    public void come(String comida){
        if (comida.equals("pescado")){
            System.out.println("Hmmmm, gracias");
        }else{
            System.out.println("lo siento, yo solo como pescado");
        }
    }
    

    public void limpiate(){
        System.out.println("Me estoy lamiendo");
    }

    public void caza(){
        System.out.println("Estroy cazando ratones");
    }
}
