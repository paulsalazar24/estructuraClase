
package EstructurasDeDatosEstaticas.funciones;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import static java.util.Spliterators.iterator;

public class Funciones {

    public static void main(String[] args) {
        //recorrido con bucle while
        List<Integer>lista = Arrays.asList(1, 2, 3, 4, 5);
        Iterator<Integer> iterator = lista.iterator();
        while (iterator.hasNext()){
            int num = iterator.next();
            System.out.println(num);
        }
    }
}
