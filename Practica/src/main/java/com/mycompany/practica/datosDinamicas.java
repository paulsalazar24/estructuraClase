package com.mycompany.practica;

import java.util.NoSuchElementException;

// Interfaz para la cola
interface Cola<T> {
    void encolar(T elemento);  // Agrega un elemento al final de la cola
    T desencolar();            // Remueve y retorna el elemento al frente de la cola
    T frente();                // Retorna el elemento al frente sin removerlo
    boolean estaVacia();       // Verifica si la cola está vacía
    int tamano();              // Retorna el número de elementos en la cola
}

// Implementación de la Cola usando un arreglo
class ColaArray<T> implements Cola<T> {
    private T[] elementos;
    private int tamano = 0;
    private int inicio = 0;
    private int fin = 0;
    private static final int CAPACIDAD_INICIAL = 10;

    @SuppressWarnings("unchecked")
    public ColaArray() {
        elementos = (T[]) new Object[CAPACIDAD_INICIAL];
    }

    @Override
    public void encolar(T elemento) {
        if (tamano == elementos.length) {
            aumentarCapacidad();
        }
        elementos[fin] = elemento;
        fin = (fin + 1) % elementos.length;
        tamano++;
    }

    @Override
    public T desencolar() {
        if (estaVacia()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        T elemento = elementos[inicio];
        elementos[inicio] = null; // Ayuda al recolector de basura
        inicio = (inicio + 1) % elementos.length;
        tamano--;
        return elemento;
    }

    @Override
    public T frente() {
        if (estaVacia()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        return elementos[inicio];
    }

    @Override
    public boolean estaVacia() {
        return tamano == 0;
    }

    @Override
    public int tamano() {
        return tamano;
    }

    private void aumentarCapacidad() {
        T[] nuevoArray = (T[]) new Object[elementos.length * 2];
        for (int i = 0; i < tamano; i++) {
            nuevoArray[i] = elementos[(inicio + i) % elementos.length];
        }
        elementos = nuevoArray;
        inicio = 0;
        fin = tamano;
    }
}

// Clase principal que contiene el método main
public class datosDinamicas {
    public static void main(String[] args) {
        Cola<Integer> cola = new ColaArray<>();

        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);

        System.out.println("Elemento al frente: " + cola.frente()); // Debería imprimir 10
        while (!cola.estaVacia()) {
            System.out.println(cola.desencolar()); // Imprime 10, 20, 30 en orden
        }
    }
}
