package org.CristoferBarrientos.model;

/**
 * Entidad de la relacion muchos a muchos entre autores y libros.
 * Mapea la tabla {@code autor_libro} de la base de datos.
 *
 * @author Cristofer Barrientos
 * @version 1.0
 */
public class AutorLibro {
    private int idAutorLibro;
    private int idAutor;
    private String isbn;

    public AutorLibro() {
    }

    public AutorLibro(int idAutorLibro, int idAutor, String isbn) {
        this.idAutorLibro = idAutorLibro;
        this.idAutor = idAutor;
        this.isbn = isbn;
    }

    public int getIdAutorLibro() {
        return idAutorLibro;
    }

    public void setIdAutorLibro(int idAutorLibro) {
        this.idAutorLibro = idAutorLibro;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
