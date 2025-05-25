import java.util.Scanner;

class CuentaCorriente {
    private int numeroCuenta;
    private int saldo;

    public CuentaCorriente(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void depositar(int monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("¡Depósito realizado de manera exitosa!");
            System.out.println("Usted tiene un saldo actual de " + saldo + " pesos.");
        } else {
            System.out.println("Error: El monto a depositar debe ser mayor que cero.");
        }
    }

    public void girar(int monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto debe ser mayor que cero.");
        } else if (monto > saldo) {
            System.out.println("Error: Saldo insuficiente.");
        } else {
            saldo -= monto;
            System.out.println("¡Giro realizado de manera exitosa!");
            System.out.println("Usted tiene un saldo actual de " + saldo + " pesos.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldo + " pesos.");
    }
}

class Cliente {
    private String rut;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String domicilio;
    private String comuna;
    private String telefono;
    private CuentaCorriente cuenta;

    public Cliente(String rut, String nombre, String apellidoPaterno, String apellidoMaterno,
                   String domicilio, String comuna, String telefono, int numeroCuenta) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.domicilio = domicilio;
        this.comuna = comuna;
        this.telefono = telefono;
        this.cuenta = new CuentaCorriente(numeroCuenta);
    }

    public CuentaCorriente getCuenta() {
        return cuenta;
    }

    public void mostrarDatos() {
        System.out.println("Rut: " + rut);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido paterno: " + apellidoPaterno);
        System.out.println("Apellido materno: " + apellidoMaterno);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Comuna: " + comuna);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Número de cuenta corriente: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo: " + cuenta.getSaldo() + " pesos");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = null;
        int opcion;

        do {
            System.out.println("--- Menú ---");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Ver datos de cliente");
            System.out.println("3. Depositar");
            System.out.println("4. Girar");
            System.out.println("5. Consultar saldo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese Rut: ");
                    String rut = sc.nextLine();
                    if (rut.length() < 11 || rut.length() > 12) {
                        System.out.println("RUT inválido. Debe tener entre 11 y 12 caracteres.");
                        break;
                    }
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese apellido paterno: ");
                    String apellidoP = sc.nextLine();
                    System.out.print("Ingrese apellido materno: ");
                    String apellidoM = sc.nextLine();
                    System.out.print("Ingrese domicilio: ");
                    String domicilio = sc.nextLine();
                    System.out.print("Ingrese comuna: ");
                    String comuna = sc.nextLine();
                    System.out.print("Ingrese teléfono: ");
                    String telefono = sc.nextLine();
                    System.out.print("Ingrese número de cuenta corriente (9 dígitos): ");
                    int numeroCuenta = sc.nextInt();
                    sc.nextLine();
                    cliente = new Cliente(rut, nombre, apellidoP, apellidoM, domicilio, comuna, telefono, numeroCuenta);
                    System.out.println("¡Cliente registrado exitosamente!");
                    break;

                case 2:
                    if (cliente != null) {
                        cliente.mostrarDatos();
                    } else {
                        System.out.println("No hay cliente registrado.");
                    }
                    break;

                case 3:
                    if (cliente != null) {
                        System.out.print("Ingrese un monto para depositar: ");
                        int montoDep = sc.nextInt();
                        cliente.getCuenta().depositar(montoDep);
                    } else {
                        System.out.println("No hay cliente registrado.");
                    }
                    break;

                case 4:
                    if (cliente != null) {
                        System.out.print("Ingrese un monto para girar: ");
                        int montoGir = sc.nextInt();
                        cliente.getCuenta().girar(montoGir);
                    } else {
                        System.out.println("No hay cliente registrado.");
                    }
                    break;

                case 5:
                    if (cliente != null) {
                        cliente.getCuenta().consultarSaldo();
                    } else {
                        System.out.println("No hay cliente registrado.");
                    }
                    break;

                case 6:
                    System.out.println("Gracias por usar el sistema BBK. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 6);

        sc.close();
    }
}
