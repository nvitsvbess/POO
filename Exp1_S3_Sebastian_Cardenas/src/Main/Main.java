package main;

import cliente.Cliente;
import modelo.CuentaBancaria;
import modelo.CuentaBancariaCorriente;
import modelo.CuentaBancariaAhorro;
import modelo.CuentaBancariaDigital;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del cliente:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el RUT del cliente:");
        String rut = sc.nextLine();

        System.out.println("Ingrese el número de cuenta (9 dígitos):");
        int numeroCuenta = sc.nextInt();

        System.out.println("Ingrese el saldo inicial de la cuenta:");
        int saldo = sc.nextInt();

        System.out.println("Seleccione el tipo de cuenta:");
        System.out.println("1. Cuenta Corriente");
        System.out.println("2. Cuenta de Ahorros");
        System.out.println("3. Cuenta Digital");
        int opcion = sc.nextInt();

        CuentaBancaria cuenta;
        switch (opcion) {
            case 1:
                cuenta = new CuentaBancariaCorriente(numeroCuenta, saldo);
                break;
            case 2:
                cuenta = new CuentaBancariaAhorro(numeroCuenta, saldo);
                break;
            case 3:
                cuenta = new CuentaBancariaDigital(numeroCuenta, saldo);
                break;
            default:
                System.out.println("Opción inválida. Se asignará Cuenta Corriente por defecto.");
                cuenta = new CuentaBancariaCorriente(numeroCuenta, saldo);
        }

        Cliente cliente = new Cliente(nombre, rut, cuenta);
        System.out.println("\n--- Información del Cliente ---");
        cliente.mostrarInformacionCliente();

        sc.close();
    }
}