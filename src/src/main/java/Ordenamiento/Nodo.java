package Ordenamiento;

public class Nodo {
    int valor;
    Nodo siguiente;

    public Nodo(int valor){
        this.valor = valor;
        this.siguiente = null;
    }
}

class ListaEnlazada{
    Nodo cabeza;

    public ListaEnlazada(){
        this.cabeza = null;
    }

    public void insertar(int valor){
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null){
            cabeza = nuevo;
        }
        else{
            Nodo actual = cabeza;
            while (actual.siguiente != null){
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void imprimir(){
        Nodo actual = cabeza;
        while (actual != null){
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public void ordenar(){
        Nodo actual = cabeza;
        Nodo siguiente = null;
        int temp;

        while (actual != null){
            siguiente = actual.siguiente;

            while (siguiente != null){
                if (actual.valor > siguiente.valor){
                    temp = actual.valor;
                    actual.valor = siguiente.valor;
                    siguiente.valor = temp;
                }
                siguiente = siguiente.siguiente;
            }
            actual = actual.siguiente;
        }
    }

    public static void main(String[] args){
        ListaEnlazada lista = new ListaEnlazada();
        lista.insertar(5);
        lista.insertar(3);
        lista.insertar(8);
        lista.insertar(1);
        lista.insertar(2);

        System.out.println("Lista original:");
        lista.imprimir();

        lista.ordenar();

        System.out.println("Lista ordenada:");
        lista.imprimir();
    }
}

