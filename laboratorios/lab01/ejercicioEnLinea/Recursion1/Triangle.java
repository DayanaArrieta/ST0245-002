/**
 * This class compute recursively the total number of blocks in a triangle with the given number of rows.
 * @author: Dayana Arrieta & Juan José Quintana.
 * @version: 26/02/2021
 */

public class Triangle {
    public int triangle(int rows) {
        if (rows == 0){
            return 0;
        }
        return triangle(rows-1) + rows;
    }
}