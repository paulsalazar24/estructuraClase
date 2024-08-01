package Algoritmos;

public class promedio {
    
     public static void main(String[] args){
       int[] numeros = {10,20,30,40,50};
       double promedio = calcularPromedio(numeros);
         System.err.println("El promedio de la lista es: " + promedio);
    }
     
      public static double calcularPromedio(int[] numeros){
       int suma = 0;
       for (int num : numeros){
           suma += num;
       }
       return (double) suma / numeros.length;
    }
}
