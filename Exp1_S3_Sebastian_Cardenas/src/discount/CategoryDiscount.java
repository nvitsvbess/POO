package discount; // Línea agregada

public class CategoryDiscount extends DiscountDecorator { // Línea agregada
    private final String targetCategory; // Línea agregada
    private final double percentage; // Línea agregada

    public CategoryDiscount(Component component, String targetCategory, double percentage) { // Línea agregada
        super(component); // Línea agregada
        this.targetCategory = targetCategory; // Línea agregada
        this.percentage = percentage; // Línea agregada
    } // Línea agregada

    @Override // Línea agregada
    public double getPrice() { // Línea agregada
        if (component.getCategory().equalsIgnoreCase(targetCategory)) { // Línea agregada
            return component.getPrice() * (1 - percentage); // Línea agregada
        } // Línea agregada
        return component.getPrice(); // Línea agregada
    } // Línea agregada

    @Override // Línea agregada
    public String getDescription() { // Línea agregada
        return component.getDescription() + " con descuento de " + (int)(percentage * 100) + "% en categoría " + targetCategory; // Línea agregada
    } // Línea agregada
} // Línea agregada
