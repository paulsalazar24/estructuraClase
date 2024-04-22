package EstructurasDeDatos;

public class EstructuraMatrizEsta {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3]; // Crear una matriz de 3x3

        // Llenar la matriz con el producto de sus índices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (i + 1) * (j + 1);
            }
        }

        // Imprimir la matriz
        System.out.println("Tabla de Multiplicar:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
