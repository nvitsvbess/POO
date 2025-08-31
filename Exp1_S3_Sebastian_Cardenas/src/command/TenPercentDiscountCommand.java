package command; // Línea agregada

import discount.Component; // Línea agregada
import discount.TenPercentDiscount; // Línea agregada
import manager.DiscountManager; // Línea agregada

public class TenPercentDiscountCommand implements Command { // Línea agregada
    private final Component product; // Línea agregada

    public TenPercentDiscountCommand(Component product) { // Línea agregada
        this.product = product; // Línea agregada
    } // Línea agregada

    @Override // Línea agregada
    public void ejecutar() { // Línea agregada
        Component discounted = new TenPercentDiscount(product); // Línea agregada
        double finalPrice = DiscountManager.getInstance().applyDiscount(discounted); // Línea agregada
        System.out.println("Precio final con 10%: " + finalPrice); // Línea agregada
    } // Línea agregada
} // Línea agregada
