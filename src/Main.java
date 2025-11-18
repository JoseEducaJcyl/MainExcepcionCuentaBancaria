// Clase Main con el metodo main para ejecutar el codigo
public class Main {
    public static void main(String[] args) {
        // Se crea un objeto cuenta1
        CuentaBancaria cuenta1 = new CuentaBancaria(100);
        // Se prueba el metodo y el funcionamiento de las excepciones
        cuenta1.retirar(200);
        System.out.println("Saldo final: " + cuenta1.getSaldo());
    }
}