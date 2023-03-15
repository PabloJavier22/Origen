package orientada_a_objetos.Ejercicio8;
class Terminal {

    private String numero;
    private int tiempoDeConversacion;
  
    Terminal(String numero) {
      this.numero = numero;
      this.tiempoDeConversacion = 0;
    }
  
    public String getNumero() {
      return numero;
    }
  
    public void setNumero(String numero) {
      this.numero = numero;
    }
  
    public int getTiempoDeConversacion() {
      return tiempoDeConversacion;
    }
  
    public void setTiempoDeConversacion(int tiempoDeConversacion) {
      this.tiempoDeConversacion = tiempoDeConversacion;
    }
  
    @Override
    public String toString() {
      return "Nº " + numero + " - " + this.tiempoDeConversacion + "m de conversación en la ultima llamada ";
    }
  
    public void llama(Terminal t, int segundosDeLlamada) {
      this.tiempoDeConversacion += segundosDeLlamada;
      t.tiempoDeConversacion += segundosDeLlamada;
    }
  
  }