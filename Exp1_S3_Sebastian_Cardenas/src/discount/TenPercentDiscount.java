package discount; // Línea agregada

public class TenPercentDiscount extends DiscountDecorator { // Línea agregada
    public TenPercentDiscount(Component component) { // Línea agregada
        super(component); // Línea agregada
    } // Línea agregada

    @Override // Línea agregada
    public double getPrice() { // Línea agregada
        return component.getPrice() * 0.9; // Línea agregada
    } // Línea agregada

    @Override // Línea agregada
    public String getDescription() { // Línea agregada
        return component.getDescription() + " con 10% de descuento"; // Línea agregada
    } // Línea agregada
} // Línea agregada
