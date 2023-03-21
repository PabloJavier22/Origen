public class Gato {
    private String nombre;
    private String color;
    private String raza;
    private static int sardinas = 10;
  



    public static int getSardinas() {
      return sardinas;
    }

    public static void setSardinas(int sardinas) {
      Gato.sardinas = sardinas;
    }

    public void comer(int n){
      for(int x = 0; x < n; x++){
      if (sardinas > 0){
        System.out.println("ñam ");
        sardinas--;
      } else {
        System.out.println("ya no hay sardinas");
        n = 0;
      }
      
      }
    }
    
    public String getNombre() {
      return nombre;
    }
  
    public void setNombre(String nombre) {
      this.nombre = nombre;
    }
    
    public String getColor() {
      return color;
    }
  
    public void setColor(String color) {
      this.color = color;
    }
  
    public String getRaza() {
      return raza;
    }
  
    public void setRaza(String raza) {
      this.raza = raza;
    }
  }