package discount; // Línea agregada

public abstract class DiscountDecorator implements Component { // Línea agregada
    protected final Component component; // Línea agregada

    protected DiscountDecorator(Component component) { // Línea agregada
        this.component = component; // Línea agregada
    } // Línea agregada

    @Override // Línea agregada
    public String getDescription() { // Línea agregada
        return component.getDescription(); // Línea agregada
    } // Línea agregada

    @Override // Línea agregada
    public double getPrice() { // Línea agregada
        return component.getPrice(); // Línea agregada
    } // Línea agregada

    @Override // Línea agregada
    public String getCategory() { // Línea agregada
        return component.getCategory(); // Línea agregada
    } // Línea agregada
} // Línea agregada
