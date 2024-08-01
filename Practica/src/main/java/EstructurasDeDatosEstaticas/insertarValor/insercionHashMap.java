
package EstructurasDeDatosEstaticas.insertarValor;

import java.util.HashMap;

public class insercionHashMap {
    public static void main(String[] args) {
        // Declaración y creación de un HashMap de tipo String
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Inserción de elementos en el HashMap
        hashMap.put(2, "22");  
        hashMap.put(3, "67");  
        hashMap.put(1, "8");  

        // Mostrar los elementos del HashMap
        System.out.println("Elementos del HashMap: " + hashMap);
    }
}
