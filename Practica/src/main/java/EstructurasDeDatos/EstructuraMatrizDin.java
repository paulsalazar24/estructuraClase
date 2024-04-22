package EstructurasDeDatos;

// Clase Elemento
class Elemento {
    int dato;
    Elemento siguiente;
    // Constructor
    public Elemento(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class EstructuraMatrizDin {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.insertarAlFinal(1);
        lista.insertarAlFinal(2);
        lista.insertarAlFinal(3);
        lista.insertarAlFinal(3);
        lista.insertarAlFinal(3);
        // Imprimir la lista
        System.out.println("Lista enlazada:");
        lista.imprimirLista();
    }

    private static class ListaEnlazada {
        Elemento inicio;

        // Constructor
        public ListaEnlazada() {
            this.inicio = null;
        }

        public void insertarAlFinal(int dato) {
            Elemento nuevoElemento = new Elemento(dato);
            if (inicio == null) {
                inicio = nuevoElemento;
            } else {
                Elemento temp = inicio;
                while (temp.siguiente != null) {
                    temp = temp.siguiente;
                }
                temp.siguiente = nuevoElemento;
            }
        }

        // Método para imprimir la lista
        public void imprimirLista() {
            Elemento temp = inicio;
            while (temp != null) {
                System.out.print(temp.dato + " ");
                temp = temp.siguiente;
            }
            System.out.println();
        }
    }
}
