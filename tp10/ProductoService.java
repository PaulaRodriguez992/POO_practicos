package tp10;

import java.util.*;
import java.util.stream.Collectors;

public class ProductoService {
	
	private List<Producto> productos;

    public ProductoService(List<Producto> productos) {
		super();
		this.productos = productos;
	}

	// Tarea 1: Filtrar productos por categoría
    // Uso filter() para quedarme solo con los que coincidan en la categoría
    public List<Producto> obtenerProductosPorCategoria(String categoria) {
        return productos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase(categoria)) // Predicate
                .collect(Collectors.toList()); // recolecto en lista
    }

    // Tarea 2: Encontrar el producto más caro
    // Uso max() con Comparator.comparing
    public Optional<Producto> encontrarProductoMasCaro() {
        return productos.stream()
                .max(Comparator.comparing(Producto::getPrecio)); // devuelve Optional<Producto>
    }

    // Tarea 3: Nombres de productos con poco stock
    // Primero filtro, después transformo con map a solo el nombre
    public List<String> obtenerNombresProductosConPocoStock(int stockMaximo) {
        return productos.stream()
                .filter(p -> p.getStock() < stockMaximo) // stock menor a lo que pida el parámetro
                .map(Producto::getNombre) // transformación de Producto a String
                .collect(Collectors.toList());
    }

    // Tarea 4: Ordenar productos por categoría (asc) y precio (desc)
    public List<Producto> ordenarProductosPorCategoriaYPrecio() {
        return productos.stream()
                .sorted(
                        Comparator.comparing(Producto::getCategoria) // primero categoría alfabética
                                  .thenComparing(Comparator.comparing(Producto::getPrecio).reversed()) // precio desc
                )
                .collect(Collectors.toList());
    }

    // Tarea 5: Agrupar productos por categoría
    public Map<String, List<Producto>> agruparProductosPorCategoria() {
        return productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria)); // clave = categoría, valor = lista de productos
    }

    // Tarea 6: Calcular valor total del inventario
    // precio * stock de cada producto
    public double calcularValorTotalInventario() {
        return productos.stream()
                .mapToDouble(p -> p.getPrecio() * p.getStock()) // paso a double stream
                .sum();
    }

    // Tarea 7: Comparator reutilizable
    // Creamos un comparator para ordenar por stock ascendente y luego por nombre
    public List<Producto> obtenerProductosOrdenadosPorStockYNombre() {
        Comparator<Producto> comparador = Comparator
                .comparingInt(Producto::getStock) // menor a mayor stock
                .thenComparing(Producto::getNombre); // si tienen igual stock, ordeno por nombre
        return productos.stream()
                .sorted(comparador)
                .collect(Collectors.toList());
    }
    
    // Tarea 8: Buscar producto por nombre exacto
    // Uso filter y findFirst, devuelve Optional
    public Optional<Producto> buscarProductoPorNombre(String nombre) {
        return productos.stream()
                .filter(p -> p.getNombre().equalsIgnoreCase(nombre))
                .findFirst();
    }
}
