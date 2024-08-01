
package EstructurasDeDatosEstaticas.ActualizarValor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class conHashMap {
    public static void main(String[] args) {
        //Declaración y creación de un HashMap de tipo Integer a String
        HashMap<Integer,String>hashMap = new HashMap<>();
        //Inspeccion de elementos en el HashMap
        hashMap.put(1,"21");
        hashMap.put(1,"42");
        hashMap.put(1,"67");
        //Mostrar los elementos del HashMap
        for(Integer key : hashMap.keySet()){
            System.out.println("Clave" + key+ ": " + hashMap.get(key));
        }
        //Actualizacion de los valores
        Scanner scanner=new Scanner(System.in);
        for (Integer key : hashMap.keySet()){
            System.out.print("Ingresa el nuevo valor para la clave" + key + ":");
            String nuevoValor = scanner.nextLine();
            hashMap.put(key, nuevoValor);       
        }
        //Mostrar los elementos del HashMap despues de la aactualizacion
        for (Integer key : hashMap.keySet()){
            System.out.println("Clave" + key + ":" + hashMap.get(key));
        }

    }
}
