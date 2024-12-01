
# Proyecto: Tienda Genérica

## Descripción
Este proyecto simula una tienda que puede manejar productos genéricos con diferentes tipos de identificadores (números, cadenas, etc.). Se implementa utilizando clases genéricas para facilitar la flexibilidad del manejo de datos.

## Definición de Clases Genéricas
1. **Clase `Producto<T>`**
   - Esta clase utiliza un tipo genérico `T` para permitir que el identificador del producto (`id`) pueda ser de cualquier tipo, como `Integer`, `String`, o cualquier otro objeto.
   - Atributos:
     - `T id`: Identificador del producto.
     - `String nombre`: Nombre del producto.
     - `double precio`: Precio del producto.

2. **Clase `Tienda<T>`**
   - Usa un tipo genérico `T` para manejar una lista de productos, permitiendo que todos los productos compartan el mismo tipo genérico para sus identificadores.
   - Métodos:
     - `agregarProducto(Producto<T> producto)`: Agrega un producto al inventario.
     - `listarProductos()`: Imprime todos los productos del inventario.
     - `buscarProductoPorId(T id)`: Busca un producto específico por su identificador.

## Ejecución
Al ejecutar el programa:
1. Se crea una tienda que maneja productos con identificadores enteros.
2. Se agregan productos a la tienda y se listan en consola.
3. Se busca un producto por su identificador y se muestra el resultado.

## Interpretación
Las clases genéricas permiten que el código sea reutilizable y adaptable para diferentes casos. Por ejemplo, si se quisiera implementar una tienda con identificadores en forma de cadenas (e.g., "P101"), solo sería necesario cambiar el tipo genérico `T` al inicializar la tienda.

## Ejemplo de Salida
```plaintext
Inventario de la tienda:
Producto{id=101, nombre='Laptop', precio=1200.5}
Producto{id=102, nombre='Smartphone', precio=800.99}
Producto{id=103, nombre='Tablet', precio=400.0}
Producto encontrado: Producto{id=102, nombre='Smartphone', precio=800.99}
