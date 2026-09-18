package org.CristoferBarrientos.model;

/**
 * Entidad que representa la categoria o genero de un libro.
 * Mapea la tabla {@code categorias} de la base de datos.
 *
 * @author Cristofer Barrientos
 * @version 1.0
 */
public class Categoria {
    private int idCategoria;
    private String nombreCategoria;

    public Categoria() {
    }

    public Categoria(int idCategoria, String nombreCategoria) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @Override
    public String toString() {
        return nombreCategoria;
    }
}
