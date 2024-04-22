package MetodoDeBusqueda;
public class binaria {

    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9};
        int valorBuscado = 10;

        int indiceEncontrado = busquedaBinaria(numeros, valorBuscado);

        if (indiceEncontrado != -1) {
            System.out.println("El valor " + valorBuscado + " se encuentra en el indice " + indiceEncontrado);
        } else {
            System.out.println("El valor " + valorBuscado + " no se encuentra en el array");
        }
    }

    private static int busquedaBinaria(int[] numeros, int valorBuscado) {
        int indiceInicio = 0;
        int indiceFin = numeros.length - 1;

        while (indiceInicio <= indiceFin) {
            int indiceCentral = (indiceInicio + indiceFin) / 2;

            if (numeros[indiceCentral] == valorBuscado) {
                return indiceCentral;
            } else if (numeros[indiceCentral] < valorBuscado) {
                indiceInicio = indiceCentral + 1;
            } else {
                indiceFin = indiceCentral - 1;
            }
        }

        return -1;
    }
}
