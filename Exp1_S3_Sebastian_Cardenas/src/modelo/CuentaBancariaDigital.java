package modelo;

public class CuentaBancariaDigital extends CuentaBancaria {

    public CuentaBancariaDigital(int numeroCuenta, int saldo) {
        super(numeroCuenta, saldo);
    }

    @Override
    public void calcularInteres() {
        int interes = (int) (getSaldo() * 0.005); // 0.5% interés
        saldo += interes;
        System.out.println("Interés del 0.5% ha sido aplicado. Nuevo saldo: " + saldo);
    }
}