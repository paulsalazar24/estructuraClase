
package EstructurasDeDatosDinamicas;

class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

class ListaEnlazada {
    Nodo cabeza;

    public ListaEnlazada() {
        cabeza = null;  
    }

    public void agregarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    public void eliminarElemento(int dato) {
        if (cabeza == null) return; // Lista vacía

        if (cabeza.dato == dato) {
            cabeza = cabeza.siguiente; // Eliminar cabeza
            return;
        }

        Nodo temp = cabeza;
        while (temp.siguiente != null) {
            if (temp.siguiente.dato == dato) {
                temp.siguiente = temp.siguiente.siguiente;
                return;
            }
            temp = temp.siguiente;
        }
    }

    public void mostrarLista() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato + " ");
            temp = temp.siguiente;
        }
        System.out.println(); // Nueva línea al final
    }
}

public class TADimplementar {
     public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregarAlFinal(1);
        lista.agregarAlFinal(2);
        lista.agregarAlFinal(3);
        System.out.println("Elementos de la lista inicial:");
        lista.mostrarLista();  // Muestra 1 2 3

        lista.eliminarElemento(2);
        System.out.println("Elementos de la lista después de eliminar el 2:");
        lista.mostrarLista();  // Muestra 1 3
    }
}
