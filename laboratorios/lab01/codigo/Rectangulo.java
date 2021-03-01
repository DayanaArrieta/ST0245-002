package Laboratorio1;
/**
 * This is a recursive algorithm that finds how many ways it can
 * Fill a 2xn cm2 rectangle with 1x2 cm² rectangles.
 * @author: Dayana Arrieta & Juan José Quintana.
 * @version: 26/02/2021
 */
public class Rectangulo {
    public static void main(String args[]) {

    }

    public double fillRectangle(int n){
        if(n > 1)
        {
            return fillRectangle(n-2) + fillRectangle(n-1);
        }
        return 1;
    }

}