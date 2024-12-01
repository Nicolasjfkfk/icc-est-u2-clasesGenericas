import java.util.ArrayList;
import java.util.List;

public class Tienda<T> {
    private List<Producto<T>> inventario;

    public Tienda() {
        this.inventario = new ArrayList<>();
    }

    public void agregarProducto(Producto<T> producto) {
        inventario.add(producto);
    }

    public void listarProductos() {
        System.out.println("Inventario de la tienda:");
        for (Producto<T> producto : inventario) {
            System.out.println(producto);
        }
    }

    public Producto<T> buscarProductoPorId(T id) {
        for (Producto<T> producto : inventario) {
            if (producto.getId().equals(id)) {
                return producto;
            }
        }
        return null;
    }
}
