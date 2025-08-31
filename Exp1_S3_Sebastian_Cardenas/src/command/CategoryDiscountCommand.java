package command; // Línea agregada

import discount.Component; // Línea agregada
import discount.CategoryDiscount; // Línea agregada
import manager.DiscountManager; // Línea agregada

public class CategoryDiscountCommand implements Command { // Línea agregada
    private final Component product; // Línea agregada
    private final String category; // Línea agregada
    private final double percentage; // Línea agregada

    public CategoryDiscountCommand(Component product, String category, double percentage) { // Línea agregada
        this.product = product; // Línea agregada
        this.category = category; // Línea agregada
        this.percentage = percentage; // Línea agregada
    } // Línea agregada

    @Override // Línea agregada
    public void ejecutar() { // Línea agregada
        Component discounted = new CategoryDiscount(product, category, percentage); // Línea agregada
        double finalPrice = DiscountManager.getInstance().applyDiscount(discounted); // Línea agregada
        System.out.println("Precio final con descuento de categoria: " + finalPrice); // Línea agregada
    } // Línea agregada
} // Línea agregada
