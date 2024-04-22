
package EstructurasDeDatos;

class Nodo {

    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class estructuraDinamica {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);
        lista.agregar(50);
        lista.imprimir(); // Salida: 10 20 30 40 50
    }
    
    private static class ListaEnlazada {

        Nodo cabeza;

        public ListaEnlazada() {
        }
        // Método para agregar un elemento al final de la lista
        public void agregar(int dato) {
            Nodo nuevo = new Nodo(dato);
            if (cabeza == null) {
                cabeza = nuevo;
            } else {
                Nodo temp = cabeza;
                while (temp.siguiente != null) {
                    temp = temp.siguiente;
                }
                temp.siguiente = nuevo;
            }
        }
        // Método para imprimir la lista
        public void imprimir() {
            Nodo temp = cabeza;
            while (temp != null) {
                System.out.print(temp.dato + " ");
                temp = temp.siguiente;
            }
            System.out.println();
        }
    }
    
}
