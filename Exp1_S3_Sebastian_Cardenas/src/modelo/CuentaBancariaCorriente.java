package modelo;

public class CuentaBancariaCorriente extends CuentaBancaria {
    // Constructor completo
    public CuentaBancariaCorriente(int numeroCuenta, int saldo) {
        super(numeroCuenta, saldo);
    }
    //Sobrescritura del metodo abstracto

    @Override
    public void calcularInteres()  {
        int interes = (int) (getSaldo() * 0.005); // 0.5% interes
        saldo += interes;
        System.out.println("Interes del 0.5% ha sido aplicado. Nuevo saldo: " + saldo);
    }
}
