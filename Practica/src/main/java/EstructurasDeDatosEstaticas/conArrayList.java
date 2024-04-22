
package EstructurasDeDatosEstaticas;

import java.util.ArrayList;
import java.util.Scanner;

public class conArrayList {
    public static void main(String[] args) {
        // Declaración y creación de un ArrayList de tipo Integer
    ArrayList<Integer> arrayList = new ArrayList<> () ;
    // Inserción de elementos en el ArrayList
    arrayList.add(78);
    arrayList.add(34);
    arrayList.add(64);
    
    // Mostrar los elementos del ArrayList
    System. out.println ("Elementos del ArrayList:") ;
    for (int i = 0; i < arrayList.size(); i++) {
        System. out.println ("Posición " + i +": " + arrayList.get (i) );
    }
    // Actualización de los valores
    Scanner scanner = new Scanner (System. in) ;
    for (int i = 0; i < arrayList.size (); i++){
        System. out. print ("Ingresa el nuevo valor para la posición " + i +": ");
        int nuevoValor = scanner.nextInt () ;
        arrayList.set (i, nuevoValor) ;
    }
    // Mostrar los elementos del ArrayList después de la actualización
    System.out.println("\nElementos del ArrayList después de la actualización:") ;
    for (int i = 0; i < arrayList.size(); i++) {
        System. out.println ("Posición " + i +": " + arrayList.get (i));
    }
    }
}
