package practicas;
public class mergesort {
    public static void mergeSort(int[] lista) {
        if (lista.length > 1) {
            // Dividir
            int mitad = lista.length / 2;
            int[] izquierda = new int[mitad];
            int[] derecha = new int[lista.length - mitad];
            
            for (int i = 0; i < mitad; i++) {
                izquierda[i] = lista[i];
            }            
            for (int i = mitad; i < lista.length; i++) {
                derecha[i - mitad] = lista[i];
            }
            // Conquistar
            mergeSort(izquierda);
            mergeSort(derecha);
            // Combinar
            merge(izquierda, derecha, lista);
        }
    }
    private static void merge(int[] izquierda, int[] derecha, int[] lista) {
        int i = 0, j = 0, k = 0;
        while (i < izquierda.length && j < derecha.length) {
            if (izquierda[i] <= derecha[j]) {
                lista[k++] = izquierda[i++];
            } else {
                lista[k++] = derecha[j++];
            }
        }
        while (i < izquierda.length) {
            lista[k++] = izquierda[i++];
        }
        while (j < derecha.length) {
            lista[k++] = derecha[j++];
        }
    }
    public static void main(String[] args) {
        int[] lista = {5, 2, 4, 6, 1, 3};
        mergeSort(lista);
        System.out.print("Lista ordenada: ");
        for (int num : lista) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}