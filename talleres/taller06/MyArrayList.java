package Taller6;
import java.util.Arrays;
/**
 * La clase MiArrayList tiene la intención de representar un objeto que simule el comportamiento
 * de la clase ya implementada "ArrayList"
 * es claro que no se puede utilizar dicha estructura ya utilizada dentro de este ejercicio.
 * Para más información de la clase ArrayList:
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html"> Ver documentacion ArrayList </a>
 * @author Mauricio Toro, Andres Paez
 * @version 1
 */
    public class MyArrayList {
        private int size;
        private static final int DEFAULT_CAPACITY = 10;
        private int elements[];
        /**
         * El metodo constructor se utiliza para incializar
         * variables a valores neutros como 0 o null.
         * El contructor no lleva parámetros en este caso.
         */
        public MyArrayList() {
            size = 0;
            elements = new int[DEFAULT_CAPACITY];
        }
        /**
         * Tiene la intención de retornar la longitud del objeto
         * @return longitud del objeto
         *
         * El size esta influenciado por las funciones add y del
         */
        public int size() {
            return size;
        }
        /**
         * @param e el elemento a guardar
         * Agrega un elemento e a la última posición de la lista
         *
         */
        public void add(int e) {
            if (size == elements.length){ // O(n)
                int[] nuevo = new int[elements.length+10]; //por defecto, es *2.0
                for(int i = 0; i < elements.length; i++)
                    nuevo[i] = elements[i]; // copiar n elementos, se hace en n pasos
                elements = nuevo;
            }
            else
                elements[size] = e;
            size = size + 1;
        }

        /**
         * @param i es un íncide donde se encuentra el elemento posicionado
         * Retorna el elemento que se encuentra en la posición i de la lista.
         *
         */
        public int get(int i) {
            return i;
        }

        /**
         * @param index es la posicion en la cual se va agregar el elemento
         * @param e el elemento a guardar
         * Agrega un elemento e en la posición index de la lista
         *
         */
        public void add(int index, int e) {
            elements[index] = e;
            size = size + 1;
        }
        /**
         * @param index es la posicion en la cual se va eliminar el elemento
         *
         * ELimina el elemento  en la posición index de la lista
         *
         */
        public void del(int index){
            elements.remove(index);
            size = size - 1;
        }
    }


