package manager; // Línea agregada

import discount.Component; // Línea agregada

public class DiscountManager { // Línea agregada
    private static DiscountManager instance; // Línea agregada

    private DiscountManager() { // Línea agregada
    } // Línea agregada

    public static synchronized DiscountManager getInstance() { // Línea agregada
        if (instance == null) { // Línea agregada
            instance = new DiscountManager(); // Línea agregada
        } // Línea agregada
        return instance; // Línea agregada
    } // Línea agregada

    public double applyDiscount(Component product) { // Línea agregada
        return product.getPrice(); // Línea agregada
    } // Línea agregada
} // Línea agregada
