package practicas;
import java.util.Arrays;
public class test {

    public static void main(String[] args) {
        int[] data1 = generarDatosAleatorios(1000000);
        int[] data2 = Arrays.copyOf(data1, data1.length); // Copia de los datos para comparar algoritmos
        int[] data3 = Arrays.copyOf(data1, data1.length); // Copia de los datos para comparar algoritmos

        long startTime, endTime, duration;

        // QuickSort
        startTime = System.nanoTime();
        quicksort.quickSort(data1);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; // Duración en milisegundos
        System.out.println("QuickSort: " + duration + " ms");

        // ShellSort
        startTime = System.nanoTime();
        shellsort.Ordenar(data2);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; // Duración en milisegundos
        System.out.println("ShellSort: " + duration + " ms");

        // MergeSort
        startTime = System.nanoTime();
        mergesort.mergeSort(data3);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; // Duración en milisegundos
        System.out.println("MergeSort: " + duration + " ms");
    }

    // Método para generar datos aleatorios
    public static int[] generarDatosAleatorios(int tamaño) {
        int[] datos = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            datos[i] = (int) (Math.random() * 1000); // Números aleatorios entre 0 y 999
        }
        return datos;
    }
}