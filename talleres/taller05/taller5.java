 

import java.util.Random;

public class taller5 {


    public static void main(String[] String) {
        int size = 20;
        int max = 30;
        int[] array = new int[size];
        for (int a = 0; a < size; a++) {
            Random generator = new Random();
            array[a] = generator.nextInt(max);
            long inicio = System.currentTimeMillis();
            System.out.println(suma(array));
            long fin = System.currentTimeMillis();
            long total = fin - inicio;
            System.out.println("el tiempo fue de" + total + " ms");
        }

    }
    /**
     * @param array es una arreglo de numeros enteros.
     * El método suma tiene la intención de hacer el proceso de suma
     * mediante una funcion cíclica (while/for/...)
     * @return la suma de todos los numeros sumados.
     */
    public static int suma (int[]array){
        int suma = 0;
        for(int i = 0; i < array.length; i++){
            suma+= array[i];
        }
        return suma;
    }


    /**
     * @param arreglo es un arreglo de números desordenados
     * El método insertionSort tiene la intención ordenar los números
     * del arreglo array por el método insertion:
     * @see <a href="https://www.youtube.com/watch?v=OGzPmgsI-pQ"> Insertion Sort <a/>
     * mediante la anidación de funciones cíclicas (while/for/...)
     *
     */
    public static void insertionSort (int[] arreglo){
        int n = arreglo.length;
        for(int i = 1; i < n; i++) // La barrita verde
            for(int j = i; j >= 0; j--) // Insertar en la parte ordenada
                bailar(arreglo, j, j-1);

    }
    public static void bailar (int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}