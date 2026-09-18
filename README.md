# LibraryApp — Semana 1: Modelo de entidades

Proyecto **Java (Ant) para Apache NetBeans**. Corresponde a la primera semana:
la capa de **modelo** (POJOs) del sistema de gestion de libreria.

## Contenido

    LibraryApp-Semana1/
    ├── nbproject/                 # Configuracion de NetBeans (Ant)
    ├── build.xml                  # Script Ant
    ├── manifest.mf
    └── src/org/CristoferBarrientos/
        ├── model/                 # Entidades de esta semana
        │   ├── Usuario.java       # id, username, email, firstName, lastName,
        │   │                      # passwordHash, rol, activo, fechaCreacion
        │   ├── Categoria.java     # idCategoria, nombreCategoria
        │   ├── Editorial.java     # nit, nombre, telefono, direccion
        │   ├── Autor.java         # idAutor, nombre, apellido, nacionalidad, biografia
        │   ├── Libro.java         # isbn, titulo, fechaPublicacion, precio,
        │   │                      # idCategoria, nitEditorial, stock (existencias)
        │   ├── AutorLibro.java    # relacion autor <-> libro
        │   ├── Cliente.java       # cui, nombre, apellido, correoElectronico
        │   ├── Venta.java         # noVenta, fechaVenta, totalVenta, cuiCliente, idUsuario
        │   ├── DetalleVenta.java  # idDetalleVenta, noVenta, isbn, cantidad, precio
        │   └── LineaVenta.java    # fila temporal de la pantalla de venta (libro + cantidad)
        └── system/
            └── Principal.java     # main() de prueba: instancia todos los modelos

## Como abrirlo en Apache NetBeans

1. Descomprimir la carpeta `LibraryApp-Semana1`.
2. NetBeans: **File > Open Project...** y seleccionar la carpeta.
3. Si pide resolver el `build-impl.xml`, aceptar la regeneracion.
4. Clic derecho en el proyecto > **Run** (clase principal `org.CristoferBarrientos.system.Principal`).

Requiere **JDK 21** (definido en `nbproject/project.properties` como
`javac.source=21` / `javac.target=21`). Si usas otro JDK, cambia esos dos valores.

## Que debe verse al ejecutar

Salida en la ventana **Output** confirmando que cada entidad se instancia y que
sus getters/setters funcionan (usuario, categoria, editorial, autor, libro,
autor-libro, cliente, linea de venta, venta y detalle de venta con su subtotal).

## Notas de diseno (POO)

- **Encapsulamiento**: todos los atributos son `private` y se exponen por
  getters/setters.
- Cada clase tiene **constructor vacio** (necesario para los DAO) y
  **constructor completo**.
- `toString()` devuelve el dato descriptivo de la entidad, para que las
  entidades se muestren bien en los `ComboBox` y `TableView` de JavaFX en
  semanas siguientes.
- Todavia **no hay conexion a base de datos ni interfaz grafica**: eso entra en
  las semanas siguientes (conexion MySQL, scripts SQL, patron DAO, login).
