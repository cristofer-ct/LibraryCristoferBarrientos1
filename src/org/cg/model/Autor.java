/*
 * autor cristofer 
 */
package org.cg.model;

/**
 *
 * @author lidia
 */
public class Autor {

    // 1. Declaración de Atributos
    private int idAutor;
    private String nombreAutor;
    private String apellidoAutor;
    private String nacionalidad;
    private String biografia;

    // 2. Constructor vacío
    public Autor() {
    }

    // 3. Constructor con parámetros
    public Autor(int idAutor, String nombreAutor, String apellidoAutor, String nacionalidad, String biografia) {
        this.idAutor = idAutor;
        this.nombreAutor = nombreAutor;
        this.apellidoAutor = apellidoAutor;
        this.nacionalidad = nacionalidad;
        this.biografia = biografia;
    }

    // 4. Métodos Getters y Setters
    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getApellidoAutor() {
        return apellidoAutor;
    }

    public void setApellidoAutor(String apellidoAutor) {
        this.apellidoAutor = apellidoAutor;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    // 5. Método toString
    @Override
    public String toString() {
        return nombreAutor + " " + apellidoAutor;
    }
}