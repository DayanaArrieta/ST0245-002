/**
 * This class compute recursively (no loops) the count of the occurrences of 8 as a digit
 * except that an 8 with another 8 immediately to its left counts double
 * @author: Dayana Arrieta & Juan José Quintana.
 * @version: 26/02/2021
 */
public class Count8 {
    public int count8(int n) {
        int m = n/10;
        if(n<1) {
            return 0;
        }
        if (n%100 == 88) {
            return 2+count8(n/10);
        }
        else if(n%10 == 8){
            return 1+count8(n/10);
        }
        else{
            return count8(n/10);
        }
    }

}
