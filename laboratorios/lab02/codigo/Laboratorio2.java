package Laboratorio2;

/**
 * This code is a combination of the code taken from the teacher repository which does insertionSort and mergeSort
 * and the knowledge learned in class to measure times of an algorithm.
 * Title: Laboratorio 2 de Estructuras de Datos 1
 * Author: Mauricio Toro
 * Date: 2020
 * Version: 1
 * @author: Dayana Arrieta & Juan José Quintana.
 * @version: 1-2021
 */
    public class Laboratorio2{

    /**
     * This method sorts an array using insertionSort
     */
        public static void InsertionSort(int[] A)
        {
            int temp,j;
            for (int i = 0; i < A.length; i++)
            {
                j = i;
                while (j > 0 && A[j-1] > A[j])
                {
                    temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                    j = j-1;
                }
            }
            //System.out.println(Arrays.toString(A));
        }

        /**
         * This method sorts an array using mergeSort
         */

        public static void mergeSort(int [] a)
        {
            int[] tmp = new int[a.length];
            mergeSort(a, tmp,  0,  a.length - 1);
        }
        private static void mergeSort(int [] a, int [] tmp, int left, int right)
        {
            if( left < right )
            {
                int center = (left + right) / 2;
                mergeSort(a, tmp, left, center);
                mergeSort(a, tmp, center + 1, right);
                merge(a, tmp, left, center + 1, right);
            }
        }
        private static void merge(int[ ] a, int[ ] tmp, int left, int right, int rightEnd )
        {
            int leftEnd = right - 1;
            int k = left;
            int num = rightEnd - left + 1;

            while(left <= leftEnd && right <= rightEnd)
                if(a[left] <= a[right] )
                    tmp[k++] = a[left++];
                else
                    tmp[k++] = a[right++];
            while(left <= leftEnd)
                tmp[k++] = a[left++];

            while(right <= rightEnd)
                tmp[k++] = a[right++];

            for(int i = 0; i < num; i++, rightEnd--)
                a[rightEnd] = tmp[rightEnd];
        }
        
        /**
        * This is the main method to calculate the times of the algorithms
        */
        public static void main(String[] args){
            for(int n = 70000; n <= 270000; n = n + 10000){
                int[] array = new int[n];
                System.out.println("The insertSort array length is: " + n);
                array = generateArray(n);
                long ti = System.currentTimeMillis();
                Laboratorio2.InsertionSort(array);
                long tf = System.currentTimeMillis();
                System.out.println("and the time spent is: "+(tf - ti) + " ms");
            }
            for(int n = 7000000; n <= 27000000; n = n + 1000000){
                int[] array = new int[n];
                System.out.println("The mergeSort array length is: " + n);
                array = generateArray(n);
                long ti = System.currentTimeMillis();
                Laboratorio2.mergeSort(array);
                long tf = System.currentTimeMillis();
                System.out.println("and the time spent is: "+(tf - ti) + " ms");
            }
        }

    /**
     * This method generates and array with random numbers
     * Author: Simón Marín Giraldo
     * Date: 2021
     * Version: 1
     * @param n int
     */
        public static int [] generateArray(int n) {
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = (int) Math.round(Math.random()*10);
            }
            return arr;
        }
}

