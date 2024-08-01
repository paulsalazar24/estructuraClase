
package EstructurasDeDatosEstaticas.funciones;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class comparacionDuplicados {
    public static void main(String[] args) {
        //<Integer>
        //Definimos un array con elementos duplicados
        int[] numerosConDuplicados = {1, 2, 3, 3, 4, 5, 5, 6, 7, 7};
        
        //Convertimos el array en un conjunto 
        LinkedHashSet <Integer> conjuntoSinDuplicados = new LinkedHashSet<>();
        for ( int numero : numerosConDuplicados){
            conjuntoSinDuplicados.add(numero);
        }
        
        //Convertimos el conjunto de nuevo a un array
        int[] numeroSinDuplicados = new int[conjuntoSinDuplicados.size()];
        int indice = 0;
        for (int numero : conjuntoSinDuplicados) {
            numeroSinDuplicados[indice++] = numero;
        }
        
        //Imprimimos el array sin cuplicados
        System.out.println("Array sin duplicados: ");
         System.out.println(Arrays.toString(numeroSinDuplicados));
    }
}
