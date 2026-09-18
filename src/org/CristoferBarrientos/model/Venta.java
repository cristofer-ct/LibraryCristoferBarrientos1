package org.CristoferBarrientos.model;

/**
 * Entidad que representa el encabezado de una venta.
 * Mapea la tabla {@code ventas} de la base de datos y guarda el cliente
 * atendido y el usuario que registro la venta.
 *
 * @author Cristofer Barrientos
 * @version 1.0
 */
public class Venta {
    private int noVenta;
    private String fechaVenta;
    private double totalVenta;
    private long cuiCliente;
    private int idUsuario;

    public Venta() {
    }

    public Venta(int noVenta, String fechaVenta, double totalVenta, long cuiCliente, int idUsuario) {
        this.noVenta = noVenta;
        this.fechaVenta = fechaVenta;
        this.totalVenta = totalVenta;
        this.cuiCliente = cuiCliente;
        this.idUsuario = idUsuario;
    }

    public int getNoVenta() {
        return noVenta;
    }

    public void setNoVenta(int noVenta) {
        this.noVenta = noVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public long getCuiCliente() {
        return cuiCliente;
    }

    public void setCuiCliente(long cuiCliente) {
        this.cuiCliente = cuiCliente;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
