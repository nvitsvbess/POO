package demo; // Línea agregada

import command.*; // Línea agregada
import discount.*; // Línea agregada

public class DiscountDemo { // Línea agregada
    public static void main(String[] args) { // Línea agregada
        Component shirt = new Product("Camisa", "ropa", 100.0); // Línea agregada
        Invoker invoker = new Invoker(); // Línea agregada
        invoker.addCommand(new TenPercentDiscountCommand(shirt)); // Línea agregada
        invoker.addCommand(new CategoryDiscountCommand(shirt, "ropa", 0.2)); // Línea agregada
        invoker.executeCommands(); // Línea agregada
    } // Línea agregada
} // Línea agregada
