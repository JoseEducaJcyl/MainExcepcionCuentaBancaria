// Clase CuentaBancaria con el atributo saldo
public class CuentaBancaria {
    private double saldo;

    // Constructor
    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    // Setters y Getters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Metodo retirar que puede lanzar un excepcion
    public void retirar (double cantidad)throws SaldoInsuficienteException{
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        saldo = saldo - cantidad;
    }
}
