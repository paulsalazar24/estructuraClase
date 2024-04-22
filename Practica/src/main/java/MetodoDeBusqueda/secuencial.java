package MetodoDeBusqueda;

public class secuencial {

    public static void main(String[] args) {
        int[] numeros = {1, 5, 3, 2, 4};
        int valorBuscado = 5;

        int indiceEncontrado = -1;

        // Recorremos el array
        for (int i = 0; i < numeros.length; i++) {
            // Si el elemento actual es igual al valor buscado
            if (numeros[i] == valorBuscado) {
                indiceEncontrado = i;
                break;
            }
        }

        if (indiceEncontrado != -1) {
            System.out.println("El valor " + valorBuscado + " se encuentra en el indice " + indiceEncontrado);
        } else {
            System.out.println("El valor " + valorBuscado + " no se encuentra en el array");
        }
    }
}
