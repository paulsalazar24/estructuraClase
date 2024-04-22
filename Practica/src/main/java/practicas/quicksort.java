package practicas;

public class quicksort {
    
      public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = particionar(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int particionar(int[] arr, int low, int high) {
        int pivote = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivote) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] data = {5, 3, 2, 1, 0, 4, 6};
        
        System.out.println("Arreglo original");
        for (int date : data) {
            System.out.print(date + " ");
        }
        System.out.println("");

        quickSort(data, 0, data.length - 1);
        System.out.println("Arreglo ordenado: ");
        for (int i : data) {
            System.out.print(i + " ");
        }
    }
}
