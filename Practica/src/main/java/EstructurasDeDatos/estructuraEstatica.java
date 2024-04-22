
package EstructurasDeDatos;

public class estructuraEstatica {
      public static void main(String[] args) {
        int[] arreglo = new int[5]; // Crear un arreglo de tamaño 5

        // Asignar valores al arreglo
        arreglo[0] = 10;
        arreglo[1] = 20;
        arreglo[2] = 30;
        arreglo[3] = 40;
        arreglo[4] = 50;

        // Acceder e imprimir elementos del arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Elemento " + i + ": " + arreglo[i]);
        }
    }
}
