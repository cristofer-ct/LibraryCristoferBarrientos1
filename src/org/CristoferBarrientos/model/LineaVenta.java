package org.CristoferBarrientos.model;

/**
 * Objeto de apoyo que representa una linea temporal de la pantalla de venta.
 * No corresponde a ninguna tabla: agrupa un {@link Libro} con su cantidad y
 * calcula el subtotal antes de guardar los {@link DetalleVenta} en la base de datos.
 *
 * @author Cristofer Barrientos
 * @version 1.0
 */
public class LineaVenta {
    private Libro libro;
    private int cantidad;

    public LineaVenta() {
    }

    public LineaVenta(Libro libro, int cantidad) {
        this.libro = libro;
        this.cantidad = cantidad;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getIsbn() {
        return libro.getIsbn();
    }

    public String getTitulo() {
        return libro.getTitulo();
    }

    public double getPrecio() {
        return libro.getPrecio();
    }

    public double getSubtotal() {
        return libro.getPrecio() * cantidad;
    }
}
