package cliente;

/**
 * Clase que representa un producto a comprar por un cliente.
 *
 * @author Sebastian Rojas
 * @version 1.0
 */
public class Producto {

    /**
     * El nombre del producto.
     */
    private String nombre;

    /**
     * El precio del producto.
     */
    private double precio;

    /**
     * Constructor de la clase Producto.
     *
     * @param nombre El nombre del producto.
     * @param precio El precio del producto.
     */
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return El precio del producto.
     */
    public double getPrecio() {
        return precio;
    }
}