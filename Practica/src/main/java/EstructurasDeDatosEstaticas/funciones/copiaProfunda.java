
package EstructurasDeDatosEstaticas.funciones;

public class copiaProfunda {
    public static void main(String[] args) {
        //Numero original
        int numeroOriginal = 5;
        
        //Copia profunda
        int numeroCopia = numeroOriginal;
        
        System.out.println("Numero original: " + numeroOriginal);
        System.out.println("Numero copia: " + numeroCopia);
        
        //Modificamos la copua
        numeroCopia = 10;
        
        //Imprimimos el numero orignial y la copia
        System.out.println("Numero original: " + numeroOriginal);
        System.out.println("Numero copia: " + numeroCopia);
    }
}
