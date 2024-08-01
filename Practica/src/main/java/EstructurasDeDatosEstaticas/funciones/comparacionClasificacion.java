
package EstructurasDeDatosEstaticas.funciones;

import java.util.Arrays;

public class comparacionClasificacion {
    public static void main(String[] args) {
        //Definimos una lista de números enteros desordenados
        int[] numeros ={5, 2, 8, 1, 9, 3};
        
        //Clasificamos los números en orden ascendente
        Arrays.sort(numeros);
        
        //Imprimimos la lista prdenada
        System.out.println("Lista de números ordenados:");
        for (int numero : numeros) {
            System.out.print(numero);
        }               
    }
}
