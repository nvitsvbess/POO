package modelo;

public abstract class CuentaBancaria {
    protected int numeroCuenta;
    protected int saldo;

    //constructor sobrecargado°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°

    public CuentaBancaria(int numeroCuenta, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //getter para numeroCuenta°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
    public int getNumeroCuenta() {
        return numeroCuenta;
    }


    //getter para saldo°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
    public int getSaldo() {
        return saldo;
    }

    // Métodos abstractos para calcular intereses
    // Se implementarán en las subclases con su lógica específica

    public abstract void calcularInteres();
}

