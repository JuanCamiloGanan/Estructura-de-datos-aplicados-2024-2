package Libreria;

public class Libreria {

    // Atributos
    private Libro[] libros;
    private int cantidadLibros;

    // Constructor
    public Libreria(int capacidad) {
        libros = new Libro[capacidad];
        this.cantidadLibros = 0;
    }

    // Método para agregar un libro a la librería
    public void agregarLibro(Libro libro) {
        if (cantidadLibros < libros.length) {
            libros[cantidadLibros] = libro;
            cantidadLibros++;
            System.out.println("Libro agregado: " + libro.getTitulo() + " por " + libro.getAutor()); // Línea 15
        } else {
            System.out.println("No se pueden agregar más libros, la librería está llena.");
        }
    }

    // Método para prestar un libro por su título
    public void prestarLibro(String titulo) {
        for (int i = 0; i < cantidadLibros; i++) {
            if (libros[i].getTitulo().equalsIgnoreCase(titulo)) {
                if (libros[i].getDisponible()) {
                    libros[i].prestar();
                    System.out.println("Libro prestado: " + titulo);
                } else {
                    System.out.println("El libro '" + titulo + "' no está disponible.");
                }
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no está en la librería."); // Línea 28
    }

    // Método para devolver un libro por su título
    public void devolverLibro(String titulo) {
        for (int i = 0; i < cantidadLibros; i++) {
            if (libros[i].getTitulo().equalsIgnoreCase(titulo)) {
                if (!libros[i].getDisponible()) {
                    libros[i].devolver();
                    System.out.println("Libro devuelto: " + titulo);
                } else {
                    System.out.println("El libro '" + titulo + "' no estaba prestado.");
                }
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no está en la librería."); // Línea 38
    }

    // Método para buscar los libros por título o autor
    public void buscarLibro(String busqueda) {
        boolean encontrado = false;
        String busquedaLower = busqueda.toLowerCase();

        for (int i = 0; i < cantidadLibros; i++) {
            String tituloLower = libros[i].getTitulo().toLowerCase();
            String autorLower = libros[i].getAutor().toLowerCase();

            if (tituloLower.contains(busquedaLower) || autorLower.contains(busquedaLower)) {
                System.out.println("Libro encontrado: " + libros[i].getTitulo() + " por " + libros[i].getAutor());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron libros con la búsqueda: " + busqueda);
        }
    }
}