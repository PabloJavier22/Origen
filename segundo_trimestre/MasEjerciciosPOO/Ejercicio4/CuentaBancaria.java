package MasEjerciciosPOO.Ejercicio4;

public class CuentaBancaria {
    private String IBAN = "ES23";
    private double saldo = 0;
    private double interesAnualBasico;
    

    public String getnumeroCuenta(){
        return IBAN;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double saldo) {
        this.saldo = saldo;
    }

    public void retirar(){

    }

    public CuentaBancaria(String iBAN, double saldo) {
        IBAN = iBAN;
        this.saldo = saldo;
    }

    
}
