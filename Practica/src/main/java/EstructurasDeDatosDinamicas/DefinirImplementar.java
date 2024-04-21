package EstructurasDeDatosDinamicas;

class NodoLista {
    int dato;
    NodoLista siguiente;

    public NodoLista(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class DefinirImplementar {
    private NodoLista cabeza;

    public DefinirImplementar() {
        this.cabeza = null;
    }

    // Agregar elemento al final de la lista
    public void agregarAlFinal(int dato) {
        NodoLista nuevoNodo = new NodoLista(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoLista actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    // Eliminar elemento
    public void eliminar(int dato) {
        if (cabeza == null) {
            return;
        }
        if (cabeza.dato == dato) {
            cabeza = cabeza.siguiente;
            return;
        }
        NodoLista actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.dato != dato) {
            actual = actual.siguiente;
        }
        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }

    // Buscar elemento
    public boolean buscar(int dato) {
        NodoLista actual = cabeza;
        while (actual != null) {
            if (actual.dato == dato) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // Recorrer la lista
    public void recorrer() {
        NodoLista actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DefinirImplementar lista = new DefinirImplementar();

        // Agregar elementos al final
        lista.agregarAlFinal(10);
        lista.agregarAlFinal(20);
        lista.agregarAlFinal(30);

        // Recorrer la lista
        System.out.println("Lista original:");
        lista.recorrer();

        // Buscar elemento
        int datoBuscado = 20;
        if (lista.buscar(datoBuscado)) {
            System.out.println("El elemento " + datoBuscado + " está en la lista.");
        } else {
            System.out.println("El elemento " + datoBuscado + " no está en la lista.");
        }

        // Eliminar elemento
        int datoEliminar = 20;
        lista.eliminar(datoEliminar);

        // Recorrer la lista después de eliminar
        System.out.println("Lista después de eliminar el elemento " + datoEliminar + ":");
        lista.recorrer();
    }
}
