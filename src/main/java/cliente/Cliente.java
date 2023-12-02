package cliente;

import java.util.List;

/**
 * Representa un cliente en un supermercado.
 *
 * @author Sebastian Rojas
 * @version 1.0
 */
public class Cliente {

    /**
     * El ID del cliente.
     */
    private final int id;

    /**
     * La lista de productos que el cliente desea comprar.
     */
    private final List<Producto> productos;

    /**
     * Constructor de la clase Cliente.
     *
     * @param id El ID del cliente.
     * @param productos La lista de productos que el cliente desea comprar.
     */
    public Cliente(int id, List<Producto> productos) {
        this.id = id;
        this.productos = productos;
    }

    /**
     * Obtiene el ID del cliente.
     *
     * @return El ID del cliente.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene la lista de productos que el cliente desea comprar.
     *
     * @return La lista de productos que el cliente desea comprar.
     */
    public List<Producto> getProductos() {
        return productos;
    }
}