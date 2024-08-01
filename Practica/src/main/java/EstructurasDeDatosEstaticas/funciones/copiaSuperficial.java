
package EstructurasDeDatosEstaticas.funciones;

import java.util.Arrays;

public class copiaSuperficial {
    public static void main(String[] args) {
        Integer[] original = {1, 2, 3, 4, 5};
        
        //Realizamos la copia superficial
        Integer[] copia = original.clone();
                
        //Modificamos la copia
        copia[0] = 10;    
        
        //Imprimimos ambos arrays
        System.out.println("Array original: " + Arrays.toString(original));
        System.out.println("Array copia: " + Arrays.toString(copia));
    }
}
