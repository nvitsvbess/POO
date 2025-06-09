package modelo;

public class CuentaBancariaAhorro extends CuentaBancaria {

    public CuentaBancariaAhorro(int numeroCuenta, int saldo) {
        super(numeroCuenta, saldo);
    }

    @Override
    public void calcularInteres() {
        int interes = (int) (getSaldo() * 0.02); //2% interes
        saldo += interes;
        System.out.println("Interes del 2% ha sido aplicado. Nuevo saldo: " + saldo);
    }
}
