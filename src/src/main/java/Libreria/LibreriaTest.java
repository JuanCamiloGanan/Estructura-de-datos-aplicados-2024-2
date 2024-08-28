package Libreria;

public class LibreriaTest {
    public static void main(String[] args) {
        // Crear una instancia de la librería con capacidad para 5 libros
        Libreria libreria = new Libreria(5);

        // Agregar libros a la librería
        libreria.agregarLibro(new Libro("El principito", "Antoine de Saint-Exupéry"));
        libreria.agregarLibro(new Libro("El alquimista", "Paulo Coelho"));
        libreria.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez"));
        libreria.agregarLibro(new Libro("La perla", "John Steinbeck"));
        libreria.agregarLibro(new Libro("La luna", "Julio Cortázar"));

        // Intentar prestar un libro que está disponible
        libreria.prestarLibro("El alquimista");

        // Intentar prestar un libro que no está disponible
        libreria.prestarLibro("El alquimista");

        // Intentar devolver un libro que se ha prestado
        libreria.devolverLibro("El alquimista");

        // Intentar devolver un libro que no se ha prestado
        libreria.devolverLibro("El alquimista");

        // Buscar libros por título
        libreria.buscarLibro("La perla");

        // Buscar libros por autor
        libreria.buscarLibro("John Steinbeck");

        // Buscar libros que no existen
        libreria.buscarLibro("El Hobbit");
    }
}
