# Semana 1 — Ramas y Pull Requests

Paquete raiz del proyecto: **`org.CristoferBarrientos`**
Cada paquete se desarrollo en su propia rama para integrarse mediante Pull Request.

| # | Rama | Paquete / contenido | Base del PR |
|---|------|---------------------|-------------|
| 1 | `feature/model` | `org.CristoferBarrientos.model` — 10 entidades + `package-info.java` | `main` |
| 2 | `feature/system` | `org.CristoferBarrientos.system` — `Principal` + `package-info.java` | `feature/model` |

> Orden obligatorio: `feature/system` depende de `feature/model`, porque
> `Principal` importa las entidades. Se hace primero el PR 1 (merge a `main`) y
> luego el PR 2 se actualiza con `git rebase main`.

## Publicar el repositorio

    cd repo
    git remote add origin https://github.com/<TU_USUARIO>/LibraryApp.git
    git push -u origin main
    git push origin feature/model
    git push origin feature/system

## Crear los Pull Requests en GitHub

1. **PR 1 — `feature/model` → `main`**
   - Titulo: `feat(model): entidades del dominio (Semana 1)`
   - Descripcion sugerida:
     - Crea el paquete `org.CristoferBarrientos.model`.
     - Entidades: `Usuario`, `Categoria`, `Editorial`, `Autor`, `Libro`,
       `AutorLibro`, `Cliente`, `Venta`, `DetalleVenta`, `LineaVenta`.
     - Cada clase con Javadoc de clase (`@author Cristofer Barrientos`,
       `@version 1.0`), atributos privados, constructor vacio, constructor
       completo, getters/setters y `toString()`.
   - Criterio de aceptacion: el paquete compila sin errores en NetBeans.

2. **PR 2 — `feature/system` → `main`** (despues de mergear el PR 1)
   - Titulo: `feat(system): clase Principal de prueba de modelos (Semana 1)`
   - Descripcion sugerida:
     - Crea el paquete `org.CristoferBarrientos.system` con `Principal`.
     - `main()` instancia todas las entidades e imprime sus datos en consola.
   - Criterio de aceptacion: `Run Project` imprime los datos de las 10
     entidades y termina con el mensaje de exito.

## Comandos de apoyo

    git switch feature/model          # trabajar en la rama del modelo
    git switch feature/system         # trabajar en la rama de arranque
    git log --all --oneline --graph   # ver el historial de ramas

    # generar la documentacion Javadoc del proyecto
    javadoc -d dist/javadoc -sourcepath src -subpackages org.CristoferBarrientos
