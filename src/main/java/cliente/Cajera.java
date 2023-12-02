package cliente;

/**
 * Representa una cajera en un supermercado.
 *
 * @author Sebastian Rojas
 * @version 1.0
 */
public class Cajera extends Thread {

    /**
     * El ID de la cajera.
     */
    private final int id;

    /**
     * Constructor de la clase Cajera.
     *
     * @param id El ID de la cajera.
     */
    public Cajera(int id) {
        this.id = id;
    }

    /**
     * Cobra a un cliente.
     *
     * @param cliente El cliente a cobrar.
     */
    public void cobrar(Cliente cliente) {
        
        synchronized (cliente) {
            
            System.out.println("Cajera " + id + " está cobrando al Cliente " + cliente.getId());

            for (Producto producto : cliente.getProductos()) {
                System.out.println("Cajera " + id + " está procesando el producto: " + producto.getNombre());

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Cajera " + id + " ha terminado de cobrar al Cliente " + cliente.getId());
        }
    }
}