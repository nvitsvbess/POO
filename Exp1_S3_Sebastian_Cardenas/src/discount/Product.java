package discount; // Línea agregada

public class Product implements Component { // Línea agregada
    private final String name; // Línea agregada
    private final String category; // Línea agregada
    private final double price; // Línea agregada

    public Product(String name, String category, double price) { // Línea agregada
        this.name = name; // Línea agregada
        this.category = category; // Línea agregada
        this.price = price; // Línea agregada
    } // Línea agregada

    @Override // Línea agregada
    public String getDescription() { // Línea agregada
        return name + " (" + category + ")"; // Línea agregada
    } // Línea agregada

    @Override // Línea agregada
    public double getPrice() { // Línea agregada
        return price; // Línea agregada
    } // Línea agregada

    @Override // Línea agregada
    public String getCategory() { // Línea agregada
        return category; // Línea agregada
    } // Línea agregada
} // Línea agregada
