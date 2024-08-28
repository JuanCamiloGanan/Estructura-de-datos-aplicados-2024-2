package CuentaBancaria;

public class CuentaBancariaTest {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456", "Juan Perez", 1000.0);

        //Informacion de la cuenta
        System.out.println("Numero de cuenta: " + cuenta.obtenerNumeroCuenta());
        System.out.println("Nombre del cliente: " + cuenta.obtenerNombreCliente());
        System.out.println("Saldo: " + cuenta.obtenerSaldo());

        //Depositar dinero
        cuenta.depositar(500.0);

        //Mostrar saldo despues de depositar
        System.out.println("Saldo: " + cuenta.obtenerSaldo());

        //Retirar dinero
        cuenta.retirar(200.0);

        //Mostrar saldo despues de retirar
        System.out.println("Saldo: " + cuenta.obtenerSaldo());
    }
}
