package org.CristoferBarrientos.system;

import java.sql.Timestamp;
import org.CristoferBarrientos.model.Autor;
import org.CristoferBarrientos.model.AutorLibro;
import org.CristoferBarrientos.model.Categoria;
import org.CristoferBarrientos.model.Cliente;
import org.CristoferBarrientos.model.DetalleVenta;
import org.CristoferBarrientos.model.Editorial;
import org.CristoferBarrientos.model.Libro;
import org.CristoferBarrientos.model.LineaVenta;
import org.CristoferBarrientos.model.Usuario;
import org.CristoferBarrientos.model.Venta;

/**
 * Clase principal de la Semana 1.
 * Instancia cada una de las entidades del paquete
 * {@code org.CristoferBarrientos.model} e imprime sus datos en consola para
 * verificar constructores, getters y setters. Todavia no usa base de datos
 * ni interfaz grafica.
 *
 * @author Cristofer Barrientos
 * @version 1.0
 */
public class Principal {

    /**
     * Punto de entrada de la aplicacion.
     *
     * @param args argumentos de linea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        System.out.println("=== LibraryApp - Semana 1: Modelo de entidades ===\n");

        Usuario usuario = new Usuario("jperez", "jperez@paginaviva.com",
                "Juan", "Perez", "hash_temporal", "admin");
        usuario.setId(1);
        usuario.setActivo(true);
        usuario.setFechaCreacion(new Timestamp(System.currentTimeMillis()));
        System.out.println("Usuario: " + usuario
                + " | " + usuario.getFirstName() + " " + usuario.getLastName()
                + " | rol: " + usuario.getRol()
                + " | activo: " + usuario.isActivo());

        Categoria categoria = new Categoria(1, "Novela");
        System.out.println("Categoria: " + categoria);

        Editorial editorial = new Editorial("1234567-8", "Editorial Kinal",
                "22334455", "Zona 5, Guatemala");
        System.out.println("Editorial: " + editorial
                + " | NIT: " + editorial.getNit());

        Autor autor = new Autor(1, "Gabriel", "Garcia Marquez",
                "Colombiana", "Premio Nobel de Literatura 1982.");
        System.out.println("Autor: " + autor
                + " | nacionalidad: " + autor.getNacionalidad());

        Libro libro = new Libro("9780307474728", "Cien anos de soledad",
                "1967-05-30", 150.00, categoria.getIdCategoria(),
                editorial.getNit(), 12);
        System.out.println("Libro: " + libro
                + " | ISBN: " + libro.getIsbn()
                + " | Q" + libro.getPrecio()
                + " | stock: " + libro.getStock());

        AutorLibro autorLibro = new AutorLibro(1, autor.getIdAutor(), libro.getIsbn());
        System.out.println("AutorLibro: autor " + autorLibro.getIdAutor()
                + " -> libro " + autorLibro.getIsbn());

        Cliente cliente = new Cliente(2547896541101L, "Ana", "Lopez",
                "ana.lopez@correo.com");
        System.out.println("Cliente: " + cliente
                + " | CUI: " + cliente.getCui());

        LineaVenta linea = new LineaVenta(libro, 2);
        System.out.println("LineaVenta: " + linea.getTitulo()
                + " x" + linea.getCantidad()
                + " = Q" + linea.getSubtotal());

        Venta venta = new Venta(1, "2026-09-18", linea.getSubtotal(),
                cliente.getCui(), usuario.getId());
        System.out.println("Venta No." + venta.getNoVenta()
                + " | fecha: " + venta.getFechaVenta()
                + " | total: Q" + venta.getTotalVenta()
                + " | cliente: " + venta.getCuiCliente()
                + " | usuario: " + venta.getIdUsuario());

        DetalleVenta detalle = new DetalleVenta(1, venta.getNoVenta(),
                libro.getIsbn(), linea.getCantidad(), libro.getPrecio());
        System.out.println("DetalleVenta: " + detalle.getIsbn()
                + " | cantidad: " + detalle.getCantidad()
                + " | precio unitario: Q" + detalle.getPrecio()
                + " | total linea: Q" + (detalle.getCantidad() * detalle.getPrecio()));

        System.out.println("\nTodos los modelos se instanciaron correctamente.");
    }
}
