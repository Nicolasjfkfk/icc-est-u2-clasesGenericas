public class App {
    public static void main(String[] args) throws Exception {
       // Crear tienda de productos con IDs enteros
       Tienda<Integer> tiendaElectronicos = new Tienda<>();

       // Agregar productos
       tiendaElectronicos.agregarProducto(new Producto<>(101, "Laptop ", 1200.50));
       tiendaElectronicos.agregarProducto(new Producto<>(102, "Smartphone ", 800.99));
       tiendaElectronicos.agregarProducto(new Producto<>(103, "Tablet ", 400.00));

       // Listar productos
       tiendaElectronicos.listarProductos();

       // Buscar un producto por ID
       Producto<Integer> buscado = tiendaElectronicos.buscarProductoPorId(102);
       if (buscado != null) {
           System.out.println("Producto encontrado: " + buscado);
       } else {
           System.out.println("Producto no encontrado.");
       }
   }
}
    

