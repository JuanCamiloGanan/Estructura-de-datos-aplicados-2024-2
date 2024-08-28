package CuentaBancaria;

public class CuentaBancaria {

    private String numeroCuenta;
    private String nombreCliente;
    private double saldo;

    //Constructor
    public CuentaBancaria(String numeroCuenta, String nombreCliente, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCliente = nombreCliente;
        this.saldo = saldoInicial;
    }

    //Metodo para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Deposito exitoso, su saldo actual es: " + saldo);
        } else {
            System.out.println("No se puede depositar una cantidad menor que 0");
        }
    }

//Metodo para retirar dinero

        public void retirar (double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso, su saldo actual es: " + saldo);
        } else if (cantidad > saldo) {
            System.out.println("No se puede retirar una cantidad menor que 0 o mayor que su saldo actual");
        } else {
            System.out.println("No se puede retirar una cantidad menor que 0 o mayor que su saldo actual");
        }
    }

    //Metodo para obtener el saldo
    public double obtenerSaldo() {
        return saldo;
    }

    //Metodo para obtener el numero de cuenta
    public String obtenerNumeroCuenta() {
        return numeroCuenta;
    }

    //Metodo para obtener el nombre del cliente
    public String obtenerNombreCliente() {
        return nombreCliente;
    }
}