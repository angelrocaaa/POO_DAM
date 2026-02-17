# Práctica 1. Práctica de compra-venta de casas

## ÍNDICE
1. [Intro](#1-intro)
2. [Estructura de clases](#2-estructura-de-clases)
   - Diagrama de clases UML
   - Código de PlantUML
   - Contenido de las clases (.java)
4. [Programa principal](#3-programa-principal)
5. [Pruebas](#4-pruebas)
6. [Entrega](#5-entrega)

### 1. Intro
> La práctica consiste en una app de un sistema de pagos para tu tienda de cursos online. La tienda acepta
diferentes métodos de pago, como tarjeta de crédito, PayPal o Bizum. Cada método de pago tiene una
forma distinta de procesar el pago, pero todos comparten la misma funcionalidad básica para hacerlo: un
método llamado procesarPago().

### 2. Estructura de clases

#### Diagrama de clases UML
![](media/biblio.png)

#### Código de PlantUML


````
@startuml
package biblio {

    class Estudiante {
        - static CORREO_FORMAT : String
        - static contadorEstudiantes : int
        --
        - nombre : String
        - curso : String
        - NIA : int
        - email : String
        - listaLibros : ArrayList<Libro>
        --
        + Estudiante(nombre : String, curso : String, email : String)
        + Estudiante(nombre : String)
        + obtenerTotalEstudiantes() : int
        + validarCorreo(correo : String) : boolean
        + insertarLibro(libro : Libro) : void
        + borrarLibro(libro : Libro) : void
    }

    class Editorial {
        - nombre : String
        - pais : String
        - listaLibrosEditoriales : ArrayList<Libro>
        --
        + Editorial(nombre : String, pais : String)
        + Editorial()
        + insertarLibro(libro : Libro) : void
        + borrarLibro(libro : Libro) : void
    }

    class Libro {
        - static cantidadLibros : int
        - static librosDisponibles : int
        + static CADENA_ID : String
        --
        - titulo : String
        - autor : String
        - id : String
        - disponible : boolean
        - editorial : Editorial
        - estudiantePrestado : Estudiante
        --
        + Libro(titulo : String, autor : String, editorial : Editorial)
        - calcularID() : String
        + prestar(estudiante : Estudiante) : Prestamo
        + devolver() : void
        + estaDisponible() : boolean
    }

    class Prestamo {
        - libro : Libro
        - estudiante : Estudiante
        - fecha : LocalDateTime
        --
        + Prestamo(libro : Libro, estudiante : Estudiante)

    }

}

' ===========================
'        RELACIONES
' *-- = composicion
' -- o o--o = bidireccional
' o--> = agregacion
' ===========================

Estudiante "1" -- "*" Libro : >
Libro "*" -- "1" Editorial : pertenece a >
Prestamo "1" o--> "1" Libro
Prestamo "1" o--> "1" Estudiante

@enduml

````

#### Contenido de las clases (.java)

- Clase **Estudiante**:

````
package biblio;

import java.util.ArrayList;

public class Estudiante {

    private static final String CORREO_FORMAT = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";
    private static int contadorEstudiantes = 0;

    private String nombre;
    private String curso;
    private int NIA;
    private String email;
    private ArrayList<Libro> listaLibros;

    public Estudiante (String nombre, String curso, String email) {
        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        setNIA();
        listaLibros = new ArrayList<>();
    }

    public Estudiante (String nombre) {
        this(nombre,"", "");
    }

    public static int obtenerTotalEstudiantes () {
        return contadorEstudiantes;
    }

    public static boolean validarCorreo (String correo) {
        if(correo.matches(CORREO_FORMAT)) {
            return true;
        } else {
            return false;
        }
    }

    public void insertarLibro (Libro libro) {
        listaLibros.add(libro);
    }

    public void borrarLibro (Libro libro) {
        listaLibros.remove(libro);
    }

    public ArrayList<Libro> getListaLibrosLibros() {
        return listaLibros;
    }

    public int getNIA() {
        return NIA;
    }

    private void setNIA() {
        NIA = ++contadorEstudiantes;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                ", NIA=" + NIA +
                ", email='" + email + '\'' +
                //", libros='" + listaLibros + '\'' +
                '}';
    }

}

````

[Link acceso a GitHub](https://github.com/angelrocaaa/POO_DAM/blob/main/POO_1dam/src/main/java/biblio/Estudiante.java)

### 3. Programa principal

### 4. Pruebas

### 5. Entrega

- [X] Código fuente en Github: [Link]()
- [ ] Documentacion
- [ ] Pruebas
