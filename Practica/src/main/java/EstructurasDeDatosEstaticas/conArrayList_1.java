
package EstructurasDeDatosEstaticas;

import static java.time.Clock.system;
import static java.time.InstantSource.system;
import java.util.ArrayList;
import java.util.Scanner;

public class conArrayList_1 {
    public static void main(String[] args) {
        //Declaracion y creacion de un ArrayList de tipo Integer
        ArrayList<Integer>arrayList = new ArrayList<>();
        //Insercion de elementos en el ArrayList
        arrayList.add(78);
        arrayList.add(34);
        arrayList.add(64);
        
        //Mostrar los elementos
        System.out.print("Elementos del ArrayList: ");
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println("Posicion" + i + ": " + arrayList.get(i));
        }
        
        //Eliminacion de valores
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la posición del valor que desea eliminar: ");
        int posicion = scanner.nextInt();
        if (posicion >= 0 && posicion < arrayList.size()){
            arrayList.remove(posicion);
            System.out.println("Elemento en la posicion:" + posicion + "eliminado correctamente.");
        } else {
            System.out.println("La posicion ingresada no es valida");
        }
        
        //Mostrar los elementos despues de la eliminación
        System.out.println("\nElementos del ArrayList despues de la eliminación: ");
        for (int i=0; i < arrayList.size(); i++){
            System.out.println("Posición" + i + ":" + arrayList.get(i));
        }
    }
}