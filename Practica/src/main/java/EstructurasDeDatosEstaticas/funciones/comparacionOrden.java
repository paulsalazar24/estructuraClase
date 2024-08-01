
package EstructurasDeDatosEstaticas.funciones;


public class comparacionOrden {
    public static void main(String[] args) {
        //Definimos 2 numero enteros
        int numero1 = 10;
        int numero2 = 5;
        
        //Comparacion de orden utilizando el operador <
        if (numero1 < numero2){
            System.out.println(numero1 + "es menor que " + numero2);
        } else if (numero1 > numero2){
            System.out.println(numero1 + "es mayor que " + numero2);
        } else {
            System.out.println(numero1 + "es igual " + numero2);
        }
    }
}
