
package EstructurasDeDatosEstaticas;

import java.util.Scanner;

public class conArray {
    public static void main(String[] args) {
       // Declaración y creación de un array de tipo int
    int[] array = new int [3];
    // Inserción de elementos en el array
    array [0] = 10;
    array [1] = 20;
    array [2] = 30;
    // Mostrar los elementos del array
    System.out.println ("Elementos del array:") ;
    for (int i = 0; i < array.length; i++) {
       System.out.println ("posición " + i +": " + array[i]);
    }
    // Actualización manual de los valores
    Scanner scanner = new Scanner (System. in) ;
    for (int i = 0; i < array. length; i++){
        System. out.print ("Ingresa el nuevo valor para la posición " + i + ": ") ;
        array[i] = scanner.nextInt () ;
    }
    
    // Mostrar los elementos del array después de la actualización
    System.out.println("\nElementos después de la actualización:") ;
    for (int i = 0; i < array.length; i++) {
        System. out.println ("Posición " + i +": " + array[i]);
    }
    }
}
