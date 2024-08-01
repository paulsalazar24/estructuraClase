/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package EstructurasDeDatosEstaticas.unidimensionalesArreglos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author LEVI
 */
public class Ejemplos {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        // Declaración y creación de un HashMap 
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Ingreso de elementos en el HashMap
        System.out.print("Ingrese la cantidad de elementos que desea agregar: ");
        int cantidadElementos = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < cantidadElementos; i++) {
            System.out.print("Ingrese la posición del elemento " + (i + 1) + ": ");
            String posicion = scanner.nextLine();
            System.out.print("Ingrese el valor del elemento " + (i + 1) + ": ");
            int valor = scanner.nextInt();
            scanner.nextLine(); 
            hashMap.put(posicion, valor);
        }

        // Mostrar los elementos 
        System.out.println("\nElementos:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Posición: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        // Actualización de los valores
        System.out.println("\nActualización de valores:");
        for (String posicion : hashMap.keySet()) {
            System.out.print("Ingrese el nuevo valor para " + posicion + ": ");
            int nuevoValor = scanner.nextInt();
            hashMap.put(posicion, nuevoValor);
        }

        // Mostrar los elementos después de la actualización
        System.out.println("\nElementos después de la actualización:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Posición: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        // Eliminación de valores
        System.out.print("\nIngrese la posición del elemento que desea eliminar: ");
        int posicionEliminar = scanner.nextInt();
        String claveEliminar = null;
        if (posicionEliminar >= 0 && posicionEliminar < hashMap.size()) {
            int contador = 0;
            for (String posicion : hashMap.keySet()) {
                if (contador == posicionEliminar) {
                    claveEliminar = posicion;
                    break;
                }
                contador++;
            }
            hashMap.remove(claveEliminar);
            System.out.println("Elemento con posición " + claveEliminar + " eliminado correctamente.");
        } else {
            System.out.println("La posición ingresada no es válida.");
        }

        // Mostrar los elementos después de la eliminación
        System.out.println("\nElementos después de la eliminación:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Posición: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
        
        scanner.close();
    }
}
