package practicas;

public class shellsort {

    public static void Ordenar(int[] lista) {
        int h = lista.length / 2;
        while (h > 0) {
            for (int i = h; i < lista.length; i++) {
                int actual = lista[i];
                int j = i;
                while (j >= h && lista[j - h] > actual) {
                    lista[j] = lista[j - h];
                    j -= h;
                }
                lista[j] = actual;
            }
            h /= 2;
        }
    }

    public static void main(String[] args) {
        int[] lista = {5, 2, 4, 6, 1, 3};
        System.out.println("Lista desordenada");
        for (int arreglo:lista) {
            System.out.print(arreglo + " ");
        }
        System.out.println(" ");
        
        Ordenar(lista);
        System.out.println("Lista ordenada: ");
        for (int num : lista) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
