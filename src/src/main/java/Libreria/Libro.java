package Libreria;

public class Libro {

    public String titulo;
    public String autor;
    public boolean disponible;

    //Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true; //El libro esta disponible cuando se crea
    }

    //Metodo para obtener la informacion del libro

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean getDisponible() {
        return disponible;
    }

    //Metodo para marcr un libro como prestado
    public void prestar() {
        if (disponible) {
            disponible = false;
        }
    }

    //Metodo para marcar un libro como devuelto
    public void devolver() {
        if (!disponible) {
            disponible = true;
        }
    }
}
